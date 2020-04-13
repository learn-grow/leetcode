package com.lock.demo;

/**
 * @author: lisy
 * @version: : FininalTest , v0.1 2020年04月12日 5:06 下午
 * @remark: the FininalTest is
 */
public class FininalTest {

    private final int count;

    private final Value value;


    public FininalTest(int count,Value value) {
        this.count = count;
        this.value = value;
    }

    public static void main(String[] args) {
        Value value = new Value(10);
        FininalTest test = new FininalTest(1,value);
        System.out.println(test.count);
        System.out.println(test.value.getCount());
        value.setCount(11);
        System.out.println(test.value.getCount());

    }
}

class Value{
    int count = 0;

    public Value(int val){
        this.count = val;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
