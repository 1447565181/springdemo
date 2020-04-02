package com.ybzy.springboot.springdemo.model;

import java.io.Serializable;

public class Books implements Serializable{
    private Integer id;
    private  String name;
    private  String author;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public Books() {
    }

    public Books(Integer id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}
