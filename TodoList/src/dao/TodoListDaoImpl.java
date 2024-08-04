package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dto.Todo;

public class TodoListDaoImpl implements TodoListDao {

	private final String FILE_PATH = "/io_test/TodoList.dat";
	
	// 회원 목록을 저장해둘 List 객체
	private List<Todo> todoList = null;
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	public TodoListDaoImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File(FILE_PATH);
		
		if(file.exists()) {
			try {
			
				ois= new ObjectInputStream(new FileInputStream(FILE_PATH));
				
				todoList = (ArrayList<Todo>)ois.readObject();
				
			}finally {
				if(ois != null) ois.close();
			}
		}
		else {
			todoList = new ArrayList<Todo>();
			
		}
	}
	// TodoList 반환
	@Override
	public List<Todo> getTodoList() {
		return todoList;
}
	
	@Override
	public boolean addTodo(Todo todo) throws IOException {
		todoList.add(todo);
		
		saveFile();
		return true;
	}
	
	// 파일 저장
	@Override
	public void saveFile() throws IOException {
		
		// TodoList를 지정된 파일에 출력(저장)
		try {
		oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
		oos.writeObject(todoList);
		} finally {
			if(oos != null)oos.close(); // flush() + 메모리 반환
		}
		
	}
}
