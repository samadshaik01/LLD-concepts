package org.example.design_patterns.adapter_pattern.student;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

        SchoolStudent schoolStudent = new SchoolStudent("samad.shaik@gmail.com", "samad", "shaik");
        studentList.add(schoolStudent);
        System.out.println("student name: " + schoolStudent.getFirstName() + " " + schoolStudent.getLastName());

        CollegeStudent collegeStudent = new CollegeStudent("samad.shaik@gmail.com", "samad", "shaik");
        studentList.add(new CollegeStudentAdapter(collegeStudent));
        //System.out.println("student name: " + collegeStudent.getFirstName() + " " + collegeStudent.LastName());
        Student collegeStudentAdapterobj = new CollegeStudentAdapter(collegeStudent);
        System.out.println("student name: " + collegeStudentAdapterobj.getFirstName() + " " + collegeStudentAdapterobj.getLastName());

        System.out.println("Student List: " + studentList);
    }
}
