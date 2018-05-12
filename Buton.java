import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Buton extends JFrame implements ActionListener {
	

	public static void main(String[] args) {
		Buton frame=new Buton();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
		
	}
	JLabel obj1;
	JTextField obj2;
	JButton obj3;
	public Buton(){
		this.setTitle("Fill in the name");
		setLayout(new FlowLayout());
		setSize(400, 200);
		setLocation(300,300);
		obj1=new JLabel("No Name");
		add(obj1);
		obj2=new JTextField(10);
		add(obj2);
		obj3=new JButton("Okay");
		add(obj3);
		obj3.addActionListener(this);
		

	
}
public void actionPerformed(ActionEvent e){
	obj1.setText(obj2.getText());
	obj2.setText(null);
	obj2.setEnabled(false);
	obj3.setText("finish");
		
	}
}
