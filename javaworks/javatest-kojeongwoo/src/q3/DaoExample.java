package q3;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
	    dao.select();
	    dao.insert();
	    dao.update();
	    dao.delete();
	}

	public static void main(String[] args) {
	    dbWork(new OracleDao());
	    dbWork(new MySqlDao());
	}
	
	//DataAccessObject 인터페이스를 생성하여 추상메소드각
	//OracleDao / MySqlDao 클래스에서 오버라이드로 구현한다
  }
