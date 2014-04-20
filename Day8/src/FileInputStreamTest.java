import java.io.*;

/**
 * Created by Administrator on 14-4-20.
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("d:/test.txt");
         int i;
            while ((i=inputStream.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
