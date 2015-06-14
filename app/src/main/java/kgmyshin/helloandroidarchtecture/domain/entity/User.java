package kgmyshin.helloandroidarchtecture.domain.entity;

/**
 * Created by kgmyshin on 15/06/14.
 */
public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
