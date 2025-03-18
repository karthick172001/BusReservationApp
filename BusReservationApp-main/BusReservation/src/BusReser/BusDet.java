package BusReser;

public class BusDet 
{
	private int BusNo;
	private Boolean ac;
	private int Capacity;
	
	
	
	public BusDet(int busNo, Boolean ac, int capacity) {
		
		this.BusNo = busNo;
		this.ac = ac;
		this.Capacity = capacity;
	}
	

	public int getBusNo() {    //access method
		return BusNo;
	}
	public void setBusNo(int busNo) {          //mutuator
		BusNo = busNo;
	}
	public Boolean getAc() {
		return ac;
	}
	public void setAc(Boolean ac) {
		this.ac = ac;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	
//	public void displayBusInfo()
//	{
//		System.out.println("bus no :"+BusNo+" ac "+ac+" Total capacity :"+ Capacity);
//	}


	@Override
	public String toString() {
		return "BusDet [BusNo=" + BusNo + ", ac=" + ac + ", Capacity=" + Capacity + "]";
	}
}
