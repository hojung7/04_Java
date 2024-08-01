package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import service.MemberService;
import service.MemberServiceImpl;

public class MemberView {

	private MemberService service = null;
	private BufferedReader br = null;
	
	public MemberView() {
		try {
			service = new MemberServiceImpl();
			
			
			br = new BufferedReader(new InputStreamReader(System.in));
		
			
		}catch (Exception e) {
			System.out.println("***프로그램 실행 중 오류 발생***");
			e.printStackTrace();
			
			System.exit(0);
		}
			
		
	}
	
	
	
	
	
	
	
	
	
	
}
