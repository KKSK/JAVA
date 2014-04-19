import com.sun.org.apache.regexp.internal.recompile;

import java.util.Scanner;

/**
 * Created by Administrator on 14-4-19.
 */
public class RecursiveTest {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        System.out.println(recursive(s));
    }

    public static int recursive(int s) {
        for (int i = 0; i < s; i++) {
            if (s == 1 || s == 2) {
                return 1;
            } else {
                return recursive(s - 1) + recursive(s - 2);
            }
        }
        return recursive(s);
    }
}
