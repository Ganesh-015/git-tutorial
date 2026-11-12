package com.ganesh.studentmanagement;

public class StudentService {
    StudentRepository repo= new StudentRepository();
    public Student getStudentDetails(){
        return repo.getStudent();
    }
}
