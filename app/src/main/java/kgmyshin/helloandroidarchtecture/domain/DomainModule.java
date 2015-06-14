package kgmyshin.helloandroidarchtecture.domain;

import dagger.Module;
import dagger.Provides;
import kgmyshin.helloandroidarchtecture.domain.repository.UserRepository;
import kgmyshin.helloandroidarchtecture.domain.usecase.GetMyNameUseCase;
import kgmyshin.helloandroidarchtecture.domain.usecase.GetMyNameUseCaseImpl;

/**
 * Created by kgmyshin on 15/06/14.
 */
@Module
public class DomainModule {

    @Provides
    public GetMyNameUseCase provideGetMyNameUseCase(UserRepository userRepository) {
        return new GetMyNameUseCaseImpl(userRepository);
    }

}
