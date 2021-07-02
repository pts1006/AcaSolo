package jjw.solo.member.face;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jjw.solo.member.common.MemberService;
import jjw.solo.member.serviceImple.MemberServiceImple;
import jjw.solo.member.vo.MemberVO;

public class Face {

	private MemberService ms = new MemberServiceImple();
	private Scanner sc = new Scanner(System.in);

	public void face() {

		System.out.println("======== 화 면 ========");
		System.out.println("1.    전체 사용자 보기    ");
		System.out.println("2.     사용자 등록       ");
		System.out.println("3.     사용자 검색       ");
		System.out.println("4.     사용자 삭제       ");
		System.out.println("5.     사용자 수정       ");
		System.out.println("6.       돌아가기        ");
		System.out.print("어떡하실? : ");

	}

	public void faceLogic() {
		
		boolean Loop = true;
		while(Loop == true) {
			face();
			int select = sc.nextInt();
			switch(select) {
				case 1 :
					//목록 보기
					memberList();
					break;
				case 2 :
					// 사용자 등록
					memberCreate();
					break;
				case 3 :
					// 사용자 검색
					memberSelect();
					break;
				case 4 :
					// 사용자 삭제
					memberDelete();
					break;
				case 5 :
					// 사용자 수정
					memberRevise();
					break;
				case 6 :
					// 돌아가기
					Loop = false;
					MenuInterface inter = new MenuInterface();
					inter.interfaceLogic();
					break;
			
			}
		}
		
	}

	private void memberList() {
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		list = ms.selectAllMember();
		System.out.println("==== 사 용 자 목 록 ====");
		for (MemberVO vo : list) {
			vo.toString();
		}
		System.out.println("=======================");
	}

	private void memberCreate() {
		
		MemberVO vo = new MemberVO();
		
		System.out.print("등록할 ID를 입력 : ");
		vo.setId(sc.next());
		
		System.out.print("Password를 지정 : ");
		vo.setPassword(sc.next());
		
		System.out.print("사용자 NAME 지정: ");
		vo.setName(sc.next());
		
		System.out.print("사용자 TEL 지정 : ");
		vo.setTel(sc.next());
		
		int n = ms.insertMember(vo);
		
		if(n != 0) System.out.println("정상적으로 입력됐다.");
		else System.out.println("입력 안 됐다.");
		
	}

	private void memberSelect() {
		
		MemberVO vo = new MemberVO();
		
		System.out.print("검색할 사용자 ID를 입력해라 : ");
		vo.setId(sc.next());
		
		vo = ms.selectMember(vo);
		
		vo.toString();
		
	}

	private void memberDelete() {
		
		MemberVO vo = new MemberVO();
		
		System.out.print("삭제할 사용자 ID 입력 : ");
		vo.setId(sc.next());
		
		System.out.print("진짜 삭제함? Y or N : ");
		String answer = sc.next();
		
		if (answer.equals("y") || answer.equals("Y")) {
			ms.deleteMember(vo);
			System.out.println("삭제해 버렸다.");
		}
		else System.out.println("삭제 안 했다.");
	}

	private void memberRevise() {
		
		MemberVO vo = new MemberVO();
		
		System.out.print("수정할 사용자 ID를 입력 : ");
		vo.setId(sc.next());
		
		System.out.print("수정 Password : ");
		vo.setPassword(sc.next());
		
		System.out.print("수정 Name : ");
		vo.setName(sc.next());
		
		System.out.print("수정 Tel : ");
		vo.setTel(sc.next());
		
		int n = ms.updateMember(vo);
		
		if (n != 0) System.out.println("저장됐다.");
		else System.out.println("저장 안 됐다.");
		
	}

}
