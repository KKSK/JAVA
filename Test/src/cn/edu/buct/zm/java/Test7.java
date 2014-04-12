package cn.edu.buct.zm.java;

import java.util.Scanner;

/**
 * Created by Administrator on 14-4-12.
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println("请输入一段字符:");
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        System.out.println(p.length());
        char[] c = p.toCharArray();
        int sNumber = 0;
        int nNumber = 0;
        int cNumber = 0;
        int kNumber = 0;
        for (int i = 0; i < p.length(); i++) {
            if (c[i] == 32) {
                kNumber++;
            } else if ((c[i]>=65&&c[i]<=90)|(c[i]>=97&&c[i]<=122)){
                sNumber++;
            } else if ((c[i]>=48&&c[i]<=57)){
                nNumber++;
            } else {
                cNumber++;
            }
        }
        System.out.println("输入字符中空格个数为:"+kNumber);
        System.out.println("输入字符中字母个数为:"+sNumber);
        System.out.println("输入字符中数字个数为:"+nNumber);
        System.out.println("输入字符中字符个数为:"+cNumber);
    }
}
