package com.finance.model;

public class Budget {
    private long id;
    private String category;
    private double amount;
    private int month;
    private int year;
    private Users users;


    public Budget() {
    }

    public Budget(long id, String category, double amount, int month, int year, Users users) {
        this.id = id;
        this.category = category;
        this.amount = amount;
        this.month = month;
        this.year = year;
        this.users = users;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                ", month=" + month +
                ", year=" + year +
                ", users=" + users +
                '}';
    }
}
