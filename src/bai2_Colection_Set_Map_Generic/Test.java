package bai2_Colection_Set_Map_Generic;

import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*File file = new File("Documenttt.txt");
        if (file.exists()) {
            System.out.println("Có");
        }
        else {
            System.out.println("không thấy");
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }*/
        String fileName = "Vidu.txt";
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream(fileName);
//            String str = "Hello world.";
//            byte[] data;
//            try {
//                data = str.getBytes("utf8");
//                fos.write(data);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (fos != null) {
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
        FileInputStream fis = null  ;
        try {
            fis = new FileInputStream(fileName);
            int code ;
            while ((code = fis.read()) != -1){
                //convert code  => ky tự tương tự
                char c = (char) code;
                System.out.print(c);
            }
        } catch (Exception e) {

        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
