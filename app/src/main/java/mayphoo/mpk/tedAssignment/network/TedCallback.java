package mayphoo.mpk.tedAssignment.network;

import org.greenrobot.eventbus.EventBus;

import mayphoo.mpk.tedAssignment.events.RestApiEvents;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by User on 2/1/2018.
 */

public class TedCallback<T extends TedResponse> implements Callback<T> {

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        TedResponse tedResponse = response.body();
        if(tedResponse == null){
            RestApiEvents.ErrorInvokingAPIEvent errorInvokingAPIEvent = new RestApiEvents.ErrorInvokingAPIEvent("No data could be loaded for now. Pls try again later");
            EventBus.getDefault().post(errorInvokingAPIEvent);
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        RestApiEvents.ErrorInvokingAPIEvent errorInvokingAPIEvent = new RestApiEvents.ErrorInvokingAPIEvent(t.getMessage());
        EventBus.getDefault().post(errorInvokingAPIEvent);
    }
}
