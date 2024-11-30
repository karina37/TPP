package ua.music;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        CommandControl parser = new CommandControl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command:");

        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            parser.executeCommand(command);
            System.out.println("Enter next command:");
        }

        scanner.close();
    }
}

