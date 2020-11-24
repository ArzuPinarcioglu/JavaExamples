import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example1 extends JFrame {
    private JTextField textField1;
    private JPanel frame_example;
    private JTextPane textPane2;
    private JTextPane textPanel;
    private JButton okButton;

    public Example1() {
        add(frame_example);
        setSize(400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePermutn(textField1.getText(),"");
            }
        });
    }
    void calculatePermutn(String str, String ans)
    {
        // If string is empty
        if (str.length() == 0) {
            textPane2.setText(textPane2.getText() + " "+ ans);
        }
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            // Recurvise
            calculatePermutn(ros, ans + ch);
        }
    }

}
