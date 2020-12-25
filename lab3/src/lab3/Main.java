package lab3;

public class Main {

	public static void main(String[] args) {
		Hemul hemul = new Hemul("Hemul",Location.UNKNOW);
		Moomintroll moomintroll = new Moomintroll("Moomintroll",Location.UNKNOW);
		moomintroll.Move(Location.HOLE);
		hemul.Move(Location.HOLE);
		hemul.Action();
		moomintroll.Action();
		moomintroll.SpecialAction(Location.LIGHT);
		hemul.SpecialActionwReason("was flooded with water",Location.SLEEPINGPLACE);
		Rain rain = new Rain("rain","warm summer");
		rain.Action();
		Water water = new Water("water");
		water.SpecialActionwReason("as if on purpose",Location.HOLE);
	}

}
