package Socket_Demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chat_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3333);

        //Tạo đối tượng socket
        Socket socket = serverSocket.accept();

        // Nhận data từ Client gửi lên
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        Scanner sc = new Scanner(System.in);

        //Liên tục nhận dữ liệu từ Client gửi lên
        while (true){
            //Đọc dữ liệu từ Client gửi lên
            String str = dataInputStream.readUTF();
            if (str.equals("q")){
                break;
            }

            // Hiển thị thông tin khi đã nhận gửi lên
            System.out.println("Client gửi cho bạn: " + str);

            //Truyền dữ liệu từ Server về Client
            String str2 = sc.nextLine();

            //Ghi dữ liệu vào socket
            dataOutputStream.writeUTF(str2);

            //Đẩy dữ liệu lên
            dataOutputStream.flush();
        }
        dataOutputStream.close();
        dataInputStream.close();
        serverSocket.close();
        socket.close();
        // ==> lÚC NÀY TA SẼ TẠO 1 CLASS THỨ 2
    }
}
