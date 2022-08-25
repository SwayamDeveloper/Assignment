
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[][] = {{1,2},{4,5},{8,9}};   //creating two matrice
         int b[][] ={{1,2},{4,5},{8,9}};   //creating two matrice
         
         int tran[][] = new int[2][2];  //creating another matrix to store the multiplication of two matrices
         //multiplying and printing multiplication of 2matrices
         
         for(int i=0; i<2; i++) {
      	   for(int j=0; j<2; j++) {
      		   tran[i][j] = 0;
      		for(int k=0; k<2; k++){
      			tran[i][j]+=a[i][k]*b[k][j];
      	   }//end of k loop
      	   System.out.print(tran[i][j]+" "); //printing matrix element
         }//end of j loop
         System.out.println();
	}

}}