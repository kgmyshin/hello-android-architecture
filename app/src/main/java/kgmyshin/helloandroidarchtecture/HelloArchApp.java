package kgmyshin.helloandroidarchtecture;

import android.app.Application;

import kgmyshin.helloandroidarchtecture.domain.DomainModule;
import kgmyshin.helloandroidarchtecture.infra.InfraModule;

/**
 * Created by kgmyshin on 15/06/14.
 */
public class HelloArchApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .infraModule(new InfraModule())
                .domainModule(new DomainModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
