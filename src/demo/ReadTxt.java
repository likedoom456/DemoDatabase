package demo;

import java.io.*;

/**
 * Created by Administrator on 2016/7/15.
 */
public class ReadTxt {
    private static final String ip = "C:\\Users\\Administrator\\Desktop\\ip1.txt";

    public static void main(String[] args) {
        int c = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ip));) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                c++;
//                System.out.print(str.substring(0,16));
//                System.out.print(str.substring(19,31));
                System.out.print(str.substring(31));
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(c);
    }

//    private static void save(String path) {
//        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));
//             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\new.txt"));) {
//            int str;
//            while ((str = bufferedInputStream.read()) != -1) {
//                bufferedOutputStream.write(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
