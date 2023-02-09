package Server;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerController extends JFrame {
    ServerModel model;
    ServerView gui;

    public ServerController(ServerModel m, ServerView v) {
        this.model = m;
        this.gui = v;
        this.setContentPane(gui.getPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }



    public static void main(String[] args) {
        ServerModel m = new ServerModel();
        ServerView v = new ServerView();
        ServerController thisIsTheProgram = new ServerController(m,v);
        thisIsTheProgram.setVisible(true);
    }
}