package cn.edu.buct.zm.java;
/**
 * Created by DaiLiang on 14-3-25.
 */
//
//题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
//        1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。

public class Test3 {
    public static void main(String[] args) {
        int x, y, z;
        int m = 100;
        int counter = 1;
        boolean b = true;
        for (m = 100; m <= 999; m++) {
            b = true;
            x = m / 100;
            y = (m - x * 100) / 10;
            z = m - (x * 100) - y * 10;
            if (m == (x * x * x) + (y * y * y) + (z * z * z)) {
                System.out.println("第" + counter + "个:" + m);
                counter++;
            }
//        if (b) {
//            System.out.println("第" + counter + "个:" + m);
//
//        }
        }
    }
}
