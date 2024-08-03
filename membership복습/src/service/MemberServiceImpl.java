package service;

import dao.MemberDao;
import dao.MemberDaoImpl;

public class MemberServiceImpl implements MemberService {

	private MemberDao dao = null;
	
	public MemberServiceImpl() {
		 dao = new MemberDaoImpl();
	}
}
