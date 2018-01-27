package mayphoo.mpk.tedAssignment.delegates;

import android.content.Context;

import mayphoo.mpk.tedAssignment.data.vo.TalkVO;

/**
 * Created by User on 1/26/2018.
 */

public interface TalkDelegate {

    void onTapTalk(TalkVO talk);

    Context getContext();
}
