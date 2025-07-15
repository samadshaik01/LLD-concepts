package org.example.design_patterns.adapter_pattern.student;

public class CollegeStudentAdapter implements Student {

    private CollegeStudent collegeStudent;
    public CollegeStudentAdapter(CollegeStudent collegeStudent) {
        this.collegeStudent = collegeStudent;
    }

    @Override
    public String toString() {
        return "CollegeStudentAdapter{" +
                "collegeStudent=" + collegeStudent +
                '}';
    }

    @Override
    public String getFirstName() {
        return collegeStudent.getStudentFirstName();
    }

    @Override
    public String getLastName() {
        return collegeStudent.getStudentLastName();
    }

    @Override
    public String getEmail() {
        return collegeStudent.getStudentEmail();
    }
}
