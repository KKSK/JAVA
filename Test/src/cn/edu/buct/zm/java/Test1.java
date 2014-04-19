package cn.edu.buct.zm.java;

import java.util.Scanner;

/**
 * Created by Administrator on 14-3-30.
 */
//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
// 问每个月的兔子总数为多少？
// 1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....


public class Test1 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 1;
        int month = 1;
        int s = 0;
        for (month = 1; month <= 40; month++) {
            if (month < 3) {
                s = 1;
            } else {
                s = number2;
                number2 += number1;
                number1 = s;
            }
            System.out.println("第" + month + "月:" + number2);
        }
    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int m;
//        int number1 = 1;
//        int number2 = 1;
//        int s = 0;
//        System.out.println("请输入月份：");
//        int month = scanner.nextInt();
//        for (m = 3; m <= month; m++) {
//            if (month <= 0) {
//                System.out.println("输入值无意义！");
//            } else if (month > 0 & month < 3) {
//                s = 1;
//            } else {
//                s = number2;
//                number2 = number1 + number2;
//                number1 = s;
//
//            }
//
//
//        }
//        System.out.println("第" + month + "个月的兔子总量为:" + number2);
//    }
//}


    //使用递归
//    public static void main(String[] args) {
//        System.out.println("请输入一个数字");
//        Scanner scanner = new Scanner(System.in);
//        int s = scanner.nextInt();
//        System.out.println(recursive(s));
//    }
//
//    public static int recursive(int s) {
//        for (int i = 0; i < s; i++) {
//            if (s == 1 || s == 2) {
//                return 1;
//            } else {
//                return recursive(s - 1) + recursive(s - 2);
//            }
//        }
//        return recursive(s);
//    }
//}