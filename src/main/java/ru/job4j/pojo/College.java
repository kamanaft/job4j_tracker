package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student pupkin = new Student();
        pupkin.setName("Vasya Pupkin");
        pupkin.setYearOfEntry(2025);
        pupkin.setGroup("Technik");
        System.out.println("Имя: " + pupkin.getName() + ", Группа: " + pupkin.getGroup() + ", Год поступления: " + pupkin.getYearOfEntry());
    }
}
