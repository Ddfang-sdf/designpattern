package com.sdf.iterator.impl;

import com.sdf.iterator.api.Aggregate;
import com.sdf.iterator.api.Iterator;

public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public Boolean hasNext() {
        return index < bookShelf.length();
    }

    @Override
    public Object next() {
        return bookShelf.getAt(index++);
    }
}
