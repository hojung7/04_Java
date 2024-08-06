package view;

import java.io.BufferedReader;

import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListView {

	private TodoListService  service =null; 
	private BufferedReader br = null;
	// 기본 생성자
	public TodoListView() {
	try {
		service = new TodoListServiceImpl();
		
	}catch
}
}
