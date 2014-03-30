package cn.edu.buct.zm.java;
/**
 * Created by DaiLiang on 14-3-25.
 */
//
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
