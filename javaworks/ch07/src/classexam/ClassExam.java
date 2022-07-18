package classexam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//Class의 정보 가져오기 (필드, 생성자, 메소드)
		
		System.out.println("클래스 이름 가져오기");
		
		//Class 객체생성
		Class<?> pClass1 = Class.forName("java.lang.String");
		System.out.println(pClass1.getName());
		
		System.out.println("------ 필드 정보 가져오기 ------");
		Field[] fields = pClass1.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println("------ 생성장 정보 가져오기 ------");
		Constructor<?>[] cons = pClass1.getConstructors();
		for(Constructor<?> c : cons) {
			System.out.println(c);
		}
		
		System.out.println("------ 메소드 정보 가져오기 ------");
		Method[] methods = pClass1.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}
}
