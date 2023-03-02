package Client;

import javax.swing.*;


public class ClientView {
    private JTextPane chat;
    private JPanel panel1;
    private JTextField input;
    private JButton sendButton;
    private JTextPane list1;



    public JTextField getEnter() {
        return input;
    }

    public void setChat(String c) {
        chat.setText(c);
    }

    public void setInput(String c) {input.setText(c);}

    public String getInput() {
        return input.getText();
    }

    public JPanel getPanel() {
        return panel1;
    }

    public JButton getSendButton() {
        return sendButton;
    }


    public void listAddUser (String c) {list1.setText(c);}
}


