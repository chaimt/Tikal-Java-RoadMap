package main.java.com.turel;

import java.lang.Integer;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Haim.Turkel on 12/30/2015.
 */
public class OptionsTest {


    static class User{
        String firstName;
        String lastName;

        public User(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public static void main(String[] args) {

        Map<String,User> users = new HashMap<>();
        users.put("chaim", new User("chaim", "turkel"));
        Optional<User> user = Optional.ofNullable(users.get("chaim"));
        user.map(u -> u.lastName).ifPresent(s -> System.out.print(s));
//        user.orElseGet()
    }
}
