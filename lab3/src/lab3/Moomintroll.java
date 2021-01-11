package lab3;

import java.util.Objects;

public class Moomintroll  extends Person implements Move,Action, SpecialAction{
	public  Moomintroll(String Name, Location location, Status status)
	{
		this.setName(Name);
		this.setLocation(location);
		this.setStatus(status);
	}
	@Override
	public void SpecialAction(Location location) {
		if (this.getStatus() != Status.SLEEPING) {
			this.setStatus(Status.SLEEPING);
			System.out.println (this.getName()+ "turned out the lamp and fell asleep " + location.toString());
		} else 
		{
			System.out.println (this.getName()+ " "  + this.getStatus().toString());
		}
	}
	@Override
	public void Move(Location location) {
		this.setLocation(location);
		this.setStatus(Status.AWAKE);
		System.out.println(this.getName() + " went to " + location.toString());
	}
	
	@Override
    public void Action(String action) {
		this.setStatus(Status.AWAKE);
		System.out.println(this.getName() + " " + action);
	}
	
	@Override
    public String toString() {
        return "Name: " + this.getName()  + "location: " + this.getLocation()+ "status: " + this.getStatus();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moomintroll)) return false;
        Moomintroll moomintroll = (Moomintroll) o;
        return Objects.equals(this.getName(), moomintroll.getName()) &&
                Objects.equals(this.getLocation(), moomintroll.getLocation()) &&
                Objects.equals(this.getStatus(), moomintroll.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLocation(), this.getStatus());
    }
    
	

}
