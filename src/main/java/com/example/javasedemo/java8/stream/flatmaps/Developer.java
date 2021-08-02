package com.example.javasedemo.java8.stream.flatmaps;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/08/02
 */
public class Developer {
    private Integer id;
    private String name;
    private Set<String> book;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }

    public  void addBook(String book){
        if(this.book==null){
            this.book=new HashSet<>();
        }
        this.book.add(book);
    }
}
