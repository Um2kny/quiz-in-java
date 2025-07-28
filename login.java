import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener{	
	JButton st, ru;
	JTextField naam;
	login(){
		getContentPane().setBackground(Color.WHITE);
//image
		ImageIcon i1 = new ImageIcon(getClass().getResource("/img/profile.png"));
		
		JLabel profile = new JLabel(i1);
		profile.setBounds(0,0,600,200);
		add(profile);
//text
		JLabel heading =new JLabel(" TEST YOUR IQ");
		heading.setBounds(150,220,300,45);
		heading.setFont(new Font("Mongolian Baiti", Font.BOLD,40));
		heading.setForeground(Color.BLACK);
		add(heading);
	
		JLabel name =new JLabel(" ENTER YOUR NAME");
		name.setBounds(200,240,200,90);
		name.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
		name.setForeground(Color.BLACK);
		add(name);
//input
		naam = new JTextField();
		naam.setBounds(150,310,300,25);
		naam.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
		add(naam);
//buttons
		st = new JButton("START");
		st.setBounds(170,350,120,25);
		//st.setBackground(Color.WHITE);       //no need to change baackground colour written just for practice 
		st.setForeground(Color.BLACK);
		st.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
		st.addActionListener(this);
		add(st);	

		ru = new JButton("RULES");
		ru.setBounds(320,350,120,25);
		//ru.setBackground(Color.WHITE);       //no need to change baackground colour written just for practice 
		ru.setForeground(Color.BLACK);
		ru.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
		ru.addActionListener(this);
		add(ru);

		
//frame

		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("General Quiz");
		setSize(600,600);
		setLocation(350,25);
ImageIcon icon = new ImageIcon(getClass().getResource("/img/icon.png"));
setIconImage(icon.getImage());
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == st){
			String na = naam.getText();
			setVisible(false);
			new q1(na);
		}
		else if (ae.getSource() == ru){
			setVisible(false);
			new rules();
		}

}

	public static void main(String[] args){
		new login();			
	}
}
