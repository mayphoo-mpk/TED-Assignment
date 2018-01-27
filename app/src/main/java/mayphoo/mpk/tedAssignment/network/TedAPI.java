package mayphoo.mpk.tedAssignment.network;

import mayphoo.mpk.tedAssignment.network.responses.GetTalkResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by User on 1/26/2018.
 */

public interface TedAPI {

    @FormUrlEncoded
    @POST("getTedTalks.php")
    Call<GetTalkResponse> loadTalks(@Field("page") int pageIndex,
                                    @Field("access_token") String accessToken);
}
