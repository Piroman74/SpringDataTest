package com.example.springdatatest.teaching.patterns.singleton;

public class Database {
    private static Database instance;

    private Database() {
    }

    public static Database getDatabase() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Database database = Database.getDatabase();
        Database database2 = Database.getDatabase();
        System.out.println(database==database2);
    }
}