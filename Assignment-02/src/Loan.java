/*SWE 619 Assignment 2 
 * 
 * This class has a method that calculates the number of months needed to pay off a loan of a given size at a fixed annual interest rate and a fixed monthly payment.
 * Effects:-
 * 		- Return the number of months required to pay off the principal.
 * 		- Throws IllegalArgumentException if
 * 			 1) If the principal is less than Zero
 *  		 2) If the payment is less than Zero
 * 			 3) If the rate is less than Zero
 * 			 4) If the payment is less the minimum installment such that the principal grows instead of shrinking.
 * 			
 * 
 * Contributions :- 
 * 		- Avinash Arunachalam A Murugappan[G01163980] 
 * 				- Implementation for the pre condition to post condition for payment, principle, rate.
 * 				- JAVA docs for part-2
 * 		- Rushil Nandan Dubey [G01203932]
 * 				- Implemented the whole structure for Loan class
 * 				- JAVA docs part-1
 * 		- Amish Papneja [G01211503]
 * 				- Implemention for the pre conditions to post conditions for the minimum payment requirment required for principal to shrink rather then grow 
 * 				- JAVA docs part-3
 * 
 *  	In addition to this, everyone contributed equally with their ideas during building the code together.		
 */


public class Loan {
	/** 
	 * @author Amish, Avinash, Rushil Nandan
	 * @param principal, rate, payment, newPrincipal, oldPrincipal, monthlyInterestRate, month, a
	 * @throws IllegalArgumentException :- Non-null parameter value is inappropriate
	 *
	 */
	public static int months(int principal, double rate, int payment) {
		double newPrincipal,oldPrincipal;
		double monthlyInterestRate;
		double month=0;
		int a=0;
		monthlyInterestRate=rate/12;
		oldPrincipal=principal;
		newPrincipal=principal;
		if(principal<=0 && rate<=0 && payment<=0) {
			throw new IllegalArgumentException("Non-null parameter value is inappropriate");
			
		}
		
		if((payment*12)-(principal*rate)<=0) {
			throw new IllegalArgumentException("The payment must be Big enough");
		}
		while(newPrincipal>payment) {
			newPrincipal = oldPrincipal * (1 +monthlyInterestRate ) - payment;
			month++;
			oldPrincipal=newPrincipal;
		}
		if(newPrincipal>0) {
			month=(newPrincipal/payment)+month;
			month++;
		}
		a=(int)month;
		return a;
		
	}
	public static void main(String args[])
	{
		int month;
		month=months(100000,0.08,1000);
		System.out.println(month);
	}
	

}