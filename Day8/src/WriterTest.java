import java.io.*;

/**
 * Created by Administrator on 14-4-20.
 * 中文
 */
public class WriterTest {
    public static void main(String[] args) {
        Reader reader = null, reader1 = null;
        Writer writer = null;

        try {
            writer = new FileWriter("D:\\java\\2.java");
            reader = new FileReader("D:\\java\\2014\\Zhoumo\\Github\\JavaSE\\JAVA\\Day8\\src\\WriterTest.java");
            reader1 = new FileReader("D:\\java\\2.java");
            int i, j;
            while ((i = reader.read()) != -1) {
                writer.write((char) i);
            }
            writer.flush();
            while ((j = reader1.read()) != -1) {
                System.out.print((char) j);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (reader1 != null) {
                    reader1.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
