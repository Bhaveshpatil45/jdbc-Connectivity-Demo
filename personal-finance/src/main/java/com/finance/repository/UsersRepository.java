package com.finance.repository;

import com.finance.model.Users;

import java.sql.*;
import java.util.Optional;


public class UsersRepository {
    private static final String JDBC_URL = "jdbc : postgresql://localhost:5432/finance";
    private static final String JDBC_USER = "postgres";
    private static final String JDBC_PASSWORD = "password";

    public void saveUser(Users user) throws SQLException{
        String query = "INSERT INTO users (username, password) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.executeUpdate();
        }
    }

    public Optional<Users> findByUsername(String username) throws SQLException{
        String query = "SELECT * FROM users WHERE username = ?";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Users user = new Users(resultSet.getLong("id"), resultSet.getString("username"), resultSet.getString("password"));
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
