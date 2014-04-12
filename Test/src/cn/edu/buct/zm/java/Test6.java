package cn.edu.buct.zm.java;
/**
 * Created by DaiLiang on 14-3-27.
 */

import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        int m, n;
        System.out.println("求最大公约数与最小公倍数:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请键入一个整数");
        m = scanner.nextInt();
        System.out.println("请再键入一个整数");
        n = scanner.nextInt();
        int temp, gongyue, gongbei;
        if (m <= n) {
            temp = m;
            m = n;
            n = temp;
        }
        int product = m * n;
        while (n != 0) {
            temp = n;
            n = m % n;
            m = temp;
        }
        System.out.println("最大公约数为：" + m);
        System.out.println("最小公倍数为：" + product / m);

    }


}
