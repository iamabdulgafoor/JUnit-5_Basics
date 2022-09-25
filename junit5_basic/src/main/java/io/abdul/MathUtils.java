package io.abdul;

public class MathUtils {

    public int add(int a, int b){
        return a+b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public int[] multiply(int a, int b){
        int res = a * b;
        int[] arr = {a,b, res};
        return arr;
    }

    public double devide(int a, int b){
        return a/b;
    }

    public double computeCircleArea(double radius){

        return Math.PI * radius * radius;
    }
}
