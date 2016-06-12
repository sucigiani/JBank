import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class ATMGUI extends JFrame {

    private JMenuBar menuBar;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label1;
    private JLabel label2;
    private JRadioButton radiobutton1;
    private JRadioButton radiobutton2;
    private JRadioButton radiobutton3;
    private JRadioButton radiobutton4;
    private JTextArea textarea1;
    private JTextField textfield1;
    private JTextField textfield2;

    //Constructor 
    public ATMGUI(){
            buildGUI();
        
    }

        public void buildGUI () {
        this.setTitle("GUI_project");
        this.setSize(818,476);
        //menu generate method

        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(818,476));
        contentPane.setBackground(new Color(192,192,192));


        button1 = new JButton();
        button1.setBounds(653,164,90,76);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Deposit");
        button1.setVisible(true);

        button2 = new JButton();
        button2.setBounds(654,237,89,72);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Withdraw");
        button2.setVisible(true);

        button3 = new JButton();
        button3.setBounds(654,307,89,75);
        button3.setBackground(new Color(214,217,223));
        button3.setForeground(new Color(0,0,0));
        button3.setEnabled(true);
        button3.setFont(new Font("sansserif",0,12));
        button3.setText("Exit");
        button3.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(43,44,151,26);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Enter customer id");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(420,36,123,38);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Enter amount here");
        label2.setVisible(true);

        radiobutton1 = new JRadioButton();
        radiobutton1.setBounds(309,23,90,35);
        radiobutton1.setBackground(new Color(214,217,223));
        radiobutton1.setForeground(new Color(0,0,0));
        radiobutton1.setEnabled(true);
        radiobutton1.setFont(new Font("sansserif",0,12));
        radiobutton1.setText("Savings");
        radiobutton1.setVisible(true);

        radiobutton2 = new JRadioButton();
        radiobutton2.setBounds(310,52,90,35);
        radiobutton2.setBackground(new Color(214,217,223));
        radiobutton2.setForeground(new Color(0,0,0));
        radiobutton2.setEnabled(true);
        radiobutton2.setFont(new Font("sansserif",0,12));
        radiobutton2.setText("Investment");
        radiobutton2.setVisible(true);

        radiobutton3 = new JRadioButton();
        radiobutton3.setBounds(310,80,90,35);
        radiobutton3.setBackground(new Color(214,217,223));
        radiobutton3.setForeground(new Color(0,0,0));
        radiobutton3.setEnabled(true);
        radiobutton3.setFont(new Font("sansserif",0,12));
        radiobutton3.setText("Line Of Credit");
        radiobutton3.setVisible(true);

        radiobutton4 = new JRadioButton();
        radiobutton4.setBounds(311,110,90,35);
        radiobutton4.setBackground(new Color(214,217,223));
        radiobutton4.setForeground(new Color(0,0,0));
        radiobutton4.setEnabled(true);
        radiobutton4.setFont(new Font("sansserif",0,12));
        radiobutton4.setText("Overdraft");
        radiobutton4.setVisible(true);

        textarea1 = new JTextArea();
        textarea1.setBounds(44,157,547,254);
        textarea1.setBackground(new Color(255,255,255));
        textarea1.setForeground(new Color(0,0,0));
        textarea1.setEnabled(true);
        textarea1.setFont(new Font("sansserif",0,12));
        textarea1.setText("");
        textarea1.setBorder(BorderFactory.createBevelBorder(1));
        textarea1.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(171,43,118,26);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(553,43,124,24);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("");
        textfield2.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(radiobutton1);
        contentPane.add(radiobutton2);
        contentPane.add(radiobutton3);
        contentPane.add(radiobutton4);
        contentPane.add(textarea1);
        contentPane.add(textfield1);
        contentPane.add(textfield2);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
}



     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ATMGUI();
            }
        });
    }

}