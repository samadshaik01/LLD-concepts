package org.example.design_patterns.composite_pattern.solution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private final String name;
    private final List<FileSystem> fileSystemList;

    public Directory(String name) {
        this.name = name;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }
    // What We Achieved with Composite
    // Unified treatment: Files and folders share a common interface, allowing polymorphism
    // Clean recursion: No instanceof, no casting — just delegation
    @Override
    public void ls() {
        for (FileSystem fileSystem : fileSystemList) {
            fileSystem.ls();
        }
    }
}
