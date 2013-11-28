package q1;

import java.awt.*;
import javax.swing.*;

public class TelephonePanel extends JPanel {
    
    public TelephonePanel() {
        
        setLayout(new BorderLayout());
        JLabel title = new JLabel("Your Telephone");
        JPanel center = new JPanel();
        center.add(title);
        add(center, BorderLayout.NORTH);
        
        JPanel key = new JPanel(new GridLayout(4, 3));
        setLayout(new GridLayout(4, 3));
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton star = new JButton("*");
        JButton zero = new JButton("0");
        JButton pound = new JButton("#");
        
        key.add(one);
        key.add(two);
        key.add(three);
        key.add(four);
        key.add(five);
        key.add(six);
        key.add(seven);
        key.add(eight);
        key.add(nine);
        key.add(star);
        key.add(zero);
        key.add(pound);
        
        add(key, BorderLayout.CENTER);
    }

}
