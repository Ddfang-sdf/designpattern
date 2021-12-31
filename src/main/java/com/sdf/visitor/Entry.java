package com.sdf.visitor;

import com.sdf.visitor.framework.Element;
import com.sdf.visitor.framework.Visitor;

public abstract class Entry extends Element {
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