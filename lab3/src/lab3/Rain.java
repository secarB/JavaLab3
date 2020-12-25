package lab3;

import java.util.Objects;

public class Rain extends Inhuman implements Action{
	private String Season;
	Rain(String Name, String Season)
	{
		this.setName(Name);
		this.setSeason(Season);
	}
	public void setSeason (String season)
	{
		this.Season= season;
	}
	public String getSeason ()
	{
		return this.Season;
	}
	@Override
	public void Action() {
		System.out.println(this.getSeason()+ " " + this.getName() +  " rustled");
	}
	@Override
    public String toString() {
        return "Name: " + this.getName()  + "Season: " + this.getSeason();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hemul)) return false;
        Rain rain = (Rain) o;
        return Objects.equals(this.getName(), rain.getName()) &&
                Objects.equals(this.getSeason(), rain.getSeason());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getSeason());
    }
	
	
}
