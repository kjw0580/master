package chap07;

import sec03.verify.exam03.FileDownloadServlet;
import sec03.verify.exam03.HttpServlet;
import sec03.verify.exam03.LoginServlet;

public class Test7_3 {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
