package cn.edu.buct.zm.java;

/**
 * Created by DaiLiang on 14-3-25.
 */
//
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



