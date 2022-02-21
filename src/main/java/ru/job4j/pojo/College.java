package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setGroup(2222);
        student.setCreated(new Date());

        System.out.println("Student name: " + student.getName() + "\n"
                            + "Group number: " + student.getGroup() + "\n"
                            + "Admission date: " + student.getCreated());
    }
}
