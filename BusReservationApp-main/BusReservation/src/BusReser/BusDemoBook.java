package BusReser;

import java.util.*;

public class BusDemoBook 
{
	public static void main(String[] args) 
	{
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(50);
//		numbers.add(45);
//		System.out.println(numbers);
		
		ArrayList<BusDet> buses = new ArrayList<BusDet>(); // creating list of bus object
		buses.add(new BusDet(1,true,2));
		buses.add(new BusDet(2,false,2));
		buses.add(new BusDet(3,true,2));
		
		
		ArrayList<Booking> bookings = new ArrayList<Booking>();
//		bookings.add(new Booking())
		
//		for (BusDet b : buses)
//		{
//			System.out.println(buses);
//		}
		// busesaa print panna athoda address than print aagum
		// so toString method override panni maathikkalam
		
		for (BusDet b : buses)
		{
			System.out.println(b);
		}
		
		
		
		
		int useropt = 1;
		Scanner sc = new Scanner(System.in);
		while (useropt == 1) 
		{
			
			System.out.println("enter 1 to book , 2 to exit");
			
			
			useropt = sc.nextInt();
			
			for (BusDet b : buses)
			{
				System.out.println(b);
			}
			if (useropt == 1) 
			{
				Booking booking  = new Booking();
				if (booking.isAvailable(bookings,buses))
				{
					bookings.add(booking);
					System.out.println("booking is confirmed");
					
				}
				else 
				{
					System.out.println("sorry bbus is full try another bus or date");
				}
				
			}
			
		}
		
		
	
	
	}

}
