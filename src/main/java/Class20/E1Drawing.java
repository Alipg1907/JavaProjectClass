package Class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        MyCanvas c=new MyCanvas();

        frame.setSize(1000,1000);
        frame.add(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
class MyCanvas extends Canvas{
    @Override
    public void paint(Graphics g) {
      g.setColor(Color.BLUE);
     // g.fillRect(200,200,50,50);
      //g.fill3DRect(200,200,50,50,true);
        g.fillOval(200,200,100,100);
        g.setColor(Color.black);
        g.fillRect(400,200,300,300);

    }
}