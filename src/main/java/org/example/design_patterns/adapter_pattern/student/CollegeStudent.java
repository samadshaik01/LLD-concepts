package org.example.design_patterns.adapter_pattern.student;

public class CollegeStudent {
    private final String StudentFirstName;
    private final String StudentLastName;
    private final String StudentEmail;

    public CollegeStudent(String studentEmail, String studentFirstName, String studentLastName) {
        StudentEmail = studentEmail;
        StudentFirstName = studentFirstName;
        StudentLastName = studentLastName;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "StudentEmail='" + StudentEmail + '\'' +
                ", StudentFirstName='" + StudentFirstName + '\'' +
                ", StudentLastName='" + StudentLastName + '\'' +
                '}';
    }

    public String getStudentFirstName() {
        return StudentFirstName;
    }

    public String getStudentLastName() {
        return StudentLastName;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }
}
