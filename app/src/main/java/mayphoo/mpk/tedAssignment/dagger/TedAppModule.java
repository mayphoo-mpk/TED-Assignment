package mayphoo.mpk.tedAssignment.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mayphoo.mpk.tedAssignment.TedApp;
import mayphoo.mpk.tedAssignment.data.models.TalkModel;
import mayphoo.mpk.tedAssignment.mvp.presenters.TalkListPresenter;

/**
 * Created by User on 1/26/2018.
 */

@Module
public class TedAppModule {

    private TedApp mApp;

    public TedAppModule(TedApp application){
        mApp = application;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return mApp.getApplicationContext();
    }

    @Provides
    @Singleton
    public TalkModel provideTalkModel(Context context){
        return new TalkModel(context);
    }

    public TalkListPresenter provideTalkListPresenter() {
        return new TalkListPresenter();
    }

}
