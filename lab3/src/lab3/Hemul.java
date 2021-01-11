package lab3;
import java.util.Objects;

public class Hemul extends Person implements Move, SpecialActionwReason, Action{
	public Hemul (String Name, Location location, Status status)
	{
		this.setName(Name);
		this.setLocation(location);
		this.setStatus(status);
	}
	@Override
    public void Action(String action) {
		System.out.println(this.getName() + " " + action);
	}
	@Override
	public void Move(Location location) {
		this.setLocation(location);
		System.out.println(this.getName() + " went to " + location.toString());
	}
	@Override
	public void SpecialActionwReason(String Reason, Location location) {
		if (this.getStatus() != Status.AWAKE)
		{
			this.setStatus(Status.AWAKE);
			System.out.println(this.getName() + " woke up" +  " because " + "his " + location.toString() + " " + Reason);
		}
	}	
	
	@Override
    public String toString() {
        return "Name: " + this.getName()  + "location: " + this.getLocation()+ "status: " + this.getStatus();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hemul)) return false;
        Hemul hemul = (Hemul) o;
        return Objects.equals(this.getName(), hemul.getName()) &&
                Objects.equals(this.getLocation(), hemul.getLocation()) &&
                Objects.equals(this.getStatus(), hemul.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLocation(), this.getStatus());
    }

	
}
