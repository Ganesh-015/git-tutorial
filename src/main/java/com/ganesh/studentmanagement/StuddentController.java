package com.ganesh.studentmanagement;

public class StuddentController {
    StudentService service= new StudentService();
    public void controller(){
        Student  student = service.getStudentDetails();
        student.displayStudents();
    }
}
