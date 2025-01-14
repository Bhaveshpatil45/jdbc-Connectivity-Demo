package com.finance.repository;

import com.finance.model.Transaction;
import com.finance.model.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/finance";
    private static final String JDBC_USER = "postgres";
    private static final String JDBC_PASSWORD = "password";

    public void saveTransaction(Transaction transaction) throws SQLException{
        String query = "INSERT INTO transactions(amount, type, category, date, description, user_id) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDouble(1, transaction.getAmount());
            statement.setString(2, transaction.getType());
            statement.setString(3, transaction.getCategory());
            statement.setDate(4, new java.sql.Date(transaction.getDate().getTime()));
            statement.setString(5, transaction.getDescription());
            statement.setLong(6, transaction.getUser().getId());
            statement.executeUpdate();
        }
    }

    public List<Transaction> findTransactionsByUserId(long userId) throws SQLException {
        String query = "SELECT * FROM transactions WHERE user_id = ?";
        List<Transaction> transactions = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setLong(1, userId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Transaction transaction = new Transaction(
                        resultSet.getLong("id"),
                        resultSet.getDouble("amount"),
                        resultSet.getString("type"),
                        resultSet.getString("category"),
                        resultSet.getDate("date"),
                        resultSet.getString("description"),
                        new Users(userId, null, null) // Simplified for brevity
                );
                transactions.add(transaction);
            }
        }
        return transactions;
    }
}
