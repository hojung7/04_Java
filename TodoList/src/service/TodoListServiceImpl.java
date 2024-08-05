package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import dao.TodoListDao;
import dao.TodoListDaoImpl;
import dto.Todo;

public class TodoListServiceImpl implements TodoListService {

	
	// dao 객체 부모 참조 변수 선언
	private TodoListDao dao = null;

	public TodoListServiceImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		dao = new TodoListDaoImpl();
	}

	@Override
	public Map<String, Object> todoListFullView() {
		// 할 일 목록 얻어오기
		
		// 완료된 할 일 개수 카운트
		return null;
	}
	
	
}
