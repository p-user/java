import javax.swing.JOptionPane;
class gui{
	public static void main(String[] args) {
		String fn =JOptionPane.showInputDialog("enter first number ");
		String sn =JOptionPane.showInputDialog("enter second number ");
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum=num2+num1;
		JOptionPane.showMessageDialog(null, "the answer is " +sum, "the title",JOptionPane.PLAIN_MESSAGE);

	}
}
