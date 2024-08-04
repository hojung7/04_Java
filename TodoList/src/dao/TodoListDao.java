package dao;

import java.io.IOException;
import java.util.List;

import dto.Todo;

public interface TodoListDao {

	/**
	 * DAO객체가 가지고 있는  TodoList 반환
	 * @return TodoList
	 */
	List<Todo> getTodoList();

/**
 * 할일 추가
 * @param TODO
 * @return
 * @throws IOException
 */
	boolean addTodo(String title) throws IOException;
	
	/**
	 * 파일 저장
	 */
	 void saveFile() throws IOException;

	boolean addTodo(Todo todo) throws IOException;
}
