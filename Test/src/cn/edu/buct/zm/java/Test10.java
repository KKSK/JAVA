package cn.edu.buct.zm.java;

import java.util.Scanner;

/**
 * Created by Administrator on 14-4-20.
 */

//题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
//    n=1 s1=h=100;
//n=2 s2=h+h/2+h/2=100+50+50=200;
//n=3 s3=S2+(h/2)/2+(h/2)/2=250;
public class Test10 {
    public static void main(String[] args) {
        System.out.println("请输入球地次数：");
        int n =new Scanner(System.in).nextInt();
        System.out.println("请输入球的初始高度：");
        double h =new Scanner(System.in).nextDouble();
        distance(n,h);
    }
public  static void distance(int num,double height){
    double sum=0;
    for (int i = 1; i <=num; i++) {
        if(i==1){
            sum=height;
        }  else {
            height=height/2;
            sum+=height*2;
        }
    }
    System.out.println("球在第"+num+"次落地时共经过"+sum+"米");
}
}
