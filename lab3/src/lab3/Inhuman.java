package lab3;

public abstract class Inhuman {
	private String Name;
	public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
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
