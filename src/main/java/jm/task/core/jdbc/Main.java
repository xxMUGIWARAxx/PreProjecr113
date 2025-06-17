package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Zoro", "Roronoa", (byte) 22);
        userService.saveUser("Luffy", "Monkey D", (byte) 18);
        userService.saveUser("Sanji", "Vinsmoke", (byte) 24);
        userService.saveUser("Chopper", "Tony Tony", (byte) 8);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
