package Client;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientController extends JFrame {
    ClientModel model;
    ClientView gui;

    public ClientController(ClientModel m, ClientView v) {
        this.model = m;
        this.gui = v;
        this.setContentPane(gui.getPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }



    public static void main(String[] args) {
        ClientModel m = new ClientModel();
        ClientView v = new ClientView();
        ClientController thisIsTheProgram = new ClientController(m,v);
        thisIsTheProgram.setVisible(true);
    }
}