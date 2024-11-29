package Thread_Baitap1;
/* ~~~~~~~~~~~~~~~~~~ BÀI  TOÁN ~~~~~~~~~~~~~~~~~~~~~

* Tạo lớp Thread1 kế thừa Thread gồm các thuộc tính ArrayList<Integer> list1
* -- Thread này thực hiện sau 1s sinh ngẫu nhiên các số tự nhiên chạy từ 0-100--> Lưu kqua vào mảng list1
* Tạo lớp Thread2 kế thừa Thread gồm các thuộc tính ArrayList<Integer> list2
* -- Thread này thực hiện sau 2s sinh ngẫu nhiên các ký tự ngẫu nhiên từ a-z --> Lưu kqua vào mảng list2
* Trong phương thức main của lớp Test tạo ra 2 Thread t1, t2 lần lượt từ Thread1, Thread2
* --> Khi t1 đã sinh 10 lần ==> THỰC HỆN DỪNG t1
* --> Khi t2 đã sinh được 10 ký tự ==> STOP t2
* Sau khi 2 Thread 1 và 2 kết thúc, thực hiện in kết quả của các Thread trên thread main.

* */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        //Hiển thị kết  quả sinh ngẫu nhiên của 2 thằng Thread1, 2
        System.out.println("Hiển thị kết quả sinh ngẫu nhiên của 2 Thread: 1 và 2");
        System.out.println("t1: ");
        for (int i = 0; i < t1.list.size(); i++){
            System.out.print(" "+t1.list.get(i));
        }
        System.out.println("\nt2: ");
        for (int i = 0; i < t2.list.size(); i++){
            System.out.print(" "+t2.list.get(i));
        }
    }
}
