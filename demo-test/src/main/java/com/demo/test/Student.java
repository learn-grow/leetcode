package com.demo.test;

/**
 * @author: lisy
 * @version: : Student , v0.1 2020年06月05日 10:31 上午
 * @remark: the Student is
 */
public class Student {

    private String name;

    private int age;

    private float  weight;

    public Student(String name , int age ,float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
