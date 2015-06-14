package kgmyshin.helloandroidarchtecture;

import javax.inject.Singleton;

import dagger.Component;
import kgmyshin.helloandroidarchtecture.domain.DomainModule;
import kgmyshin.helloandroidarchtecture.infra.InfraModule;
import kgmyshin.helloandroidarchtecture.presentation.PresentationComponent;

/**
 * Created by kgmyshin on 15/06/14.
 */
@Singleton
@Component(
        modules = {
                InfraModule.class,
                DomainModule.class,
                AppModule.class
        }
)
public interface AppComponent extends PresentationComponent {
}