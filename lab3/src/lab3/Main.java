package lab3;

public class Main {

	public static void main(String[] args) {
		
		Hemul hemul = new Hemul("Hemul",Location.UNKNOW,Status.UNKNOW);
		Moomintroll moomintroll = new Moomintroll("Moomintroll",Location.UNKNOW,Status.UNKNOW);
		moomintroll.Move(Location.HOLE);
		hemul.Move(Location.HOLE);
		hemul.Action("wrapped himself in blankets");
		moomintroll.Action("wrapped himself in blanket");
		moomintroll.SpecialAction(Location.LIGHT);
		hemul.SpecialActionwReason("was flooded with water",Location.SLEEPINGPLACE);
		Rain rain = new Rain("rain","warm summer");
		rain.Action("rustled");
		Water water = new Water("water");
		water.SpecialActionwReason("as if on purpose",Location.HOLE);
	}

}
