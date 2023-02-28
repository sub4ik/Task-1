package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Sub", "Tash", (byte)27);
        userService.saveUser("Tem", "Tash", (byte)25);
        userService.saveUser("Emir", "Ysman", (byte)15);
        userService.saveUser("Nolan", "Genius", (byte)55);

        List<User> users = userService.getAllUsers();
        users.forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();

    }

}
