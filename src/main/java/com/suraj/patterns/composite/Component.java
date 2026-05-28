package com.suraj.patterns.composite;

public class Component {

    public static void main(String[] args) {

        Folder movies = new Folder("Movies");

        File kantara = new File("Kantara", 12);
        File dhoorandar = new File("Dhoorandar", 23);

        movies.add(kantara);
        movies.add(dhoorandar);

        Folder documents = new Folder("Documents");

        File doc1 = new File("doc1", 2);
        File doc2 = new File("doc2", 3);
        File doc3 = new File("doc3", 2);

        documents.add(doc1);
        documents.add(doc2);
        documents.add(doc3);

        Folder root = new Folder("Root");

        File notes = new File("notes", 10);

        root.add(notes);
        root.add(movies);
        root.add(documents);

        System.out.println("===========");

        root.showDetails("");

        System.out.println("===========");

        System.out.println("The size is :  " + root.getSize());
    }
}