package com.lock.demo;

/**
 * @author: lisy
 * @version: : Book , v0.1 2020年04月12日 5:27 下午
 * @remark: the Book is
 */
public class Book {

    private final String TAG = "IT";

    private String name;

    private String author;

    public Book(){}

    public Book(String name,String author){
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "TAG='" + TAG + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    private String getStr(int i){
        switch (i){
            case 0:
                return "1";
            case 1:
                return "0";
            default:
                return "2";
        }
    }
}
