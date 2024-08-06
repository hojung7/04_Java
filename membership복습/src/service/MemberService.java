package service;

import java.util.List;

import dto.Member;

public interface MemberService {

	/**
	 * 전체회원 목록 조회
	 * @return
	 */
public abstract 	List<Member> getMemberList();
 
	
}
