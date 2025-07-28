import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rules extends JFrame implements ActionListener{
	JButton b1, b2;
	rules(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
//image
		ImageIcon i1 = new ImageIcon(getClass().getResource("/img/profile.png"));
		
		JLabel profile = new JLabel(i1);
		profile.setBounds(0,0,600,200);
		add(profile);
//text
		JLabel wel =new JLabel(" WELCOME ");
		wel.setBounds(200,120,300,200);
		wel.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
		wel.setForeground(Color.BLACK);
		add(wel);

		JLabel poi =new JLabel(" HERE ARE THE RULES");
		poi.setBounds(170,240,300,45);
		poi.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
		poi.setForeground(Color.BLACK);
		add(poi);

		JLabel rul =new JLabel();
		rul.setBounds(20,120,500,500);
		rul.setFont(new Font("Tahoma", Font.PLAIN,15));
		rul.setForeground(Color.BLACK);
		rul.setText(
			"<html>" +
				"1. There will be 5 multiplte choice questions" + "<br><br>" + 
				"2. You will get specific amount of time to answer each question " + "<br><br>" + 
				"3. If you fail to submit answer within time limit it will be marked skipped" + "<br><br>" +
				"4. Your total score will be shown at the end of the quiz " + "<br><br>" + 
			"<html>"
		);
		add(rul);

//buttons
		b1 = new JButton("BACK");
		b1.setBounds(20,510,120,25);
		//b1.setBackground(Color.WHITE);       //no need to change baackground colour written just for practice 
		b1.setForeground(Color.BLACK);
		b1.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
		b1.addActionListener(this);
		add(b1);	


//frame
		setSize(600,600);
		setLocation(350,25);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("General Quiz");
ImageIcon icon = new ImageIcon(getClass().getResource("/img/icon.png"));
setIconImage(icon.getImage());

}
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == b1){
			setVisible(false);
			new login();
		}

}
	public static void main(String[] args){
		new rules();
}
}