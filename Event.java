import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Event extends JFrame implements ActionListener{
	public static void main(String[] args) {
		Event frame= new Event();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	JCheckBox chk1;
	JCheckBox chk2;
	JCheckBox chk3;
	public Event(){
		setLayout(new FlowLayout());
		chk1=new JCheckBox("SARI");
		add(chk1);
		chk1.addActionListener(this);
		chk2=new JCheckBox("KIRMIZI");
		add(chk2);
		chk2.addActionListener(this);
		chk3=new JCheckBox("LACIVERT");
		add(chk3);
		chk3.addActionListener(this);
		pack();

	}
	public void actionPerformed(ActionEvent e){
		if (chk3.isSelected()==false & chk1.isSelected()==true & chk2.isSelected()==true) {
			System.out.println("galatasaray");
			
		}
		else if (chk2.isSelected()==false & chk1.isSelected()==true & chk3.isSelected()==true) {
			System.out.println("fener");
		}
		else{
			System.out.println("Tanimsiz");
		}
	}

	
}