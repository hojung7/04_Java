package test;

import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import student.Student;

public class Test {


	public static void main(String[] args)  {
	
	ArrayList<Student> list =  new ArrayList<Student>();
	
    list.add(new Student("강건강", 84));
    list.add(new Student("남나눔", 78));
    list.add(new Student("도대담", 96));
    list.add(new Student("류리라", 67));

	
	    
// for문 내 println()구문에서 s 출력 시 자동으로 toString()이 호출 되는 데
    //   Object.toString()을 호출해 반환하고 있어서 주소 형태로 출력되는 문제 발생
	
		
    
    
	  for(int i = 0 ; i < list.size();i++) {
		  Student s = list.get(i);
		  System.out.println(s);
//		  System.out.printf("%s 학생의 점수 : %d점", s.getName(), s.getScore());
	  

	}
	}
}	

