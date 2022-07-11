package singleton.card;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardCompany company = CardCompany.getInstance();
		
		Card card1 = company.createCard();
		System.out.println("card1 : " + card1.getcardNum());
		
		Card card2 = company.createCard();
		System.out.println("card1 : " + card2].getcardNum());
		
		Card card3 = company.createCard();
		System.out.println("card1 : " + card3.getcardNum());
	}

}
