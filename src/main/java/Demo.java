import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        Point s = new Point(5, 5);
        System.out.println(s.x);
        s.translate(3, 5);
        System.out.println(s);
    }
}
