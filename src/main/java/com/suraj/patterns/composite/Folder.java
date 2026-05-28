package com.suraj.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {

    private String folderName;

    private List<FileSystemItem> fileSystem = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public int getSize() {

        int totalSize = 0;

        for (FileSystemItem item : fileSystem) {
            totalSize += item.getSize();
        }

        return totalSize;
    }

    public void add(FileSystemItem item) {
        fileSystem.add(item);
    }

    @Override
    public void showDetails(String indent) {

        System.out.println(indent + "+ " + folderName + " (" + getSize() + " MB)");

        for (FileSystemItem item : fileSystem) {

            item.showDetails(indent + "    ");
        }
    }
}