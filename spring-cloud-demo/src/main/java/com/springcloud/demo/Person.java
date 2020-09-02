package com.springcloud.demo;

/**
 * @author: lisy
 * @version: : Person , v0.1 2020年09月01日 5:19 下午
 * @remark: the Person is
 */
public class Person {

    private int id;

    private String name;

    public Person(int id ,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
