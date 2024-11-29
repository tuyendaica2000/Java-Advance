package bai1_Exception;

public class Vidu {
    public static float Devide(float a, float b) throws DevideByZeroException {
        if (b==0){
            throw new DevideByZeroException(a, b);
        }
        return  a/b;
    }

    public static float Plus(float x, float y) {
        return  x+y;
    }
}
