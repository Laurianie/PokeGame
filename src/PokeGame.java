import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PokeGame implements ActionListener{
    private JFrame mainFrame;
    private JLabel label1;
    private JLabel label2;
    private JTextArea ta;
    private JPanel Panel1;
    private int WIDTH=1200;
    private int HEIGHT=1200;


    public PokeGame() {
        prepareGUI();
    }

    public static void main(String[] args) {
        PokeGame PokeGame = new PokeGame();
        PokeGame.showEventDemo();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Poke Game");
        mainFrame.setSize(WIDTH, HEIGHT);

        mainFrame.setLayout(new BorderLayout());

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);

        label1 = new JLabel("LABEL 1", JLabel.CENTER);
        label2 = new JLabel("LABEL 1", JLabel.CENTER);
//        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        mainFrame.setVisible(true);

    }

    private void showEventDemo(){
        JButton button1 = new JButton ("PREVIOUS ");
        JButton button2 = new JButton ("NEXT ");
        JButton button3  = new JButton ("CARD INFORMATION: ");
        JPanel panel1 = new JPanel();


        button1.setActionCommand("PREVIOUS");
        button2.setActionCommand("NEXT");
        button3.setActionCommand("CARD INFORMATION: ");


        button1.addActionListener(new ButtonClickListener());
        button2.addActionListener(new ButtonClickListener());


        mainFrame.add(button1, BorderLayout.WEST);
        mainFrame.add(button2,BorderLayout.EAST );
        mainFrame.add(button3, BorderLayout.NORTH);
        mainFrame.add(panel1,BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

        }
    }
}

