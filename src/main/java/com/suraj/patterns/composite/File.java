package com.suraj.patterns.composite;

public class File implements FileSystemItem {

    private String name;
    private int size;


    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "|-- " + name + " (" + getSize() + " MB)");
    }
}