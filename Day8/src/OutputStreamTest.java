import java.io.*;

/**
 * Created by Administrator on 14-4-20.
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        InputStream inputStream = null;
        try {
            outputStream = new FileOutputStream("D:\\java\\1.java");
            inputStream = new FileInputStream("d:/java/2014/Zhoumo/Github/JavaSE/JAVA/Day8/src/OutputStreamTest.java");
            int i, j;
            while ((i = inputStream.read()) != -1) {

                outputStream.write((char) i);
            }
            InputStream inputStream1 = new FileInputStream("D:\\java\\1.java");
            while ((j = inputStream1.read()) != -1) {
                System.out.print((char) j);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
