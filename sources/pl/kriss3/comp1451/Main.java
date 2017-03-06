package pl.kriss3.comp1451;

import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	{
		run();
	}
	
	private static void run()
	{
		ArrayList<AppleDevice> devices = new ArrayList<>();
		
		devices.add(new APod(10, 16.1));
		devices.add(new APad(true, "Tiger"));
		devices.add(new APhone(11.4, "T-Mobile"));
		
		System.out.println("*** Device Storage ***");
		System.out.println();
		
		for(AppleDevice ad : devices)
		{
			ad.printDetails();
			System.out.println();
		}
		
		System.out.println("Finished !!!");
	}
}
