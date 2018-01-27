package mayphoo.mpk.tedAssignment.network;

import android.content.Context;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
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
    public void loadTalks(String accessToken, int pageNo, Context context) {

    }
}
