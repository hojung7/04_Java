package service;

import java.io.IOException;
import java.util.List;

import dto.Todo;

public interface TodoListService {

	/**
	 * 전체 목록 조회
	 * @return todoList
	 */
	public abstract List<Todo> getTodoList();
	
	/**
	 * 할 일 제목 추가
	 * @param title
	 * @return
	 */
	public abstract boolean addTodo(String title) throws IOException;

	
}
