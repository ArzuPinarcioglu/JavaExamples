import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home  extends JFrame{
    private JButton example1Button;
    private JButton example2Button;
    private JPanel frame;

    public Home(){
        add(frame);
        setSize(400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Examples");
        example1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Example1 example1 = new Example1();
                example1.setVisible(true);

            }
        });
        example2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Example2 example2 = new Example2();
                example2.setVisible(true);

            }
        });

    }


}
