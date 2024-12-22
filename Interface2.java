package Login;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Interface2 {
    public JFrame frame;
    public JLabel labelname;
    public JLabel age;
    public JLabel variblesex;
    public JLabel amt;
    public JLabel last;
    public JLabel add;
    public JLabel rea;
    public JLabel dname;
    public JLabel mg;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Interface2 window = new Interface2();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Interface2() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.getContentPane().setForeground(new Color(0, 0, 0));
        frame.setBounds(100, 100, 910, 751);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("NAME :");
        lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 16));
        lblNewLabel_1.setBounds(220, 87, 86, 24);
        frame.getContentPane().add(lblNewLabel_1);

        labelname = new JLabel("");
        labelname.setFont(new Font("Tahoma", Font.BOLD, 15));
        labelname.setBounds(296, 87, 196, 24);
        frame.getContentPane().add(labelname);

        JLabel lblNewLabel_2 = new JLabel("AGE :");
        lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 16));
        lblNewLabel_2.setBounds(220, 135, 55, 24);
        frame.getContentPane().add(lblNewLabel_2);

        age = new JLabel("");
        age.setFont(new Font("Tahoma", Font.BOLD, 15));
        age.setBounds(284, 135, 55, 24);
        frame.getContentPane().add(age);

        JLabel lblNewLabel_3 = new JLabel("SEX  :");
        lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 16));
        lblNewLabel_3.setBounds(449, 135, 55, 24);
        frame.getContentPane().add(lblNewLabel_3);

        variblesex = new JLabel("");
        variblesex.setFont(new Font("Tahoma", Font.BOLD, 15));
        variblesex.setBounds(514, 135, 55, 24);
        frame.getContentPane().add(variblesex);

        JLabel lblNewLabel_4 = new JLabel("ADDRESS  :");
        lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 15));
        lblNewLabel_4.setBounds(220, 194, 100, 13);
        frame.getContentPane().add(lblNewLabel_4);

        add = new JLabel("");
        add.setFont(new Font("Tahoma", Font.BOLD, 15));
        add.setBounds(330, 194, 427, 13);
        frame.getContentPane().add(add);

        JLabel lblNewLabel_5 = new JLabel("<HTML><U>DETAILS OF LAST VISIT</U></HTML>");
        lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 16));
        lblNewLabel_5.setBounds(17, 269, 493, 24);
        frame.getContentPane().add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("LAST VISIT  :");
        lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD, 16));
        lblNewLabel_6.setBounds(17, 347, 139, 13);
        frame.getContentPane().add(lblNewLabel_6);

        last = new JLabel("");
        last.setFont(new Font("Tahoma", Font.BOLD, 15));
        last.setBounds(166, 347, 283, 16);
        frame.getContentPane().add(last);

        JLabel lblNewLabel_7 = new JLabel("REASON  :");
        lblNewLabel_7.setFont(new Font("Verdana", Font.BOLD, 16));
        lblNewLabel_7.setBounds(17, 408, 121, 13);
        frame.getContentPane().add(lblNewLabel_7);

        rea = new JLabel("");
        rea.setFont(new Font("Tahoma", Font.BOLD, 15));
        rea.setBounds(132, 404, 283, 24);
        frame.getContentPane().add(rea);

        JLabel lblNewLabel_8 = new JLabel("DOCTOR NAME  :");
        lblNewLabel_8.setFont(new Font("Verdana", Font.BOLD, 16));
        lblNewLabel_8.setBounds(17, 472, 158, 13);
        frame.getContentPane().add(lblNewLabel_8);

        dname = new JLabel("");
        dname.setFont(new Font("Tahoma", Font.BOLD, 15));
        dname.setBounds(185, 468, 246, 24);
        frame.getContentPane().add(dname);

        JLabel lblNewLabel_9 = new JLabel("MEDICINE GIVEN  :");
        lblNewLabel_9.setFont(new Font("Verdana", Font.BOLD, 16));
        lblNewLabel_9.setBounds(17, 525, 175, 13);
        frame.getContentPane().add(lblNewLabel_9);

        mg = new JLabel("");
        mg.setFont(new Font("Tahoma", Font.BOLD, 15));
        mg.setBounds(218, 519, 480, 30);
        frame.getContentPane().add(mg);

        JLabel lblNewLabel_10 = new JLabel("AMOUNT PAID  :");
        lblNewLabel_10.setFont(new Font("Verdana", Font.BOLD, 16));
        lblNewLabel_10.setBounds(17, 579, 158, 24);
        frame.getContentPane().add(lblNewLabel_10);

        amt = new JLabel("");
        amt.setFont(new Font("Tahoma", Font.BOLD, 15));
        amt.setBounds(185, 579, 288, 22);
        frame.getContentPane().add(amt);

        JButton ex = new JButton("EXIT");
        ex.setForeground(new Color(255, 0, 51));
        ex.setBackground(new Color(255, 255, 255));
        ex.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        	}
        });
        frame.getContentPane().add(ex);
        
        JButton backButton = new JButton("Enter Another ID");
        backButton.setBackground(new Color(255, 255, 255));
        backButton.setForeground(new Color(0, 0, 51));
        backButton.setFont(new Font("Verdana", Font.BOLD, 18));
        backButton.setBounds(17, 680, 256, 24);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Loginpage loginPage = new Loginpage();
                loginPage.setVisible(true);
                frame.dispose(); // Close the Interface2 frame
            }
        });
        frame.getContentPane().add(backButton);
        
        ex.setFont(new Font("Verdana", Font.BOLD, 18));
        ex.setBounds(770, 680, 116, 24);
        frame.getContentPane().add(ex);
        
        JLabel lblNewLabel = new JLabel("New label");
        ImageIcon img = new ImageIcon(this.getClass().getResource("/profile .jpg"));
        lblNewLabel.setIcon(img);
        lblNewLabel.setBounds(10, 31, 182, 215);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_11 = new JLabel("<HTML><U>Paient  Details</U></HTML>");
        lblNewLabel_11.setFont(new Font("Stencil", Font.BOLD, 30));
        lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11.setBounds(218, 10, 413, 30);
        frame.getContentPane().add(lblNewLabel_11);
    }
}
