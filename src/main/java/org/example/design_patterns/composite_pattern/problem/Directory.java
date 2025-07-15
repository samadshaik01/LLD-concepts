package org.example.design_patterns.composite_pattern.problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private final String name;
    //private File file;
    private final List<Object> directoryList;

    public Directory(String name) {
        this.name = name;
        directoryList = new ArrayList<>();
    }

    // Method to add files or directories to the current directory
    public void add(Object obj) {
        directoryList.add(obj);

    }

    //problem with this approch without composite design pattern
    //1. No Shared Abstraction :There’s no common interface for File and Directory, which means you can’t treat them uniformly.
    //2. Repetitive Type Checks :Operations like getSize() require repeated instanceof checks and downcasting — leading to duplicated and fragile logic.

    public void ls() {
        for (Object obj : directoryList) {
            if (obj instanceof File) {
                ((File) obj).ls();
            } else if (obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }
    }

    void getSize() {
        int size = 0;
        for (Object obj : directoryList) {
            if (obj instanceof File) {
                size += ((File) obj).getSize();
            } else if (obj instanceof Directory) {
                ((Directory) obj).getSize();
            }
        }
        System.out.println("Total size of directory " + name + " is: " + size);
    }
}
