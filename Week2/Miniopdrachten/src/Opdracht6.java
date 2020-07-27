
public class Opdracht6 {

	public static void main(String[] args) {
		
		
		double lengte, gewicht, bmi;
	    lengte = 1.50;
	    gewicht = 105.0;
	    bmi = gewicht/(lengte*lengte);

	    if(bmi < 18) { 
	    	System.out.println("GEEL");
	    } 
	    else if(bmi >= 18 && bmi < 25) { 
	    	System.out.println("GROEN");
	    }
	    else if(bmi >= 25) { 
	    	System.out.println("ROOD");
	    }
	   

	}

}
