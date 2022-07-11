package singleton.card;

public class CardCompany {

	private static CardCompany instance;
	
	private CardCompany() {}
	
	//외부에서 CardCompany를 호출(참조)할 수 있도록 메서드 정의
	public static CardCompany getInstance() {
		if(instance == null)
			instance = new CardCompany();
		return instance;
	}
	
	//카드를 생산(생성)하는 메서드
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
