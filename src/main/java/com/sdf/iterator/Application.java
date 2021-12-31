package com.sdf.iterator;

import com.sdf.iterator.api.Iterator;
import com.sdf.iterator.entity.Book;
import com.sdf.iterator.impl.BookShelf;

public class Application {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("白夜行","东野圭吾"));
        bookShelf.appendBook(new Book("白鹿原","陈忠实"));
        bookShelf.appendBook(new Book("皮囊","蔡崇达"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
