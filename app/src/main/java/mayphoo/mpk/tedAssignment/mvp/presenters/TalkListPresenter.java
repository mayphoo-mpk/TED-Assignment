package mayphoo.mpk.tedAssignment.mvp.presenters;

import android.content.Context;

import javax.inject.Inject;

import mayphoo.mpk.tedAssignment.TedApp;
import mayphoo.mpk.tedAssignment.data.models.TalkModel;
import mayphoo.mpk.tedAssignment.data.vo.TalkVO;
import mayphoo.mpk.tedAssignment.delegates.TalkDelegate;
import mayphoo.mpk.tedAssignment.mvp.views.TalkListView;

/**
 * Created by User on 1/26/2018.
 */

public class TalkListPresenter extends BasePresenter<TalkListView> implements TalkDelegate {

    @Inject
    TalkModel mTalkModel;

    public TalkListPresenter() {
    }

    @Override
    public void onCreate(TalkListView view) {
        super.onCreate(view);
        /*TedApp tedApp = (TedApp) mView.getContext();
        tedApp.get*/
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onTapTalk(TalkVO talk) {

    }

    @Override
    public Context getContext() {
        return null;
    }
}
