package com.sujith.prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        //network or database call
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("Book " + i);
            getBooks().add(b);
        }
    }

    //Shallow cloning
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //deep cloning
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        for (Book b : this.getBooks()) {
            bs.getBooks().add(b);
        }
        return bs;
    }
}
