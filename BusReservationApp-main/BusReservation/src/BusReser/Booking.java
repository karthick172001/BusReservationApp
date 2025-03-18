package BusReser;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking 
{
	int BusNo;
	String PassengerName;
	Date date;
	public Booking()    //constructor
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Passenger name :");
		this.PassengerName = sc.next();
		System.out.println("Enter the bus no: ");
		this.BusNo = sc.nextInt();
		System.out.println("enter date in this format dd-mm-yyyy:");
		//date string format la than irukkum, so atha date format la maathanum
		
		String dateinput = sc.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			this.date = dateformat.parse(dateinput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<BusDet> buses)
	{
		int capacity = 0;
		for (BusDet bus : buses)
		{
			if(bus.getBusNo()==this.BusNo)
			{
				capacity = bus.getCapacity();
				
			}
		}
			int booked = 0;
			for (Booking b:bookings)
			{
				if(b.BusNo==this.BusNo && b.date.equals(this.date))
				{
					booked++;
				}
			}
			return booked<capacity?true:false;
		
	}

	
}
