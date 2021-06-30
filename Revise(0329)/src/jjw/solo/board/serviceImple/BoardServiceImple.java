package jjw.solo.board.serviceImple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jjw.solo.board.common.BoardService;
import jjw.solo.board.common.Dao;
import jjw.solo.board.vo.BoardVO;

public class BoardServiceImple implements BoardService {

	private Dao boardDao = Dao.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<BoardVO> selectAll() {
		
		BoardVO vo;
		List<BoardVO> list = new ArrayList<BoardVO>();
		String SQL = "SELECT * FROM BOARD";
		
		try {
			conn = boardDao.getConnetction();
			psmt = conn.prepareStatement(SQL);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new BoardVO();
				vo.setBoardId(rs.getInt("boardId"));
				vo.setBoardWriter("boardWriter");
				vo.setBoardDate(rs.getDate("boardDate"));
				vo.setBoardTitle(rs.getString("boardTitle"));
				vo.setBoardContents(rs.getString("boardContents"));
				vo.setBoardHit(rs.getInt("boardHit"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return null;
	}

	@Override
	public BoardVO select(BoardVO vo) {

		String SQL = "SELECT * FROM BOARD WHERE BOARDID = ?";
		
		try {
			conn = boardDao.getConnetction();
			psmt = conn.prepareStatement(SQL);
			psmt.setInt(1, vo.getBoardId());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setBoardWriter(rs.getString("boardWriter"));
				vo.setBoardDate(rs.getDate("boardDate"));
				vo.setBoardTitle(rs.getString("boardTitle"));
				vo.setBoardContents(rs.getString("boardContents"));
				vo.setBoardHit(rs.getInt("boardHit"));
				hitUpdate(vo.getBoardId());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return null;
	}

	@Override
	public int insert(BoardVO vo) {
		
		int n = 0;
		
		String SQL = "INSERT INTO BOARD (BOARDID, BOARDWRITER, BOARDTITLE, BOARDCONTENTS) VALUES(?,?,?,?)";
		
		try {
			conn =boardDao.getConnetction();
			psmt = conn.prepareStatement(SQL);
			psmt.setInt(1, vo.getBoardId());
			psmt.setString(2, vo.getBoardWriter());
			psmt.setString(3, vo.getBoardTitle());
			psmt.setString(4, vo.getBoardContents());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	@Override
	public int update(BoardVO vo) {
		
		int n = 0;
		
		String SQL = "UPDATE BOARD SET BOARDCONTENTS = ? WHERE BOARDID = ?";
		
		try {
			conn = boardDao.getConnetction();
			psmt = conn.prepareStatement(SQL);
			psmt.setString(1, vo.getBoardContents());
			psmt.setInt(2, vo.getBoardId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	@Override
	public int delete(BoardVO vo) {
		
		int n = 0;
		
		String SQL = "DELETE FROM BOARD WHERE BOARDID = ?";
		
		try {
			conn = boardDao.getConnetction();
			psmt = conn.prepareStatement(SQL);
			psmt.setInt(1, vo.getBoardId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}
	
	private void hitUpdate(int id) {
		
		String SQL = "UPDATE BOARD SET BOARDHIT = BOARDHIT + 1 WHERE BOARDID = ?";
		
		try {
			conn = boardDao.getConnetction();
			psmt = conn.prepareStatement(SQL);
			psmt.setInt(1, id);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
	}
	
	private void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null)psmt.close();
			if(conn != null)conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
