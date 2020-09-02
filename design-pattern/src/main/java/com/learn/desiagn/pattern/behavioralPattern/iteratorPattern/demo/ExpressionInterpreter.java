package com.learn.desiagn.pattern.behavioralPattern.iteratorPattern.demo;

import org.checkerframework.framework.qual.LiteralKind;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: lisy
 * @version: : ExpressionInterpreter , v0.1 2020年06月03日 2:14 下午
 * @remark: the ExpressionInterpreter is 解释器模式
 */
public class ExpressionInterpreter {

    private static Deque<Long> numbers = new LinkedList<>();
    private Deque<Expression> numbers1 = new LinkedList<>();

    /**
     * 根据输入命令进行加减乘除
     * @param expression
     * @return
     */
    public static long interpret(String expression){
        String[] elements = expression.split(" ");
        int length = elements.length;
        for (int i = 0; i < (length + 1)/2 ; ++i){
            numbers.addLast(Long.parseLong(elements[i]));
        }

        for (int i = (length + 1) / 2; i < length; i++) {
            String operator = elements[i];
            boolean isValid = "+".endsWith(operator) || "-".equals(operator) || "*".equals(operator) || "/".equals(operator);
            if (!isValid){
                throw new RuntimeException("expression is invalid :" + expression);
            }

            long number1 = numbers.pollFirst();
            long number2 = numbers.pollFirst();
            long result = 0;
            switch (operator){
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    result = number1 / number2;
                    break;
            }
            numbers.addFirst(result);
        }
        if (numbers.size() != 1){
            throw new RuntimeException("expression is invalid :" + expression);
        }

        return numbers.pop();
    }

    /**
     * 扩展
     * @param experssion
     * @return
     */
    public long interpret1(String experssion){
        String[] elements = experssion.split(" ");
        int length = elements.length;
        for(int i = 0;i < (length + 1)/2;++i){
            numbers1.addLast(new NumberExpression(elements[i]));
        }

        for (int i = (length + 1)/2;i < length ;++i){
            String operator = elements[i];
            boolean isValid = "+".equals(operator) || "-".equals(operator) || "*".equals(operator) || "/".equals(operator);
            if (!isValid){
                throw new RuntimeException("EXPRESSION IS INVALID :" + experssion);
            }

            Expression exp1 = numbers1.pollFirst();
            Expression exp2 = numbers1.pollFirst();
            Expression combinedEXp = null;
            switch (operator){
                case "+":
                    combinedEXp = new AdditionExpression(exp1 , exp2);
                    break;
                case "-":
                    combinedEXp = new AdditionExpression(exp1 , exp2);
                    break;
                case "*":
                    combinedEXp = new AdditionExpression(exp1 , exp2);
                    break;
                case "/":
                    combinedEXp = new AdditionExpression(exp1 , exp2);
                    break;
            }

            long result = combinedEXp.interpret();
            numbers1.addFirst(new NumberExpression(result));
        }

        if (numbers1.size() != 1){
            throw new RuntimeException("expression is invalid :" + experssion);
        }

        return numbers1.pop().interpret();
    }


    public static void main(String[] args) {
        String expression = "1 2 3 + - +";
        long result = interpret(expression);
        System.out.println(result);
    }

}
