package chap07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dcp = new DmbCellPhone("Samsung Galaxy22+", "Green", 10);
		
		System.out.println("모델: " + dcp.model);
		System.out.println("색상: " + dcp.color);
		
		System.out.println("채널: " + dcp.channel);
		
		dcp.powerOn();
		dcp.powerOff();
		dcp.sendVoice("여보세요");
		dcp.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dcp.sendVoice("아 ~ 예 반갑습니다.");
		dcp.hangUp();
		
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
	}

}
