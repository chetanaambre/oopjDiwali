//How to Print duplicate characters from String?

import java.util.Scanner;

public class StrCQ1 
{  
public static void main(String[] args) 
{  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1 = sc.nextLine();  
        int count;  
          
        char chArray1[] = s1.toCharArray();
		
		for(int i=0;i<chArray1.length;i++)
		{
			count = 0;
			for(int j=i+1;j<chArray1.length;j++)
			{
				if(chArray1[i] == chArray1[j])
				{
				count++;
				chArray1[j] = '_';			
				}
			}
			
			if(count >= 1 && chArray1[i] != '_' )
			{
			System.out.println("The character "+chArray1[i]+" repeats");
			}
		}
}
}		
			