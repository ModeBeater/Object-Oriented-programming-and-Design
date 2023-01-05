package practice5;

import java.util.*;

public class ex4{
	static void check(String a) throws SpaceException{
		if(a.equals(" ")) {
			throw new SpaceException("Space");
		}
	}
    public static void main(String[] args){
       double leftOperand, result, rightOperand;
       String leftString, operator, rightString;
       StringTokenizer tokenizer;
       Scanner in = new Scanner(System.in);
       StringTokenizer input = new StringTokenizer(in.nextLine(), " ", true);
       while(input.hasMoreElements()) {
	       tokenizer = new StringTokenizer(input.nextToken(), "+//-//*///", true);// получить строку и сохранить ее в StringTokenizer(+ это как отделить стринги)
	       try{
	          leftString   = tokenizer.nextToken();// взять стринг с строки
	          check(leftString);
	          operator     = tokenizer.nextToken();
	          rightString  = tokenizer.nextToken();
	          try {
	        	  leftOperand  = Double.parseDouble(leftString);
	          }
	          catch(NumberFormatException e) {
	        	  System.out.println("leftOperand is not a number");
	          }
	          try {
	        	  rightOperand  = Double.parseDouble(leftString);
	          }
	          catch(NumberFormatException e) {
	        	  System.out.println("rightOperand is not a number");
	          }
	          leftOperand  = Double.parseDouble(leftString);
	          rightOperand = Double.parseDouble(rightString);
	          if (operator.equals("+"))
	             result = leftOperand + rightOperand;
	          else if(operator.equals("-")) {
	        	  result = leftOperand - rightOperand;
	          }
	          else if(operator.equals("*")) {
	        	  result = leftOperand * rightOperand;
	          }
	          else if(operator.equals("/")) {
	        	  result = leftOperand / rightOperand;
	          }
	          else
	             result = 0.0;
	          System.out.println("Result: " + result);
	       }
	       catch(SpaceException ex) {
	    	   System.out.print("");
	       }
	       catch (NoSuchElementException nsee){ // не хватает элемента 
	          System.out.println("Invalid syntax");
	       }
	       catch (NumberFormatException nfe){ // введено не число 
	          System.out.println("One or more operands is not a number");
	       }
       }
       in.close();
    }
}