package com.lemon.day04.homework01;

public class CalculatorMethod {
    /**
     * @Project: lemon_auto_test
     * @Author: 皮皮
     * @Create: 2021-04-29 22:34
     * @Desc： 计算
     **/
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        Calculator cl = new Calculator();
        System.out.println(cl.Sum(a, b));//加法 7

        System.out.println(cl.Less(a, b));//减法 1
        System.out.println(cl.Multiply(a, b));//乘法 12
        System.out.println(cl.Division(a, b));//除法 1
    }

    public static  class Calculator {
        /**
         * @Project: lemon_auto_test
         * @Author: 皮皮
         * @Create: 2021-04-29 22:21
         * @Desc： 加减乘除
         **/
        int a;
        int b;

        public int Sum(int a, int b) {
            return a + b;
        }

        public int Less(int a, int b) {
            return a - b;
        }

        public int Multiply(int a, int b) {
            return a * b;
        }

        public int Division(int a, int b) {
            return a / b;
        }
    }
}
