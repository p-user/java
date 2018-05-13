public class konstrakt1{
	public static void main(String[] args) {
		konstrakt konstraktobject1=new konstrakt();
		konstrakt konstraktobject2=new konstrakt(2);
		konstrakt konstraktobject3=new konstrakt(2,32);
		konstrakt konstraktobject4=new konstrakt(2,32,46);

		System.out.printf("%s\n", konstraktobject1.toMillitary());
		System.out.println(konstraktobject2.toMillitary());
		System.out.println(konstraktobject3.toMillitary());
		System.out.println(konstraktobject4.toMillitary());

	}
}