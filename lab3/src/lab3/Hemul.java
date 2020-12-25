package lab3;
import java.util.Objects;

public class Hemul extends Person implements Move,Action, SpecialActionwReason{
	public Hemul (String Name, Location location)
	{
		this.setName(Name);
		this.setLocation(location);
	}
	
	@Override
	public void Action() {
		System.out.println(this.getName() + " wrapped himselves in blankets");
	}
	@Override
	public void Move(Location location) {
		System.out.println(this.getName() + " went to " + location.toString());
	}
	@Override
	public void SpecialActionwReason(String Reason, Location location) {
		System.out.println(this.getName() + " woke up" +  " because " + "his " + location.toString() + " " + Reason);
	}	
	
	@Override
    public String toString() {
        return "Name: " + this.getName()  + "location: " + this.getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hemul)) return false;
        Hemul hemul = (Hemul) o;
        return Objects.equals(this.getName(), hemul.getName()) &&
                Objects.equals(this.getLocation(), hemul.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLocation());
    }

	
}
