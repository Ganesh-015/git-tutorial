package com.ganesh.studentmanagement;

public class Student {
    private int id;
    private String name;
    private String course;
    public Student (int id,String name,String course){
        this.id=id;
        this.name=name;
        this.course=course;
    }
    public void displayStudents(){
        System.out.println(id+"");
        System.out.println(name);
        System.out.println(course);

    }
}
