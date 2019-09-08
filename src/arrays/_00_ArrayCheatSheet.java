package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"Sarah", "Joe","Ali", "Jose","Bartholomew"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2]="Gertrude";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i<names.length;i++) {
		     System.out.println(names[i]);
		}

		
		//6. make an array of 50 integers
		int[] moreNums = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i <moreNums.length; i++) {
			
			moreNums[i]=r.nextInt(1001);
			//System.out.println(moreNums[i]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		/*int tempValue = moreNums[0];
		
		for (int i = 0; i < 51; i++) {
			if (i+1==51) {
			break;	
			}
			if (moreNums[i]>moreNums[i+1]) {
				tempValue=moreNums[i+1];
			}else {
				continue;
				
			}
		}*/
		int lowestValue = moreNums[0];
		for ( int index = 0; index < moreNums.length; index++) {
			
				
				if(lowestValue > moreNums[index]) {
					lowestValue = moreNums[index]; 
					}
			
		
			
			
			
			/*
			if ( index + 1 == 51 ) break;
			if( moreNums[index + 1] < moreNums[index]) {
				lowestValue = moreNums[index +1];
				System.out.println("lowest value: " + lowestValue);
			}*/
			
		}
	
		
		
		System.out.println("The lowest value is" + lowestValue);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < moreNums.length; i++) {
			System.out.println(moreNums[i]);
		}
		//10. print the largest number in the array.
		int highestValue = moreNums[0];
		for ( int index = 0; index < moreNums.length; index++) {
			
				
				if(highestValue < moreNums[index]) {
					highestValue = moreNums[index]; 
					}
				
	}
		System.out.println("the highest value is" + highestValue);
}}
