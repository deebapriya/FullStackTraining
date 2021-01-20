package com.programs.test;

public class ConditionalTest {
	//Method to check given numbers are even or odd
	private void evenTest(int a,int b,int c) {

		if((a%2)== 0 ) {
			System.out.println("\t" +a+"\t is an even number");	
		}else {
			System.out.println("\t" +a+"\t is an odd number");
		}
		if((b%2)== 0 ) {
			System.out.println("\t" +b+"\t is an even number");	
		}else {
			System.out.println("\t" +b+"\t is an odd number");
		}
		if((c%2)== 0 ) {
			System.out.println("\t" +c+"\t is an even number");	
		}else {
			System.out.println("\t" +c+"\t is an odd number");
		}
	}

	//Method to find given number is prime number or not
	private void primeNumTest(int a) {
		
	}
	//Method to find the factorial of a number

	static long factorialCalc(long n) {
		long sum=0,x;
		if (n==0 ) {
			sum=1;
		}else {
			if(n==1) {
				sum=1;
			}
			else {
			
					sum=factorialCalc(n-1)*n;
			}
		}
		return sum;
	}
	
	// While loop example program
	
	public void multiplicationTable(int n) {
		while (n>0 ) {
			for(int j=1;j<=n;j++) {
				System.out.println(j+"*"+n+"="+j*n);
			}
		break;	
		}
		
	}


	public static void main(String[] args) {
		ConditionalTest ct=new ConditionalTest();
		ct.evenTest(15, 20, 17);
		ct.primeNumTest(15);
	
	    long fact=20; long factSum=factorialCalc(fact);
	    System.out.println("Fatorial of  "+fact+" is "+factSum);
	 
		
		ct.multiplicationTable(10);
	}

}
