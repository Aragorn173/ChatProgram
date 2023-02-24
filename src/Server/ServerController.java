package Server;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerController extends JFrame {
    ServerModel model;
    ServerView view;

    public ServerController(ServerModel m, ServerView v) {
        this.model = m;
        this.view = v;
        this.setTitle("Server");

        v.getSendButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setMsg(view.getInput());
                if (model.getMsg().length() > 0) {
                model.addMsgToChat(model.getName() + ": " +model.getMsg());
                view.setChat(model.getChat());
                model.sendMessage(model.getMsg());
                view.setInput("");
                }

            }
        });

        this.setContentPane(view.getPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        v.getSendButton();


    }



    public static void main(String[] args) {
        ServerModel m = new ServerModel(1731);
        ServerView v = new ServerView();
        ServerController thisIsTheProgram = new ServerController(m,v);
        thisIsTheProgram.setVisible(true);
        m.setName(JOptionPane.showInputDialog("Name?"));
        v.listAddUser(m.getName());

        m.acceptClient();
        m.getStreams();
        ServerListenerThread l = new ServerListenerThread(m.in, thisIsTheProgram);
        Thread listener = new Thread(l);
        listener.start();
        m.runProtocol();
        listener.stop();
        m.shutdown();
    }

    public void newMessage(String msg) {
        model.addMsgToChat(msg);
        view.setChat(model.getChat());
    }
}