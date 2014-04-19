package cn.edu.buct.zm.java;

import java.util.Scanner;

/**
 * Created by Administrator on 14-4-13.
 */

//题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
//        1.程序分析：关键是计算出每一项的值。


public class Test8 {
    public static void main(String[] args) {

        System.out.println("请输入a的值：");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("请输入计算次数：");
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        StringBuffer s = new StringBuffer();
        int sum=0;
        String[] temp = new String[n];
        for (int i = 0; i < n; i++) {
            s.append(a);
            temp[i] = s.toString();
            sum=sum+Integer.parseInt(temp[i]);//对字符串取整
        }
        System.out.print("s=");
        for (int i = 0; i < n; i++) {
            if (i == (n - 1)) {
                System.out.print(temp[i]);
            } else {
                System.out.print(temp[i] + "+");
            }
        }
        System.out.println("="+sum);
    }
}

