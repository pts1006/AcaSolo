package jjw.solo.member.common;

import java.util.List;

import jjw.solo.member.vo.MemberVO;

public interface MemberService {

	public List<MemberVO> selectAllMember();
	public MemberVO selectMember(MemberVO vo);
	public int insertMember(MemberVO vo);
	public int updateMember(MemberVO vo);
	public int deleteMember(MemberVO vo);
	
	public MemberVO logInCheck(MemberVO vo);
	
}
