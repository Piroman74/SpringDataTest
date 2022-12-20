package com.example.springdatatest.teaching.patterns.singleton;

public class Database {
    private static Database instance; // ленивая инициализация

    private Database() {
    }

    public static Database getDatabase() {
        if (instance == null) {
            instance = new Database(); // если тру то проинициализировать
        }
        return instance; // в противном случае вернуть ранее созданный объект
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Database database = Database.getDatabase();
        Database database2 = Database.getDatabase();
        System.out.println(database==database2);
    }
}