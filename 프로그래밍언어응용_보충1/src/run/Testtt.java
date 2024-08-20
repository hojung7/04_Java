package run;

import java.util.HashSet;
import java.util.Scanner;

public class Testtt {
   public static void main(String[] args) {
	HashSet<String>set = new HashSet<String>();
	set.add("문미미");
	set.add("박보배");
	set.add("송성실");
	set.add("윤예의");
	set.add("정재수");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("검색할 이름을 입력하세요 : ");
	String input = sc.next();
	boolean isExist = true;
	for(String s :set) {
		if(s.equals(input))
		isExist =true;
		break;
		
	}

   if(isExist) {
	  System.out.println("존재하는 회원 입니다.");
	   
   }else {
	   System.out.println("존재하지 않는 회원입니다");
   }
}
}

