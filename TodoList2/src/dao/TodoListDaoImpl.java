package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dto.Todo;

public class TodoListDaoImpl implements TodoListDao{
		
	private final String FILE_PATH = "/io_test/TodoList.dat";
	
	// 회원 목록을 저장할 객체
	private List<Todo> todoList = null;
	
	// 스트림 객체 참조 변수
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	// 기본 생성자
  public TodoListDaoImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
	  File file = new File(FILE_PATH);
	  
	  if(file.exists()) {
		  try {
		  ois = new ObjectInputStream(new FileInputStream(file));
		  
		  todoList = (List<Todo>)ois.readObject();
	  }finally {
		  if(ois!=null) ois.close();
	  }
  }
	
  
  // 파일이 존재하지 않는 경우
  else {
	  todoList = new ArrayList<Todo>();
}
}
  
  //--------------------------------------------------------------------------
}