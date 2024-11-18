package page;

	import base.TestBase;

	public class PaymentPage extends TestBase{
		
		void PaymentDebit (int amount)
		{
			System.out.println("Payment with Debit");
		}
		void PaymentCredit (int amount)
		{
			System.out.println("Payment with Credit");
		}
		void PaymentCreditNote (int amount)
		{
			System.out.println("Payment with Note");
		}
		void PaymentLater (int amount)
		{
			System.out.println("Payment Later");
		}
}
