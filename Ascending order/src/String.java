import java.lang.String;
import java.util.Arrays;
public class String {
	public static void main(String args[])   
	{  
		
	//defining an array of type String  
	String[] s1 = {"a","is","this","easiest","example"};  
	int size = s1.length; 
	
	//logic for sorting   
	for(int i = 0; i<size-1; i++)   
	{  
	for (int j = i+1; j<s1.length; j++)   
	{  
		
	//compares each elements of the array to all the remaining elements 
		
	if(s1[i].compareTo(s1[j])>0)   
	{  
		
	//swapping array elements  
	String temp = s1[i];  
	s1[i] = s1[j];  
	s1[j] = temp;  
	}  
	}  
	}  
	
	//prints the sorted array in ascending order  
	System.out.println(Arrays.toString(s1));  
	}  
}