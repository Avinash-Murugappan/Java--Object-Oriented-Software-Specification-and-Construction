/*
 * pre condition:- principal, rate and payment all are positive
 * 				   and payment is sufficiently large to drive the principal to zero.
 * post:- return the number of months required to pay off the principal
 *
 *Contributors: Amish, Avinash, Rushil Nandan.
 */
public class Loan {
	public static int months(int principal, double rate, int payment) {
		double newPrincipal,oldPrincipal;
		double monthlyInterestRate;
		double month=0;
		int a=0;
		monthlyInterestRate=rate/12;
		oldPrincipal=principal;
		newPrincipal=principal;
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

