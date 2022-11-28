//Author: Gauri Chalak


package com.quetion2;

public class Arithmetic {

	    public int add(int a, int b){
	        int sum = a + b; 
	        return sum;
	    }
	}

	class Adder extends Arithmetic{  
	    public int callAdd(int a, int b){
	        return add(a, b);
	    }
	}



	class solution {

		public static void main(String[] args) {
	        Adder a = new Adder();
	        
	        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());  
	        
	        System.out.print(a.add(25,35) + " " + a.add(36,44) + " " + a.add(33,17) + "\n");
		}

	}


