package mayphoo.mpk.tedAssignment.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mayphoo.mpk.tedAssignment.utils.ConfigUtils;

/**
 * Created by User on 1/26/2018.
 */

@Module
public class UtilsModule {

    @Provides
    @Singleton
    public ConfigUtils provideConfigUtils(Context context){
        return new ConfigUtils(context);
    }
}
