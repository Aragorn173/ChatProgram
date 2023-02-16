package Client;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientController extends JFrame {
    ClientModel model;
    ClientView view;



    public ClientController(ClientModel m, ClientView v) {
        this.model = m;
        this.view = v;

        v.getSendButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setMsg(view.getInput());
                model.addMsgToChat(model.getMsg());
                view.setChat(model.getChat());
            }
        });

        this.setContentPane(view.getPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        v.getSendButton();
    }




    public static void main(String[] args) {
        ClientModel m = new ClientModel("10.80.45.137", 1731);
        ClientView v = new ClientView();
        ClientController thisIsTheProgram = new ClientController(m,v);
        thisIsTheProgram.setVisible(true);

        //ClientModel me = new ClientModel("10.80.47.10", 5858); //Alexander
        //  Client me = new Client("10.80.45.137", 1731);
        m.getStreams();
        ClientListenerThread l = new ClientListenerThread(m.in, System.out);
        Thread listener = new Thread(l);
        listener.start();
        m.runProtocol();
        listener.stop();
        m.shutDown();
    }


}