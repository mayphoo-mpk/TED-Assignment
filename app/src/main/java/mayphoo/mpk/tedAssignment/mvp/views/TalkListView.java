package mayphoo.mpk.tedAssignment.mvp.views;

import java.util.List;

import mayphoo.mpk.tedAssignment.data.vo.TalkVO;

/**
 * Created by User on 1/26/2018.
 */

public interface TalkListView {

    void displayTalkList(List<TalkVO> talkList);
}
