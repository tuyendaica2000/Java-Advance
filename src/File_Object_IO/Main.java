package File_Object_IO;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        /*
         * Khởi tạo file mới: FileInputStream
         * Tạo ra file copy có chứa luôn nội dung của file cũ: FileOutputStream
         * */
//        FileInputStream fileInputStream = null;
//        FileOutputStream fileOutputStream = null;
//        try {
//            fileInputStream = new FileInputStream("vidufile.txt");
//            fileOutputStream = new FileOutputStream ("vidufile_cp.txt");
//            int ch;
//            while ((ch = fileInputStream.read()) != -1) {
//                System.out.print((char)ch);
//                fileOutputStream.write(ch);
//            }
//        } catch (FileNotFoundException e){
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (fileInputStream != null){
//                try {
//                    fileInputStream.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            if (fileOutputStream != null){
//                try {
//                    fileOutputStream.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

        // Sử dụng trong file text, file "binary" không sử dụng được.
//        FileReader reader = null;
//        FileWriter writer = null;
//        try {
//            reader = new FileReader("vidufile.txt");
//            writer = new FileWriter("vidufile_copy2.txt");
//            int ch;
//            while ((ch = reader.read()) != -1){
//                System.out.print((char) ch);
//                writer.write(ch);
//            }
//            System.out.println((char)ch);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (reader != null){
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            if (writer != null){
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }


        //Next
        //Đọc dữ liệu nhanh hơn khi đó ta sẽ sử dụng Buffer
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream("vidufile.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            //file có dung lượng: 1mb
            byte[] data = new byte[1024];
            int length = bufferedInputStream.read(data);

            //Tối ưu không có để lại kí tự thừa khi không dung lượng k đủ 1mb.
            String result = new String(data, 0, length);
            System.out.println(result);
        } catch (Exception e){

        }finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
