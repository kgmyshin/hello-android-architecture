package kgmyshin.helloandroidarchtecture.infra.repository;

import kgmyshin.helloandroidarchtecture.domain.entity.User;
import kgmyshin.helloandroidarchtecture.domain.repository.UserRepository;

/**
 * Created by kgmyshin on 15/06/14.
 */
public class UserRepositoryImpl implements UserRepository {

    @Override
    public User me() {
        return new User("dummy", "dumiyama");
    }
}
