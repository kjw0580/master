package q2;

public class Engineer extends Employee {
	
	//부모 클래스에서 생성자 선언이 있으면 
	//자식 생성자에서 super 를 통하여 호출해주지 않았을 경우 컴파일 에러가 난다.
		public Engineer(String name) {
			super("");
		}

		private String skillset;

	    public String getSkillSet(){
	      return skillset;
	    }
	    
	    public void setSkillSet(String skillset){
	      this.skillset = skillset;
	    }
	    
	    
	}
