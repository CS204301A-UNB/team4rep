
public class InfoApp {
	public static void main(String [ ] args)
	{
		InfoPrintSteen print1 = new InfoPrintSteen();
		System.out.println("Team 4 member list: ");


		print1.printSteen();

		InfoPrintMacDougall thomas = new InfoPrintMacDougall();
		thomas.printMacDougall();


		InfoPrintJones wow = new InfoPrintJones();
		wow.printJones();


		InfoPrintElrobey elrobey = new InfoPrintElrobey();
		elrobey.printElrobey();
		
		InfoPrintHryniowski hryniowski = new InfoPrintHryniowski();
		hryniowski.printHryniowski();

	}
	
}
