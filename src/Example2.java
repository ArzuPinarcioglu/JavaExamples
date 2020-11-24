import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Example2 extends JFrame {
    private JTextField nameTextField;
    private JTextPane resultTextPane;
    private JTextPane nameTextPane;
    private JButton okButton;
    private JPanel exapmle2frame;
    private String keyText = "kalemtraş";
    private String rightprediction;
    private String rightpredictionchar;
    private int rightpredictioncount = 0;

    public Example2() {
        add(exapmle2frame);
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String prediction = nameTextField.getText();

                if (prediction.length() != 9) {
                    JOptionPane.showMessageDialog(null, "Lütfen 9 harften oluşan bir kelime giriniz!", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    whatismyname(prediction);
                }

            }
        });
    }

    void whatismyname(String prediction) {
        String resultText = "";
        rightprediction = "";
        rightpredictionchar = "";
        if (prediction.equals(keyText)) {
            resultText = "Tebrikler\n '" +
                    keyText + "' kelimesini bildin!";
        } else if (rightpredictioncount == 20) {
            resultText = "Üzgünüm. Başarılı olamadın.\n" +
                    "Güç seninle olsun!";
        } else {
            rightpredictioncount++;
            for (int i = 0; i < prediction.length(); i++) {
                if (keyText.charAt(i) == prediction.charAt(i)) {
                    rightprediction += String.valueOf(keyText.charAt(i));

                } else {
                    if (keyText.indexOf(prediction.charAt(i)) != -1) {
                        rightpredictionchar += String.valueOf(prediction.charAt(i));
                    }
                }
            }
            if (!rightprediction.equals(""))
                resultText += "doğru yerdeki harf = " + rightprediction.length() + "/" + rightprediction + "\n";
            if (!rightpredictionchar.equals(""))
                resultText += "doğru tahmin edilip yanlış yerde olan harfler = " + rightpredictionchar.length() + "/" + rightpredictionchar;
            resultText += "\nKalan tahmin hakkınız: " + (20 - rightpredictioncount);
        }
        resultTextPane.setText(resultText);
    }
}
