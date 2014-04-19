package cn.edu.buct.zm.java;

/**
 * Created by DaiLiang on 14-3-25.
 */
//
//题目：判断101-200之间有多少个素数，并输出所有素数。
//        1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。


public class Test2 {
    public static void main(String[] args) {
        int i = 101;
        int m = 2;
        int counter = 1;
        for (i = 101; i <= 200; i++) {
            boolean b = true;
            for (m = 2; m < i; m++) {
                if (i % m == 0) {
                    b = false;
                    continue;
                }
            }
            if (b == true) {
                System.out.println(counter + ":" + i);
                counter++;
            }
        }
    }
}



