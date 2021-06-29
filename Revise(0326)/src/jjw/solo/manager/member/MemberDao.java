package jjw.solo.manager.member;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jjw.solo.manager.common.DAO;
import jjw.solo.manager.common.DaoInterface;

public class MemberDao extends DAO implements DaoInterface<MemberVO> {

	private PreparedStatement psmt;
	private ResultSet rs;
	
	private final static String SELECT_ALL = "SELECT * FROM MEMBER";
	private final static String INSERT = "INSERT INTO MEMBER VALUES(?,?,?,?)";
	
	public MemberDao() {
		super();
	}

	@Override
	public List<MemberVO> selectAll() {
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;
		try {
			psmt = conn.prepareStatement(SELECT_ALL);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}

	private void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public MemberVO select(MemberVO vo) {
		
		String SELECT = "SELECT * FROM MEMBER WHERE ID = ?";
		
		try {
			psmt = conn.prepareStatement(SELECT);
			psmt.setString(1, vo.getId());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public int insert(MemberVO vo) {
		
		int n = 0;
		try {
			psmt = conn.prepareStatement(INSERT);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getTel());
			
			n = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	@Override
	public int delete(MemberVO vo) {
		int n = 0;
		
		String DELETE = "DELETE FROM MEMBER WHERE ID = ?";
		
		try {
			psmt = conn.prepareStatement(DELETE);
			psmt.setString(1, vo.getId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
				
		return n;
	}

	@Override
	public int update(MemberVO vo) {
		int n = 0;
		
		String UPDATE = "UPDATE MEMBER SET NAME = ?, PASSWORD = ?, TEL = ? WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(UPDATE);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getTel());
			psmt.setString(4, vo.getId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}
	
}
