package dao;

import java.util.List;

import dto.Member;

public interface MemberDao  {

	/**
	 * memberList반환
	 * @return
	 */
	List<Member> getMemberList();

}
