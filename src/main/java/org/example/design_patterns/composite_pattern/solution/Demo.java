package org.example.design_patterns.composite_pattern.solution;


public class Demo {
    public static void main(String[] args) {
        Directory mainDirectory = new Directory("Main-Directory");
        File file1 = new File("File-1.txt");
        mainDirectory.add(file1);

        Directory subDirectory = new Directory("Sub Directory");
        File file2 = new File("File2.txt");
        subDirectory.add(file2);

        mainDirectory.add(subDirectory);

        mainDirectory.ls();
    }
}
