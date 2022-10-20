package com.example.springdatatest.teaching.collection;

import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        Map<Student, String> studentMap = new HashMap<>();
        Student s1 = new Student("Zak", 21);
        Student s2 = new Student("Bob", 32);
        Student s3 = new Student("Ann", 17);
        studentMap.put(s1, "Snyder");
        studentMap.put(s2, "Milk");
        studentMap.put(s3, "Stevens");
        s1.setName("POCHEMY");
        System.out.println(studentMap);
    }
}
final class Student {
    private  String name;
    private final int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
