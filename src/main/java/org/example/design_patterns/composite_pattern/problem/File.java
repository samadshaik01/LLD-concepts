package org.example.design_patterns.composite_pattern.problem;

public class File {
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }
    public void ls() {
        System.out.println("File Name: " + fileName);
    }

    public int getSize() {
        return 1; // Size in MB or any unit
    }
}
