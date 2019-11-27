package sample;

public class HelloWorld {

	public static void main(String[] args) {
		String condition = "YourLoan_LoanInformation:LoanAmount";
		String SheetName[] = condition.split(":", 2);
		System.out.println(SheetName[0]);

	}

}
