package cn.edu.buct.zm.java;
//测试
/**
 * Created by Administrator on 14-3-30.
 */
public class Test1 {
    public static void main(String[] args) {
        int number1=1;
        int number2=1;
        int month=1;
        int s=0;
        for(month=1;month<=40;month++){
            if (month<3){
                s=1;
            }
            else {
                s=number2;
                number2+=number1;
                number1=s;
            }
            System.out.println("第"+month+"月:"+number2);
        }
    }
}