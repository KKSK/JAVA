package cn.edu.buct.zm.java;

import java.util.Scanner;

/**
 * Created by Administrator on 14-4-20.
 */
//题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完数。

public class Test9 {
    public static void main(String[] args) {
        System.out.println("求给定正整数区间内的完数，请输入最大值:");
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        for (int i = 1; i <=s; i++) {
            getPrefectNumber(i);
        }
    }

    public static void getPrefectNumber(int num){
        int sum=0;
        for (int i = 1; i <num; i++) {
            if (num%i==0&&(num!=0)){
                sum+=i;
            }
        }
        if (sum==num){
            System.out.println(num);
        }
    }
}
