package mayphoo.mpk.tedAssignment.network;

import android.content.Context;

/**
 * Created by User on 1/26/2018.
 */

public interface TedDataAgent {

    void loadTalks(String accessToken, int pageNo, Context context);
}
