package mayphoo.mpk.tedAssignment.network;

import android.content.Context;

import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;

import java.util.concurrent.TimeUnit;

import mayphoo.mpk.tedAssignment.events.RestApiEvents;
import mayphoo.mpk.tedAssignment.network.responses.GetTalkResponse;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by User on 1/26/2018.
 */

public class TedDataAgentImpl implements TedDataAgent {

    private TedAPI tedAPI;

    public TedDataAgentImpl() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://padcmyanmar.com/padc-3/ted/")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(okHttpClient)
                .build();

        tedAPI = retrofit.create(TedAPI.class);
    }


    @Override
    public void loadTalks(String accessToken, int pageNo, final Context context) {
        Call<GetTalkResponse> loadTalksCall = tedAPI.loadTalks(pageNo, accessToken);
        loadTalksCall.enqueue(new TedCallback<GetTalkResponse>(){
            @Override
            public void onResponse(Call<GetTalkResponse> call, Response<GetTalkResponse> response) {
                super.onResponse(call, response);
                GetTalkResponse getTalkResponse = response.body();
                if(getTalkResponse != null && getTalkResponse.getTedTalks().size() > 0) {
                    RestApiEvents.TalkDataLoadedEvent talkDataLoadedEvent = new RestApiEvents.TalkDataLoadedEvent(getTalkResponse.getPageNo(), getTalkResponse.getTedTalks(), context);
                    EventBus.getDefault().post(talkDataLoadedEvent);
                }
            }
        });
    }
}
