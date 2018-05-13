import java.util.*;

class RandomNumbers  {
	public static void main(String[] args) {
		Random rand=new Random();
		int i;
		for (i=1;i<5 ;i++) {
			System.out.println(rand.nextInt(46));
		}
	}
	
}
