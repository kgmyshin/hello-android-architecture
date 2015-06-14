package kgmyshin.helloandroidarchtecture;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kgmyshin on 15/06/14.
 */
@Module
public class AppModule {

    private Application app;

    public AppModule(Application app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return app;
    }

}
