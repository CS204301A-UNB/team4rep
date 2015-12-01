
public class InfoApp {
	public static void main(String [ ] args)
	{
		InfoPrintSteen print1 = new InfoPrintSteen();
		System.out.println("Team 4 member list: ");

		InfoPrintMacDougall thomas = new InfoPrintMacDougall();
		thomas.printMacDougall();

		InfoPrintJones wow = new InfoPrintJones();
		wow.printJones();

		
		print1.printSteen();
	}
	
}
