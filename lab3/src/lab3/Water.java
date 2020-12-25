package lab3;

import java.util.Objects;

public class Water extends Inhuman implements SpecialActionwReason{
	Water(String Name)
	{
		this.setName(Name);
	}
	@Override
	public void SpecialActionwReason(String Reason, Location location) {
		System.out.println(this.getName() + " flowed in streams and waterfalls along the walls of the grotto and, " + Reason + "into its " + location.toString());
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
