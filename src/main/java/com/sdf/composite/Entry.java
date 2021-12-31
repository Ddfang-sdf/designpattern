package com.sdf.composite;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public void add(Entry entry){
        throw new FileTreatmentException();
    }

    public void printList(){
        printList("");
    }

    protected abstract void printList(String s);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}

class FileTreatmentException extends RuntimeException{
    public FileTreatmentException() {
    }

    public FileTreatmentException(String message) {
        super(message);
    }
}