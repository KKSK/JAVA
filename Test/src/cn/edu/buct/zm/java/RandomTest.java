package cn.edu.buct.zm.java;

import java.util.Random;

/**
 * Created by Administrator on 14-3-30.
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(100) + 1;
            System.out.println(r);
        }
    }
}
//
////使用Math类的方法实现
//class test100_MathRandom{
//    public static void main(String[] args) {
//      for(int i=0;i<10000;i++){
//          int r =(int)(Math.random()*100)+1;
//          System.out.println(r);
//      }
//
//        }
//    }

//////使用Math类的方法实现,正弦
//class test100_MathSin{}

