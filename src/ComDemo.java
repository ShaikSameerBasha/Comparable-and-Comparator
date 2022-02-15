
public class ComDemo implements Comparable<ComDemo>
{
	private String brand;
	private int ram;
	private int price;
	public ComDemo(String brand,int ram,int price)
	{
		super();
		this.brand=brand;
		this.ram=ram;
		this.price=price;
		
	}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
		
	}
	public int getRam()
	{
		return ram;
	}
	public void SetRam(int ram)
	{
		this.ram=ram;
	}
	public int getPrice()
	{
		return price;
	}
	public void SetPrice(int price)
	
	{
	
		this.price=price;
	}
	public String toString()
	{
		return brand+" "+ram+" "+price+" ";
	}
	public int compareTo(ComDemo lap2)//sorting based on the ram capacity
	{
		if(this.getRam()>lap2.getRam())
			return 1;
		else
			return -1;
	}
	

}
