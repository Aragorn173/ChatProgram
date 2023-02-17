package Client;

import javax.swing.*;


public class ClientView {
    private JTextPane chat;
    private JPanel panel1;
    private JTextField input;
    private JButton sendButton;
    private JList list1;


    public void setChat(String c) {
        chat.setText(c);
    }

    public String getInput() {
        return input.getText();
    }

    public void setList1(JList list1) {
        this.list1 = list1;
    }


    public JPanel getPanel() {
        return panel1;
    }

    public JButton getSendButton() {
        return sendButton;
    }
}


