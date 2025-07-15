package org.example.design_patterns.factory_pattern;

public class SchoolFactoryImpl implements SchoolFactory {


    @Override
    public School createSchoolMember(String member) {
        switch (member)
        {
            case "student":
                return new Student();
            case "teacher":
                return new Teacher();
            default:
                return null;
        }
    }
}
