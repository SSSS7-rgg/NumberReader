package com.Sam;
/**
 * @author Sam Hossaini
 * @date 04/25/2024
 * writing the unit 1.2 lab
 */
import java.util.Scanner;
public class NumberReader {
	/**
	 * This main method is used to ask the user for a number and put it in the MyNumber method
	 * @param args Main method 
	 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ");
        // To ask the user for a number, use `input.nextInt()`
        int number = input.nextInt();
        
        MyNumber num = new MyNumber(number);
        
        
        System.out.println(num.isEven());
        System.out.println(num.isOdd());
        System.out.println(num.isPrime());
          
          
    }
}
/**
 * This is the main class
 */
class MyNumber {
	//instance variable
	/**
	 * This is the variable that holds the number
	 */
    private int val;
    
    //getter
    /**
     * This is a getter for val
     * @return val is the input
     */
	public int getVal() {
		return val;
	}
	
	/**
	 * This sets the val
	 * @param input is the set val
	 */
	public MyNumber(int input) {
		this.val = input;
		
	}
	
	/**
	 * This method tells if the number is even or not
	 * @return false or true
	 */

    public boolean isEven() {
	    	if(val % 2 == 0) {
	    		return true;
	    	}else {
	    		return false;
	    	}
	    }

    
    //isOdd
    /**
     * This method tells if the number is odd or not
     * @return false or true
     */
    public boolean isOdd() {
    	
    	if(val % 2 == 1) {
    		return true;
    	}else {
    		return false;
    	}
    	
    	
    	
    }
    
  
 
    //isPrime
    /**
     * This method tells if the number is prime or not
     * @return false or true
     */
    public boolean isPrime() {
    	if(val == 1) {
    		//1 is not a prime number
    		return false;
    	}
    	for (int i = 2; i < val ; i++) {
    		if(val % i == 0) {
    			return false;
    		}
    	}
		return true;
    	
    	
     }


  

 
 }


