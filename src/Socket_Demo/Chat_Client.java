package Socket_Demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Chat_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 3333);

        // Tạo 2 đối tượng: đọc và ghi socket
                        // Đọc dữ liệu.
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                        // Ghi dữ liệu.
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        while (true){
            //Truyền dữ liệu lên Server
            String str = sc.nextLine();

            //Ghi dữ liệu vào trong socket
            dataOutputStream.writeUTF(str);
            //Đẩy dữ liệu lên Server
            dataOutputStream.flush();
            if (str.equals("q")){
                break;
            }

            //Đọc dữ liệu từ Server gửi về
            String str2 = dataInputStream.readUTF();
            System.out.println("Server gửi cho bạn: " + str2);
        }
        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
    }
}
