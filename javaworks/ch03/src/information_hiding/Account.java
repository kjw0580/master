package information_hiding;

public class Account {

	//필드
	private String ano; // 계좌 번호
	private String owner; //계좌주
	private int balance; //잔액
	
	public Account(){}
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//외부 입력매개변수와 필드 이름을 같게함, 필드쪽에 this 객체 사용
	//set+필드이름()
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
}
