package ContructorDemo;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void myDay() {
        System.out.println("Ngay sinh: "+ this.day);
    }
    public void myMonth() {
        System.out.println("Thang sinh: " + this.month);
    }
    public void myYear() {
        System.out.println("Nam sinh: "+ this.year);
    }
    public void myDATE(){
        System.out.println("Ngay thang nam sinh la: " + this.day + " / " + this.month + " / " + this.year);
    }
}
