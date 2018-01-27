package mayphoo.mpk.tedAssignment.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mayphoo.mpk.tedAssignment.network.TedDataAgent;
import mayphoo.mpk.tedAssignment.network.TedDataAgentImpl;

/**
 * Created by User on 1/26/2018.
 */

@Module
public class NetworkModule {

    @Provides
    @Singleton
    public TedDataAgent provideTedDataAgent() {
        return new TedDataAgentImpl();
    }
}
