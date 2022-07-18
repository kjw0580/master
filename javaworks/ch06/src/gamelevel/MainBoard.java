package gamelevel;

public class MainBoard {

	public static void main(String[] args) {

		Player py = new Player();
		
		py.play(1);
		
		AdvancedLevel py1 = new AdvancedLevel();
		
		py.upgradeLevel(py1);
		py.play(2);

		SuperLevel py2 = new SuperLevel();
		
		py.upgradeLevel(py2);
		py.play(3);
	}

}
