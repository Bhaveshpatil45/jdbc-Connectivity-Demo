package com.finance.model;

import java.util.Date;

public class Transaction {
    private long id;
    private double amount;
    private String type;
    //Expense
    private String category;
    private Date date;
    private String description;
    private Users users;

    public Transaction() {
    }

    public Transaction(long id, double amount, String type, String category, Date date, String description, Users users) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.date = date;
        this.description = description;
        this.users = users;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Users getUser() {
        return users;
    }

    public void setUser(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", user=" + users +
                '}';
    }
}
