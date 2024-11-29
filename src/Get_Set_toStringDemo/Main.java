package Get_Set_toStringDemo;

public class Main {
    public static void main(String[] args) {
        MyDate md = new MyDate(16,2,2001);

        System.out.println("Day =" + md.getDay());
        System.out.println("Day =" + md.getMonth());
        System.out.println(md);
    }
}
