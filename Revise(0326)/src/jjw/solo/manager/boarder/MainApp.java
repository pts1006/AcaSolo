package jjw.solo.manager.boarder;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public MainApp() {

		Date tdate;
		tdate = Date.valueOf("2021-03-26");
		
		BoarderDao dao = new BoarderDao();
		List<BoarderVO> list = new ArrayList<BoarderVO>();
		BoarderVO vo;
		
		list = dao.selectAll();
		for(BoarderVO vo1 : list) {
			vo1.toString();
		}
		
		System.out.println("==========================");
		vo = new BoarderVO();
		vo.setBoarderId(1);;
		vo = dao.select(vo);
		vo.toString();
		
		System.out.println("==========================");
		vo = new BoarderVO();
		vo.setBoarderId(3);;
		vo.setBoarderWriter("aa");
		vo.setBoarderDate(tdate);
		vo.setBoarderContents("c");
		vo.setBoarderTitle("dd");
		
		int n = dao.update(vo);
		
		if(n != 0 ){
			System.out.println("입력했다.");
		} else {
			System.out.println("실패했다.");
		}
		
	}
	
}
