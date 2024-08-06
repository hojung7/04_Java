package service;

import java.util.List;

import dao.MemberDao;
import dao.MemberDaoImpl;
import dto.Member;

public class MemberServiceImpl implements MemberService{

	private MemberDao dao = null;
	private String[] gradeArr = {"일반", "골드", "다이아"};
	
	public MemberServiceImpl() {
		dao = new MemberDaoImpl();
		
	}
	// 전체회원조회
	@Override
	public List<Member> getMemberList() {
		return dao.getMemberList();
	}
	



}
