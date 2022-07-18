package innerinterface;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button();
		CallListener call = new CallListener();
		
		btn.setListener(call);
		btn.touch();
		
		btn.setListener(new MessageListener());
		btn.touch();
		
		btn.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
				
			}
		});
		
		btn.touch();
	}

}
