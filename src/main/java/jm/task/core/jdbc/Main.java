package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Димон", "Петров", (byte) 25);
       userService.saveUser("Анатолий", "Кутузов", (byte) 30);
       userService.saveUser("Михаил", "Иванов", (byte) 35);
       userService.saveUser("Борис", "Попов", (byte) 40);

       userService.getAllUsers().forEach(System.out::println);


       userService.cleanUsersTable();
       userService.dropUsersTable();
    }
}

