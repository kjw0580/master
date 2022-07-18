package shelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQuee(String Title) {
		shelf.add(Title);
	}

	@Override
	public String deQuee() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
