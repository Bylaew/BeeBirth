import java.awt.*;

public class Painter extends Canvas {
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("MaleBee.png");
        g.drawImage(i,300,300,this);
    }
}
