package MultiThreading_demo;

public class SHAREDATA {
    char c;

    int totalTime = 0;

    public static SHAREDATA instance = null;

    private SHAREDATA() {
    }

    public synchronized static SHAREDATA getInstance() {
        if (instance == null){
            instance = new SHAREDATA();
        }
        return instance;
    }

    public void addTime(int more){
        totalTime +=more;
    }

    public boolean checkAvaiable() {
        return totalTime <= 20000;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }
}
