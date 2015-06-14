package kgmyshin.helloandroidarchtecture.infra;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import kgmyshin.helloandroidarchtecture.domain.repository.UserRepository;
import kgmyshin.helloandroidarchtecture.infra.repository.UserRepositoryImpl;

/**
 * Created by kgmyshin on 15/06/14.
 */
@Module
public class InfraModule {

    @Provides
    @Singleton
    public UserRepository provideUserRepository() {
        return new UserRepositoryImpl();
    }

}
