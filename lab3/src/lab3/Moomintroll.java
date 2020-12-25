package lab3;

import java.util.Objects;

public class Moomintroll  extends Person implements Move,Action, SpecialAction{
	public  Moomintroll(String Name, Location location)
	{
		this.setName(Name);
		this.setLocation(location);
	}
	
	@Override
	public void Action() {
		System.out.println (this.getName() + " wrapped himselves in blankets");
	}
	@Override
	public void Move(Location location) {
		System.out.println(this.getName() + " went to " + location.toString());
	}
	@Override
	public void SpecialAction(Location location) {
		System.out.println (this.getName()+ "turned out the lamp and fell asleep " + location.toString());
	}
	@Override
    public String toString() {
        return "Name: " + this.getName()  + "location: " + this.getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moomintroll)) return false;
        Moomintroll moomintroll = (Moomintroll) o;
        return Objects.equals(this.getName(), moomintroll.getName()) &&
                Objects.equals(this.getLocation(), moomintroll.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLocation());
    }
    
	

}
