package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import dao.TodoListDao;
import dao.TodoListDaoImpl;
import dto.Todo;

public class TodoListServiceImpl implements TodoListService {

	
	// dao 객체 부모 참조 변수 선언
	private TodoListDao dao = null;
	
	// 기본 생성자
	// TodoListServiceImpl 객체 생성 시
	// TodoListDaoImpl 객체도 생성
	public TodoListServiceImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		dao = new TodoListDaoImpl();
		
	}
	
	// DAO에서 조회한 TodoList 그대로 반환
	@Override
	public List<Todo> getTodoList() {
		return dao.getTodoList();
	}
	
	// 할 일 추가
	@Override
	public boolean addTodo(String title) throws IOException {
		
		Todo todo = new Todo(title, title, false, null);
		
		boolean result = dao.addTodo(title);
		return result; 
	}

}
