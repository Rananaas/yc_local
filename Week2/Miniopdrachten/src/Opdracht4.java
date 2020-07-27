
public class Opdracht4 {

	public static void main(String[] args) {
		
		
		 String org = "Deze regel heeft best wel veel eees.";
		 String verhaal = "Lang geleden was er een bos";
		 char findThisLetter = 'e';
		 int result = 0;
		 char findThisLetterToo = 'o';
		 int result2 = 0;

	       
	       for(int i = 0; i < org.length(); i++) { 
	    	   if(org.charAt(i) == findThisLetter) { 
	    		   result ++;
	    	   }
	       }
	       
	       for(int i = 0; i < verhaal.length(); i++) { 
	    	   if(org.charAt(i) == findThisLetterToo) { 
	    		   result ++;
	    	   }
	       }
	       System.out.println("Er zitten " + result + " letters    -" + findThisLetter + "-   in deze zin");
	       System.out.println("----------------------------------------------------------------");
	       System.out.println("Er zitten " + result2 +  " letters    -" + findThisLetterToo + "- in dit verhaal");




	}

}
