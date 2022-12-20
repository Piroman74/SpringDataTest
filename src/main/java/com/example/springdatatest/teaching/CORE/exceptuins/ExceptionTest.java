package com.example.springdatatest.teaching.CORE.exceptuins;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable t) {
            System.out.println("Thrrowable");
        } finally {
            System.out.println("Finally");
        }
    }
}
