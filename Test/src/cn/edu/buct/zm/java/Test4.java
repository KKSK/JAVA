package cn.edu.buct.zm.java;

/**
 * Created by DaiLiang on 14-3-27.
 */
//public class Test4 {
//    public static void main(String[] args) {
//
//    }
//}


import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//这儿是要做输入验证的,不过我就略了吧!
        System.out.println("请输入数字");
        int num= scanner.nextInt();
        System.out.println("结果:");
        System.out.println(num+"="+getPrimeNumberStyle(num));
    }
    public static String getPrimeNumberStyle(int num){
        int temp=0;
        for (int i = 2; i < num+1; i++) {
            if(num%i==0&&i!=num){
                int n=num/i;
                return i+"*"+getPrimeNumberStyle(n);
            }
            temp=i;
        }
        return ""+temp;
    }
}