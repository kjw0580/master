package shelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		shelfQueue.enQuee("반응형 웹");
		shelfQueue.enQuee("혼공 Java");
		shelfQueue.enQuee("스프링부트");
		
		System.out.println("현재 리스트의 개수" + shelfQueue.getSize());
		
		System.out.println(shelfQueue.deQuee());
		System.out.println(shelfQueue.deQuee());
		System.out.println(shelfQueue.deQuee());
	}

}
