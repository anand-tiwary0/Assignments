

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Shapes extends Applet {
    private int shapeNow = 0;

    public void init(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                shapeNow = (shapeNow + 1) % 4;
                repaint();
            }
        });
    }

    public void paint(Graphics g){
        switch (shapeNow){
            case 0: {
                //rectangle shape
                g.drawRect(20, 20, 100, 50);
                //drawRect(x ,y, width, height)
                g.setColor(Color.BLUE);
                break;
            }
            case 1:
            {
                //oval
                g.setColor(Color.RED);
                g.drawOval(150,20,80,80);
                break;
            }
            case 2:
            {
                g.setColor(Color.GREEN);
                g.fillRect(20,100,100,50);
                break;
            }
            case 3:
            {
                g.setColor(Color.ORANGE);
                g.fillOval(150,100,80,80);
                break;
            }
        }
    }

}
