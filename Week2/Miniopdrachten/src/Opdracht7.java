
public class Opdracht7 {

	public static void main(String[] args) {
		 
			String str = "Ik programmeer Java!";
			String reverse;

			// reversing string: 
			reverse = new StringBuffer(str).reverse().toString();
			
			
			System.out.println("ORIGINEEL: "+ str);
			System.out.println("REVERSED: "+ reverse);

	}


}
