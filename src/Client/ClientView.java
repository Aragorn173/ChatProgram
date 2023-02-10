package Client;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ClientView {
    private JTextPane textPane1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton sendButton;
    private JList list1;



    public void setTextPane1(String c) {
        textPane1.setText(c);
    }

    public String getTextField1() {
        return textField1.getText();
    }

    public void setList1(JList list1) {
        this.list1 = list1;
    }

    public void setsendButton(ActionListener exportListener) {
        sendButton.addActionListener(exportListener);
    }

    public JPanel getPanel() {
        return panel1;
    }
}


