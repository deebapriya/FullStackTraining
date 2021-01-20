package com.programs.test;

public class TestStringComparison {

	public static void main(String[] args) {
 
        String string1 = new String("Solar System"); 
        String string2 = "Solar"; 
        String string3 = new String("System"); 
        String string4 = new String("solar"); 
        String string5 = new String("Solar"); 
        
  
         System.out.println("Comparing " + string1 + " and " + string2 
                           + " : " + string1.equals(string2)); 
  
         System.out.println("Comparing " + string3 + " and " + string4 
                           + " : " + string3.equals(string4)); 
  
         System.out.println("Comparing " + string4 + " and " + string5 
                           + " : " + string4.equalsIgnoreCase(string5)); 
  
         System.out.println("Comparing " + string2 + " and " + string5 
                           + " : " + string2.equals(string5)); 

         if (string2 == string5)
        	 System.out.println("Both strings"+string2+ "\t"+string5+" are equal");
         else
        	 System.out.println("Both strings"+string2+ "\t"+string5+" are not equal");
         
          
	}

}
