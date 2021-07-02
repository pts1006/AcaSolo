package jjw.solo.member.logIn;

import java.util.Scanner;

import jjw.solo.member.common.MemberService;
import jjw.solo.member.face.Face;
import jjw.solo.member.serviceImple.MemberServiceImple;
import jjw.solo.member.vo.MemberVO;

public class LogIn {

	private Scanner sc = new Scanner(System.in);
	private MemberService ms = new MemberServiceImple();
	
	public void logIn() {
		
		MemberVO vo = new MemberVO();
		
		System.out.println("========로 그 인========");
		System.out.print("아이디 입력 : ");
		vo.setId(sc.next());
		System.out.print("비밀번호 입력 : ");
		vo.setPassword(sc.next());
		
		vo = ms.logInCheck(vo);
		
		if (vo.getName() != null) {
			System.out.println(vo.getName() + "님 환영합니다.\n");
			Face fc = new Face();
			fc.faceLogic();
		} else {
			System.out.println("아이디 또는 패스워드가 일치X");
		}
	}
	
}
