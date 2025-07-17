package org.example.practice.composite_dp;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    List<Object> list = new ArrayList<>();
    String name;

    public Directory(String name) {
        this.name = name;
    }

    void add(Object ob) {
        list.add(ob);
    }

    void ls() {
        for (Object ob : list) {
            if (ob instanceof File) {
                ((File) ob).ls();
            } else {
                ((Directory) ob).ls();
            }
        }
    }
}
