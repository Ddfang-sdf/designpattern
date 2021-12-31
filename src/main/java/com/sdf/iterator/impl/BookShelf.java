package com.sdf.iterator.impl;

import com.sdf.iterator.api.Aggregate;
import com.sdf.iterator.api.Iterator;
import com.sdf.iterator.entity.Book;

public class BookShelf implements Aggregate {

    private Book[] books;

    private int last = 0;

    public BookShelf(int maxsize) {
        books = new Book[maxsize];
    }

    public void appendBook(Book book){
        books[last] = book;
        last++;
    }

    public Book getAt(int index){
        return books[index];
    }

    public int length(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
