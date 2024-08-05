package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import dto.Member;
import service.MemberService;
import service.MemberServiceImpl;

public class MemberView {
	
	private MemberService service = null;
	private BufferedReader br = null;
	
	// 기본 생성자
	public MemberView() {
		
		try {
		service = new MemberServiceImpl();
		
		br = new BufferedReader(new InputStreamReader(System.in));
	}catch (Exception e) {
		System.out.println("***프로그램 실행 중 오류 발생***");
		e.printStackTrace();
		
		System.exit(0); //프로그램 종료
	}

	}
	
	//------------------------------------
	// [메인 메뉴]
	
	public void mainMenu() {
	
		int input = 0;
		
		do {
		try {
		input = selectMenu();
		
		switch(input) {
		case 1: break;
		case 2: selectAll(); break;
		case 3: break;
		case 4: break;
		case 5: break;
		case 6: break;
		case 0: System.out.println("***프로그램종료***");break;
		
		default : System.out.println("###메뉴에 작성된 번호만 입력해주세요###");
	
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
			
		}while(input!=0);
	}
	//-------------------------------------------
	//[메뉴 출력]
	private int selectMenu() throws NumberFormatException, IOException {
	System.out.println("\n====회원 관리 프로그램====\n");
		
		System.out.println("1. 회원가입(추가)");
		System.out.println("2. 회원 전체 조회");
		System.out.println("3. 이름 검색 (동명이인 있으면 모두 조회)");
		System.out.println("4. 특정 회원 사용 금액 누적하기");
		System.out.println("5. 회원 정보 수정");
		System.out.println("6. 회원 탈퇴");
		System.out.println("0. 종료");
		
		System.out.println("메뉴 선택 >>>");
		
		int input = Integer.parseInt(br.readLine());
		System.out.println(); // 줄바꿈
		return input;
	}
	
	//----------------------------------------------------
	//[1. 회원가입(추가)]
	
	//---------------------------------------------------------
	//[2. 회원 전체 조회]
	public void selectAll() {
		System.out.println("\n---회원 전체 조회---\n");
		List<Member>memberList = service.getMemberList();
		
	if(memberList.isEmpty()) {
		System.out.println("\n###회원이 존재하지 않습니다###\n");
		return;
	}
	String[] gradeArr = {"일반", "골드", "다이아"};
	
	System.out.printf("%-6s %-12s %6s %5s \n",
			"[이름]", "[휴대폰 번호]", "[누적금액]", "[등급]");
	
	for(Member member: memberList) {
	System.out.printf("%-6s %-12s %6s %5s \n", member.getName(), member.getPhone(), member.getAmount(), gradeArr[member.getGrade()] );
	
	}
	}
}
