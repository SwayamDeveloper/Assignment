
public class HCFtwonum {

	public static void main (String[]args)
	  {
		
		//taking the value
	    int num1 = 60, num2 = 36, hcf=0;
	    
		//logic for hcf  

	    for (int i = 1; i <= num1 || i <= num2; i++)
	      {
	    	
	     if (num1 % i == 0 && num2 % i == 0)
	        hcf = i;
	      }

		
	  //printing hcf

	    System.out.println("The HCF: "+ hcf);
	  }
}