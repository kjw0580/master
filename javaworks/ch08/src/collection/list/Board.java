package collection.list;

public class Board {
	
	String subject;  //글제목
	String content;  //글내용
	String writer;   //글쓴이
	
	//생성자
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}
