package jjw.solo.manager.boarder;

import java.util.List;

public interface Service {

	public List<BoarderVO> selectAll();
	public BoarderVO select(BoarderVO vo);
	public int insert(BoarderVO vo);
	public int delete(BoarderVO vo);
	public int update(BoarderVO vo);
	
}
