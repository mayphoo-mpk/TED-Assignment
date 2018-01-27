package mayphoo.mpk.tedAssignment.dagger;

import javax.inject.Singleton;

import dagger.Component;
import mayphoo.mpk.tedAssignment.TedApp;

/**
 * Created by User on 1/26/2018.
 */

@Component(modules = {TedAppModule.class, UtilsModule.class, NetworkModule.class})
@Singleton
public interface TedAppComponent {

    void inject(TedApp app);

}
