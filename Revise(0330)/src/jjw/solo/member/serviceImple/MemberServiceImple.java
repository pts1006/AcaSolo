package jjw.solo.member.serviceImple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jjw.solo.member.common.DataSource;
import jjw.solo.member.common.MemberService;
import jjw.solo.member.vo.MemberVO;

public class MemberServiceImple implements MemberService {

	private DataSource dataSource = DataSource.getIncetance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<MemberVO> selectAllMember() {
		
		MemberVO vo;
		List<MemberVO> list = new ArrayList<MemberVO>();
		String sql = "select * from member";
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
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
		
		return list;
	}

	@Override
	public MemberVO selectMember(MemberVO vo) {
		
		String sql = "select * from member where id = ?";
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return vo;
	}

	@Override
	public int insertMember(MemberVO vo) {
		
		String sql = "insert into member values(?,?,?,?)";
		
		int n = 0;
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
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
	public int updateMember(MemberVO vo) {
		
		String sql = "update member set password = ?, name = ?, tel = ? where id =?";
		
		int n = 0;
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getPassword());
			psmt.setString(2, vo.getName());
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

	@Override
	public int deleteMember(MemberVO vo) {
		
		String sql = "delete from member where id = ?";
		
		int n = 0;
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,vo.getId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	@Override
	public MemberVO logInCheck(MemberVO vo) {
		
		String sql = "select * from member where id = ? and password = ?";
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return vo;
	}
	
	public void close() {
		
		try {
			if(rs != null) rs.close();
			if(rs != null) psmt.close();
			if(rs != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
