import javax.swing.*;
import java.awt.*;
public class Gui {

    public static JFrame frame;
    public static Container c;
    public static JLabel l1,l2,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11;

    public static void frame( int x,int y){
    frame=new JFrame();
	frame.setVisible(true);
	frame.setSize(1200,800);
    frame.setLocationRelativeTo(null);
	c=frame.getContentPane();
    // ;Border border=BorderFactory.createLineBorder(Color.green,3);
    // frame.setBorder(border);
	c.setLayout(null);
	c.setBackground(Color.BLACK);
	frame.setDefaultCloseOperation(3);

	label1=new JLabel("STOCK GUI");
	c.add(label1);
    label1.setForeground(new Color(0x00FF00));
	label1.setBounds(x+450,10,600,50);
	label1.setFont(new Font("MV Boli",Font.BOLD,40));

	label2=new JLabel("Current Price :  ");
	c.add(label2);
	label2.setBounds(x+800,y+30,600,70);
	label2.setFont(new Font("MV Boli",Font.BOLD,30));
    label2.setForeground(Color.GREEN);

	label3=new JLabel("UA");
	c.add(label3);
	label3.setBounds(x+1080,y+30,600,70);
	label3.setFont(new Font("MV Boli",Font.BOLD,30));
    label3.setForeground(Color.GREEN);

	label4=new JLabel("Last Open Price:");
	c.add(label4);
	label4.setBounds(x+800,y+60,600,70);
	label4.setFont(new Font("MV Boli",Font.BOLD,30));
    label4.setForeground(Color.GREEN);

	label5=new JLabel("UA");
	c.add(label5);
	label5.setBounds(x+1080,y+60,600,70);
	label5.setFont(new Font("MV Boli",Font.BOLD,30));
    label5.setForeground(Color.GREEN);

	label6=new JLabel("Last close Price:");
	c.add(label6);
	label6.setBounds(x+800,y+90,600,70);
    label6.setFont(new Font("MV Boli",Font.BOLD,30));
    label6.setForeground(Color.GREEN);
	label7=new JLabel("UA");
	c.add(label7);
	label7.setBounds(x+1080,y+90,600,70);
    label7.setFont(new Font("MV Boli",Font.BOLD,30));
    label7.setForeground(Color.GREEN);
	label8=new JLabel("You can't buy the stock now");
	c.add(label8);
	label8.setBounds(550,700,600,70);
    label8.setFont(new Font("MV Boli",Font.BOLD,30));
    label8.setForeground(Color.GREEN);    

    }
}
