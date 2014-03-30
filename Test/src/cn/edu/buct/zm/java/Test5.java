package cn.edu.buct.zm.java;

import java.util.Scanner;

/**
 * Created by DaiLiang on 14-3-27.
 */
import java.util.*;
import java.util.Scanner;
public class Test5 {
        public static void main(String[]args){
            System.out.println("请输入成绩:");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            grade(n);
        }
        //成绩计算器
        private static void grade(int n){
            if(n>100||n<0){
                System.out.println("输入无效!");
            }else{
                String str= (n>=90)?"分,属于A等":(n>=60)?"分,属于B等":"分,属于C等";
                System.out.println(n+str);
            }
        }
    }