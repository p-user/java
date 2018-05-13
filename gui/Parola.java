import javax.swing.*;
import java.awt.*;
public class Parola extends JFrame{
	public static void main(String[] args) {
		JTextField password, user;
		user= new JTextField(10);
		password= new JTextField(10);
		JFrame frame= new JFrame("Log In ");
		frame.setLayout(new GridLayout(2,2));
		frame.add(new JLabel("user") );
		frame.add(user);
		frame.add(new JLabel("password"));
		frame.add(password);
		frame.setSize(300,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();

	}
}