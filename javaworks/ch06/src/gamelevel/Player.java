package gamelevel;

public class Player {

	private PlayerLevel level;
	
	//생성자 - 초보자로 생성됨
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
