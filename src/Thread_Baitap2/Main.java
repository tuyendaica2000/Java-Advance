package Thread_Baitap2;

/* ~~~~~~~~~~~~~~~~~~ BÀI  TOÁN ~~~~~~~~~~~~~~~~~~~~~

* Cho 1 danh sách các họ tên sinh viên
    Ví dụ: {"Nguyen Ngoc Lan", "Duong Tien Nam", "Ngo Anh Quan", "Pham Van Duc", "Tran Thu Ha"}
* Một danh sách khác là quê tương ứng của các sinh viên trên
    Ví dụ: {"Hải Phòng", "Hà Nội", "Thái Nguyên", "Hà Tĩnh", "Quảng Ninh"}
* Viết 1 ứng dụng JAVA sử dụng Thread để thực hiện công việc:
        - Thread thứ nhất sau mỗi giây sẽ hiển thị tên 1 ng tương ứng trong danh sách tên.
        - Thread thứ hai ngay sau đó sẽ hiển thị quê tương ứng của người đó.
        - 2 Thread thực hiện mỗi Thread 5 lần sẽ dừng lại

        ===== PHẢI ĐẢM BẢO RẰNG THREAD 1 LUÔN ĐƯỢC CHẠY TRƯỚC RỒI MỚI ĐẾN THREAD 2 =====
* */

public class Main {
    public static void main(String[] args) {
        SharedDATA sharedDATA = new SharedDATA();
            // ĐỒNG BỘ LUỒNG
        thread1 t1 = new thread1(sharedDATA);
        thread2 t2 = new thread2(sharedDATA);
        t2.start();
        t1.start();
    }
}
