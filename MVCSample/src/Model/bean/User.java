package Model.bean;

public class User {
	private String Name;
	private String Address;
	private boolean Alive;
	
	public String getName()
	{
		return this.Name;
	}
	
	public void setName(String name)
	{
		this.Name = name;
	}
	
	public String getAddress()
	{
		return this.Address;
	}
	
	public void setAddress(String address)
	{
		this.Address = address;
	}
	
	public boolean getAlive()
	{
		return this.Alive;
	}
	
	public void setAlive(boolean alive)
	{
		this.Alive = alive;
	}
	
	
}	
