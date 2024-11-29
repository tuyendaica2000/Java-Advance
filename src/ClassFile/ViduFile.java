package ClassFile;

import java.io.File;
import java.util.Scanner;

public class ViduFile {
    File file;

    //Contructor
    public ViduFile(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThi() {
        //Kiểm tra file có thể thực thi
        return this.file.canExecute();
    }

    public boolean kiemTraDoc() {
        return this.file.canRead();
    }

    public boolean kiemTraGhi() {
        return this.file.canWrite();
    }

    public void inDuongDan() {
        System.out.println(this.file.getAbsolutePath());
    }

    public void inTen() {
        System.out.println(this.file.getName());
    }

    public void kiemTraLaThuMucHoacTapTin() {
        if (this.file.isDirectory()) {
            System.out.println("Đây là thư mục.");
        } else if(this.file.isFile()) {
            System.out.println("Đây là file.");
        }
    }
    public void inDanhSachCacFileCon() {
        if (this.file.isDirectory()) {
            System.out.println("Các tập tin con bên trong thư mục là: ");
            File[] mangCon = this.file.listFiles();
            for (File file : mangCon) {
                System.out.println(file.getAbsolutePath());
            }
        } else if(this.file.isFile()) {
            System.out.println("Đây là file không có dữ liệu bên trong.");
        }
    }

    public void inCayThuMuc() {
        this.inChiTietCayThuMuc(this.file, 1);
    }

    public void inChiTietCayThuMuc(File f, int bac) {
        for (int i = 0; i < bac; i ++) {
            System.out.print("\t");
        }
        System.out.print("|_");
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                inChiTietCayThuMuc(fx, bac + 1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        System.out.println("Nhập tên file: ");
        String tenFile = sc.nextLine();
        ViduFile vdf = new ViduFile(tenFile);
        do {
            System.out.println("Menu------");
            System.out.println("1. Kiểm tra file có thể thực thi.");
            System.out.println("2. Kiểm tra file có thể đọc.");
            System.out.println("3. Kiểm tra file có thể ghi.");
            System.out.println("4. In đường dẫn.");
            System.out.println("5. In tên file.");
            System.out.println("6. Kiểm tra file là thư mục hoặc tập tin.");
            System.out.println("7. In ra danh sách các file con.");
            System.out.println("8. In ra cây thư mục.");
            System.out.println("0. Thoát chương trình !!!");

            luachon = sc.nextInt();
            switch (luachon){
                case 1:
                    System.out.println(vdf.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println(vdf.kiemTraDoc());
                    break;
                case 3:
                    System.out.println(vdf.kiemTraGhi());
                    break;
                case 4:
                    vdf.inDuongDan();
                    break;
                case 5:
                    vdf.inTen();
                    break;
                case 6:
                    vdf.kiemTraLaThuMucHoacTapTin();
                    break;
                case 7:
                    vdf.inDanhSachCacFileCon();
                    break;
                case 8:
                    vdf.inCayThuMuc();
                default:
                    break;

            }
        }while (luachon!=0);
    }
}
/*
Báo cáo thực tập ngày 03/10/2024.
Dear Anh/ Chị,
Em là Nguyễn Văn Tuyến , TTS Java
Em xin báo cáo nội dung, kiến thức đã làm được trong ngày
Những nội dung đã thực hiện được hôm nay:
        + Làm việc với Class File
        + Làm bài tập ở khoá JAVA ADVANCE.
        + Làm thêm bài tập về Thread, Queue
Trên đây là báo cáo thực tập của em ngày 03/10/2024.

* */