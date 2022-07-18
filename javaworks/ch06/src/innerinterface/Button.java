package innerinterface;

public class Button {

	OnClickListener listener;
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	
	
	
	
	static interface OnClickListener{
		public void onClick();
	}
}
