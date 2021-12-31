package com.sdf.composite;

public class Applicaition {
    public static void main(String[] args) {
        Directory rootDirectory = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDirectory.add(binDir);
        rootDirectory.add(tmpDir);
        rootDirectory.add(usrDir);
        binDir.add(new File("vi",10000));
        binDir.add(new File("latex",20000));
        rootDirectory.printList();
    }
}
