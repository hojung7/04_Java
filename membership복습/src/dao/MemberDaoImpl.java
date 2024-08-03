package dao;


import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dto.Member;

public class MemberDaoImpl implements MemberDao {
 
	private final String FILE_PATH = "/io_test/membership.dat";

	private List<Member>memberList = null;
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	public MemberDaoImpl() {
		
		File file = new File(FILE_PATH);
		
		if (file.exists()) {
			try {
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				memberList = (ArrayList<Member>)ois.readObject();		
			}finally {
				if(ois != null) ois.close();
			}
		}
		else {
			memberList = new ArrayList<Member>() ;
		}
		}









}
