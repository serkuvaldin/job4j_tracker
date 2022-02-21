package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setGroup(2222);
        student.setCreated(new Date());
        String ln = System.lineSeparator();
        System.out.println("Student name: " + student.getName() + ln
                            + "Group number: " + student.getGroup() + ln
                            + "Admission date: " + student.getCreated());
    }
}
