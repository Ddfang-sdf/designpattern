package com.sdf.composite;

import lombok.AllArgsConstructor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Directory extends Entry {

    private String name;
    private List<Entry> list = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {

        return list.stream().mapToInt(entry -> entry.getSize()).sum();


    }

//    @Test
//    public void test(){
//        System.out.println(Stream.of(1, 2, 4, 5).mapToInt(item -> item).sum());
//        System.out.println(Stream.of(1, 2, 4, 5).reduce(1,(a,b) -> a + b,(a,b) -> null));
//    }


    @Override
    public void add(Entry entry) {
        list.add(entry);
    }

    @Override
    protected void printList(String s) {
        System.out.println(s + "/" + this);
        list.stream().forEach(entry -> {
            entry.printList(s + "/" + name);
        });
    }
}
