package org.example.design_patterns.composite_pattern.solution;

public class File implements FileSystem {
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void ls() {
        System.out.println("File Name: " + fileName);
    }
}
