import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Graphics;

public class Habitat {
    private BeeWorker worker = new BeeWorker();
    private int JFwidth, JFheight;
    private ArrayList<Bee> objs;
    private BeeFactory factory;
    private Main myFrame;
    private float N1, N2, K, P;
    private long timeFromStart = 0;
    private float N1time, N2time;
    private int workerAmount = 0, maleAmount = 0;
    private Timer startTime;
    private boolean firstRun = true;
    private long firstTime;
    private ImageIcon icon = null;
    private BufferedImage img = null;

    Habitat(int JFwidth, int JFheight, float N1, float N2, float K, float P) {
        this.JFwidth = JFwidth;
        this.JFheight = JFheight;
        this.N1 = N1;
        this.N2 = N2;
        this.K = K;
        this.P = P;
        myFrame = new Main(JFwidth, JFheight);
        objs = new ArrayList<Bee>();
        factory = new BeeFactory();
        startTime = new Timer();
        startTime.schedule(new TimerTask() {
            @Override
            public void run() {
                if (firstRun) {
                    firstTime = System.currentTimeMillis();
                    firstRun = false;
                }
                long currentTime = System.currentTimeMillis();

                long deltaTime = currentTime - firstTime;

                update(deltaTime);
            }
        }, 0, 100);
    }

    private void update(long timeFromStart) {
        System.out.println("Must draw! " + timeFromStart);
        try {
            this.img = ImageIO.read(new File("MaleBee.png"));
            this.icon = new ImageIcon(img);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JLabel b = new JLabel();
        b.setIcon(this.icon);
        this.myFrame.add(b);
    }
}
