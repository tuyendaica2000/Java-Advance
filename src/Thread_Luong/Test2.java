package Thread_Luong;

public class Test2 {
    public static void main(String[] args) {
        //Tạo ra 1 đối tượng dùng để chia sẻ data
        SharedData sharedData = new SharedData();

        // Tạo 2 luồng: Random và luồng bình phương
        ThreadRandom threadRandom = new ThreadRandom(sharedData);
        ThreadSquare threadSquare = new ThreadSquare(sharedData);

        //Thực hiện quá trình cho chạy hàm này trước
        threadRandom.start();
        threadSquare.start();
    }
}
