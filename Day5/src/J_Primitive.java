/**
 * Created by Administrator on 14-4-12.
 */
public class J_Primitive {
    int a=0;
    public static void mb_method(J_Primitive j_primitive){
        System.out.println("在a++执行之前的a="+j_primitive.a);
        j_primitive.a++;
        System.out.println("在a++执行之后的a="+j_primitive.a);
    }

    public static void main(String[] args) {
        J_Primitive j_primitive=new J_Primitive();
        System.out.println("在调用方法之前a="+j_primitive.a);
        mb_method(j_primitive);
        System.out.println("在调用方法之后a="+j_primitive.a);
    }
}

