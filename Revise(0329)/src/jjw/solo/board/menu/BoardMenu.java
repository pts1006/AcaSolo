package jjw.solo.board.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jjw.solo.board.common.BoardService;
import jjw.solo.board.serviceImple.BoardServiceImple;
import jjw.solo.board.vo.BoardVO;

public class BoardMenu {

	private Scanner sc = new Scanner(System.in);
	private BoardService service = new BoardServiceImple();
	
	private void menuTitle() {
		System.out.println("=====  메   뉴 =====");
		System.out.println("= 1. 목 록 보 기    =");
		System.out.println("= 2. 글 조 회      =");
		System.out.println("= 3. 글 등 록      =");
		System.out.println("= 4. 글 수 정      =");
		System.out.println("= 5. 글 삭 제      =");
		System.out.println("= 6. 그 만 하 기    =");
		System.out.println("===================");
		System.out.print("원하는 작업번호를 선택해라 : ");
	}
	
	public void mainMenu() {
		boolean isTrue = false;
		do {
			menuTitle();
			int key = sc.nextInt();
			switch(key) {
				case 1:
					boardList();
					break;
				
				case 2 :
					boardSelect();
					break;
				
				case 3 :
					boardCreate();
					break;
				
				case 4 :
					boardRevise();
					break;
				
				case 5 :
					boardDelete();
					break;
				
				case 6 :
					isTrue = true;
					System.out.println("[메세지] 종료합니다.");
					sc.close();
					break;
			}
		} while (!isTrue);
	}

	private void boardDelete() {
		
		BoardVO vo = new BoardVO();
		
		System.out.println("삭제할 아이디를 입력하시오 : ");
		vo.setBoardId(sc.nextInt());
		
		System.out.println("진짜 삭제할래? : ");
		String confirm = sc.next();
		
		if(confirm.equals("y") || confirm.equals("Y")) {
			service.delete(vo);
			System.out.println("삭제해 버렸다.");
		} else {
			System.out.println("삭제 안 했다.");
		}
		
	}

	private void boardRevise() {

		BoardVO vo = new BoardVO();
		
		System.out.println("수정할 아이디 입력 : ");
		vo.setBoardId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("내용을 입력 : ");
		vo.setBoardContents(sc.nextLine());
		sc.nextLine();
		
		int n = service.update(vo);
		
		if(n != 0) {
			System.out.println("정상적으로 수정됐다.");
		} else {
			System.out.println("수정 못 했다.");
		}
		
	}

	private void boardCreate() {
		BoardVO vo = new BoardVO();
		
		System.out.println("새 글 번호 입력 : ");
		vo.setBoardId(sc.nextInt());
		
		System.out.println("작성자 입력 : ");
		vo.setBoardWriter(sc.next());
		sc.nextLine();
		
		System.out.println("제목을 입력 : ");
		vo.setBoardTitle(sc.nextLine());
		sc.nextLine();
		
		System.out.println("내용을 입력 : ");
		vo.setBoardContents(sc.nextLine());
		sc.nextLine();
		
		int n = service.insert(vo);
		
		if(n != 0) {
			System.out.println("정상적으로 입력되었다.");
		} else {
			System.out.println("입력 안 됐다.");
		}
		
	}

	private void boardSelect() {
		BoardVO vo = new BoardVO();
		System.out.println("검색할 글 번호 입력 : ");
		vo.setBoardId(sc.nextInt());
		
		vo = service.select(vo);
		
		vo.toString(1);
	}

	private void boardList() {
		List<BoardVO> list = new ArrayList<BoardVO>();
		list = service.selectAll();
		System.out.println("==== 게시글 목록 보기 ====");
		for(BoardVO vo : list) {
			vo.toString(1);
		}
		System.out.println("==== 게시글 목록 종료 ====");
	}
	
}
