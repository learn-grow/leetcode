package com.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author: lisy
 * @version: : Demo , v0.1 2020年06月05日 10:31 上午
 * @remark: the Demo is collections sort 比较器 模板模式 ，将其中"比较大小"这部分逻辑委托给了用户来实现
 */
public class Demo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("alice" , 19, 89.0f));
        students.add(new Student("peter" ,20 ,78.0f));
        students.add(new Student("leo" , 18, 99.0f));

        Collections.sort(students , new AgeAscComparator());
        print(students);

        Collections.sort(students , new NameAscComparator());
        print(students);

        Collections.sort(students  , new weightDescComparator());
        print(students);

    }

    private static void print(List<Student> students) {
        students.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student.toString());
            }
        });
    }

    /**
     * 自定义年龄比较器
     */
    public static class AgeAscComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge() - o2.getAge();
        }
    }

    /**
     * 自定义名称比较器
     */
    public static class NameAscComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class weightDescComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            if (Math.abs(o1.getWeight() - o2.getWeight()) < 0.001){
                return 0;
            }else if (o1.getWeight() < o2.getWeight()){
                return 1;
            }else{
                return -1;
            }
        }
    }

}
