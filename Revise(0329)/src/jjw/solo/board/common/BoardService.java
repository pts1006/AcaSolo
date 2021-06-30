package jjw.solo.board.common;

import java.util.List;

import jjw.solo.board.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> selectAll();
	public BoardVO select(BoardVO vo);
	public int insert(BoardVO vo);
	public int update(BoardVO vo);
	public int delete(BoardVO vo);
	
}
