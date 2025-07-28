import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class result extends JFrame {
	String naam;
	int s;
	result(String naam, int s){
		this.s = s;
		this.naam = naam;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
//image
		ImageIcon i1 = new ImageIcon(getClass().getResource("/img/profile.png"));
		
		JLabel profile = new JLabel(i1);
		profile.setBounds(0,0,600,200);
		add(profile);
//text
		JLabel heading =new JLabel("THANKS FOR PLAYING " + naam );
		heading.setBounds(20,220,600,45);
		heading.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
		heading.setForeground(Color.BLACK);
		add(heading);

		JLabel sc =new JLabel("YOUR SCORE :  " + s + "/50" ); 
		sc.setBounds(20,280,500,45);
		sc.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
		sc.setForeground(Color.BLACK);
		add(sc);

//frame
		setSize(600,600);
		setLocation(350,25);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
ImageIcon icon = new ImageIcon(getClass().getResource("/img/icon.png"));
setIconImage(icon.getImage());
		setTitle("General Quiz");
}

	public static void main(String[] args){
		new result("USER",0);
	}
}