package lab3;
import java.util.Objects;

public abstract class Person {
	private String Name;
	private Location location;
    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
	public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }
    public void changeLocation(Location location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

}
