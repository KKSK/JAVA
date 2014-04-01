package cn.edu.buct.zm.java;

import java.util.Scanner;

/**
 * Created by DaiLiang on 14-4-1.
 */
public class common_divisor_multiple {

    public static void main(String[] args) {
        int m,n,temp;
        System.out.println("请输入一个整数");
        Scanner scanner=new Scanner(System.in);
        m=scanner.nextInt();
        System.out.println("请再输入一个整数");
        n=scanner.nextInt();
if(m<=n){
    temp=m;
    m=n;
    n=temp;
}
        int product=m*n;
        while (n!=0){
            temp=n;
            n=m%n;//运行至最终，n=0;
            m=temp;
        }
        System.out.println("最大公约数为"+m);
        System.out.println("最小公倍数为"+product/m);

    }
}
