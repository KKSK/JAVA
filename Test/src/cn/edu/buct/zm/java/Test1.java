package cn.edu.buct.zm.java;

import java.util.Scanner;

/**
 * Created by Administrator on 14-3-30.
 */
public class Test1 {
    public static void main(String[] args) {
        int number1=1;
        int number2=1;
        int month=1;
        int s=0;
        for(month=1;month<=40;month++){
            if (month<3){
                s=1;
            }
            else {
                s=number2;
                number2+=number1;
                number1=s;
            }
            System.out.println("第"+month+"月:"+number2);
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