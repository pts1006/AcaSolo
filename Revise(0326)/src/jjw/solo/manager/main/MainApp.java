package jjw.solo.manager.main;

import java.util.ArrayList;
import java.util.List;

import jjw.solo.manager.member.MemberDao;
import jjw.solo.manager.member.MemberVO;

public class MainApp {

	public static void main(String[] args) {
		
		// 오라클 설정을 못 해서 실행이 안 됨.
		
		MemberDao dao = new MemberDao();
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;
		
		list = dao.selectAll();
		
		for(MemberVO vo1 : list) {
			vo1.toString();
			
		}
		
		System.out.println("=====================");
		
		vo = new MemberVO();
		vo.setId("kim");
		vo.setPassword("1234");
		vo.setName("김치국");
		vo.setTel("010-3333-3333");
		
		int n = dao.update(vo);
		
		if (n != 0) {
			System.out.println("정상 입력");
		} else {
			System.out.println("실패");
		}
		
		System.out.println("=====================");
		
		vo = new MemberVO();
		vo.setId("dd");
		vo = dao.select(vo);
		if(vo.getName() != null) {
			vo.toString();
		} else {
			System.out.println("존재X");
		}
		
		System.out.println("=====================");
		vo = new MemberVO();
		vo.setId("park");
		int n2 = dao.delete(vo);
		if(n2 != 0) {
			System.out.println("삭제");
		} else {
			System.out.println("삭제X");
		}
	}

}
