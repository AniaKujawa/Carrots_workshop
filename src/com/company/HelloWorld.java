package com.company;

public class HelloWorld {

    public static void main(String[] args) {
        int i= 9;
        long ageOfUniverse = 67589862451643L;
        float a = 8.9f;
        double b = 8.9;
        char c = 'a';
        boolean isJavaFun = true;
        int d = 10;
        int e = 3;
        double f = d/ (double)e;
        String name = "Ania";
        int[] table = {1,2,3};
        double[] table2 = new double[10];
        table2[0] = 0.9;
        int[][] g = new int[3][];
        g[0] = new int[5];
        g[1] = new int[3];
        g[2] = new int[2];
        g[1][0] = 10;
        System.out.println(name);
        System.out.println(a==b);
        System.out.println(a !=b);
        System.out.println(true && true); //and
        System.out.println(true || false); //or
    }
}
