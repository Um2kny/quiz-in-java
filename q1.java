import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q1 extends JFrame implements ActionListener{
	String q[][] =new String[5][5];
	String a[][] =new String[5][2];
	String ua[][] = new String[5][1];
	JButton b1, b2, b3;
	JLabel no, q1, t1, t2;
	ButtonGroup gr;
	JRadioButton opt1, opt2, opt3, opt4;
	public static int timer =20;
	public static int ans = 0;
	public static int count = 0;
	public static int s = 0;
	String naam;
	q1(String naam){
		this.naam = naam;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

//text
		no =new JLabel();
		no.setBounds(20,200,40,70);
		no.setFont(new Font("Tahoma", Font.PLAIN,15));
		no.setForeground(Color.BLACK);
		add(no);

		q1 =new JLabel();
		q1.setBounds(40,200,500,70);
		q1.setFont(new Font("Tahoma", Font.PLAIN,15));
		q1.setForeground(Color.BLACK);
		add(q1);

		t1 =new JLabel("Time Left");
		t1.setBounds(460,280,200,30);
		t1.setFont(new Font("Tahoma", Font.PLAIN,25));
		t1.setForeground(Color.RED);
		add(t1);

		t2 =new JLabel("Seconds");
		t2.setBounds(460,420,200,30);
		t2.setFont(new Font("Tahoma", Font.PLAIN,25));
		t2.setForeground(Color.RED);
		add(t2);


//image
		ImageIcon i1 = new ImageIcon(getClass().getResource("/img/profile.png"));
		
		JLabel profile = new JLabel(i1);
		profile.setBounds(0,0,600,200);
		add(profile);
//buttons

		b2 = new JButton("NEXT");
		b2.setBounds(40,510,120,25);
		//b2.setBackground(Color.WHITE);       //no need to change baackground colour written just for practice 
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
		b2.addActionListener(this);
		add(b2);

		b3 = new JButton("SUBMIT");
		b3.setBounds(450,510,120,25);
		//b3.setBackground(Color.WHITE);       //no need to change baackground colour written just for practice 
		b3.setForeground(Color.BLACK);
		b3.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
		b3.addActionListener(this);
		b3.setEnabled(false);
		add(b3);

//array data
		q[0][0] = "Which one of the four is leat like the other three";
		q[0][1] = "cow";
		q[0][2] = "dog";
		q[0][3] = "snake";
		q[0][4] = "tiger";

		q[1][0] = "Which of the following words is closest in meaning to APPREHENSIVE";
		q[1][1] = "thorough";
		q[1][2] = "anxious";
		q[1][3] = "foolish";
		q[1][4] = "distraught";

		q[2][0] = "LIGHT BULB is to FILAMENT as WHEEL is to ";
		q[2][1] = "road";
		q[2][2] = "spoke";
		q[2][3] = "car";
		q[2][4] = "automobile";

		q[3][0] = "Some months have 31 days; how many have 28?";
		q[3][1] = "6";
		q[3][2] = "1";
		q[3][3] = "12";
		q[3][4] = "4";

		q[4][0] = "Which number comes next in the following sequence - 2, 6, 12, 20, 30,";
		q[4][1] = "42";
		q[4][2] = "36";
		q[4][3] = "54";
		q[4][4] = "60";

		a[0][1] ="snake";	
		a[1][1] ="anxious";	
		a[2][1] ="spoke";	
		a[3][1] ="12";	
		a[4][1] ="42";	
//options
		opt1 = new JRadioButton();
		opt1.setBounds(40,270,200,30);
		opt1.setBackground(Color.WHITE);
		opt1.setFont(new Font("Mongolian Baiti",Font.PLAIN,15));
		add(opt1);

		opt2 = new JRadioButton();
		opt2.setBounds(40,310,200,30);
		opt2.setBackground(Color.WHITE);
		opt2.setFont(new Font("Mongolian Baiti",Font.PLAIN,15));
		add(opt2);

		opt3 = new JRadioButton();
		opt3.setBounds(40,350,200,30);
		opt3.setBackground(Color.WHITE);
		opt3.setFont(new Font("Mongolian Baiti",Font.PLAIN,15));
		add(opt3);

		opt4 = new JRadioButton();
		opt4.setBounds(40,390,200,30);
		opt4.setBackground(Color.WHITE);
		opt4.setFont(new Font("Mongolian Baiti",Font.PLAIN,15));
		add(opt4);

		gr = new ButtonGroup();
		gr.add(opt1);
		gr.add(opt2);
		gr.add(opt3);
		gr.add(opt4);
//funcion
		start(count);
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

	public void paint(Graphics g){
		super.paint(g);
		String time = "" + timer + "";
		g.setColor(Color.RED);
		g.setFont(new Font("Mongolian Baiti",Font.PLAIN,50));
		if (timer >= 0){
			g.drawString(time,500,420);
		}
		timer--;
		
		try {
			Thread.sleep(1000);
			repaint();
		} catch (Exception e){
			e.printStackTrace();
		}
		if (ans == 1){
			ans = 0;
			timer  = 20;
		}else if (timer < 0){
			timer = 20;
			
			if (count == 3){
				b3.setEnabled(true);
				b2.setEnabled(false);
				
			}
			else if (count == 4){
				if  (gr.getSelection() == null){
					ua[count][0] ="";
				}else{
					ua[count][0] = gr.getSelection().getActionCommand();
				}
				
				for (int i = 0 ; i < ua.length; i++){
					if (ua[i][0].equals(a[i][1])){
						s += 10;
					}
				}
				setVisible(false);
				new result(naam,s);
			}else {
				if  (gr.getSelection() == null){
					ua[count][0] ="";
				}else{
					ua[count][0] = gr.getSelection().getActionCommand();
				}
			count++;
			
			start(count);
}
}
			
	
	}		
	public void start(int count){
		no.setText("" + (count + 1) + "");
		q1.setText(q[count][0]);
		opt1.setText(q[count][1]);
		opt1.setActionCommand(q[count][1]);
		opt2.setText(q[count][2]);
		opt2.setActionCommand(q[count][2]);
		opt3.setText(q[count][3]);
		opt3.setActionCommand(q[count][3]);
		opt4.setText(q[count][4]);
		opt4.setActionCommand(q[count][4]);

		gr.clearSelection();
	}

	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == b2){
			repaint();
			ans = 1;

			if  (gr.getSelection() == null){
				ua[count][0] ="";
			}else{
				ua[count][0] = gr.getSelection().getActionCommand();
				
			}

			if (count == 3){
				b3.setEnabled(true);
				b2.setEnabled(false);
				
			}

			count++;
			start(count);
		}


		else if (ae.getSource() == b3 ){
			ans = 1;
			if  (gr.getSelection() == null){
				ua[count][0] ="";
			}else{
				ua[count][0] = gr.getSelection().getActionCommand();
			}		
			for (int i = 0 ; i < ua.length; i++){
				if (ua[i][0].equals(a[i][1])){
					s += 10;	
				}
				else{
					s += 0;
				}
			}
			setVisible(false);
			new result(naam,s);
		}


	
	
}
	public static void main(String[] args){
		new q1("USER");
	}

	
}



