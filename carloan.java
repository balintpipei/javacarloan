public class CarLoan {

  public void calc(int carLan, int loanLength, int interestRate, int downPayment) {
    if(loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if(downPayment >= carLan) {
      System.out.println("The car can be paid in full.");
    } else {
      int remainingBalance = carLan - downPayment;
      int months = loanLength * 12;
      //balance without interest
      int monthlyBalance = remainingBalance / months;
      //full monthly payment with itnerest
      int interest = monthlyBalance * interestRate / 100;

      System.out.println(interest + monthlyBalance);
    }
  }

	public static void main(String[] args) {
	  CarLoan test = new CarLoan();
    test.calc(10000, 3, 5, 2000);

	}
}
