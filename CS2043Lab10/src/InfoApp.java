
public class InfoApp {
	public static void main(String [ ] args)
	{
		System.out.println("Team 4 member list: ");

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
