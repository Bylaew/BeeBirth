import javax.swing.*;

public class Main extends JFrame {
    Main(int width, int height){
        super("LR1VAR2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width,height);
        setLayout(null);
        //setContentPane(new JPanel());
        setVisible(true);
    }

    public static void main(String[] args){
        Habitat habitat = new Habitat(800,600,1,1,0.3f,0.5f);
    }
}
