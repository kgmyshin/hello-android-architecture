package kgmyshin.helloandroidarchtecture.domain.usecase;

import kgmyshin.helloandroidarchtecture.domain.entity.User;
import kgmyshin.helloandroidarchtecture.domain.repository.UserRepository;

/**
 * Created by kgmyshin on 15/06/14.
 */
public class GetMyNameUseCaseImpl implements GetMyNameUseCase {

    private UserRepository userRepository;

    public GetMyNameUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String getMyName() {
        User me = userRepository.me();
        String myName = me.getFirstName() + " " + me.getLastName();
        return myName;
    }
}
