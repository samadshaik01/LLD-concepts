package org.example.design_patterns.factory_pattern;

public class Main   {

    public static void main(String[] args) {
        SchoolFactory schoolFactory = new SchoolFactoryImpl();

        School student = schoolFactory.createSchoolMember("student");
        student.getDetails();
        School teacher = schoolFactory.createSchoolMember("teacher");
        teacher.getDetails();


    }
}
