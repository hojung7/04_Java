package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import dto.Todo;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListView {

	private TodoListService service = null;
	private BufferedReader br = null;
	private DateTimeFormatter currentDateTime;
	
	public TodoListView() {
		try{
	    service = new TodoListServiceImpl();
		br = new BufferedReader(new InputStreamReader(System.in));
		LocalDateTime currentDateTime = LocalDateTime.now();
	}catch(Exception e){
		
		System.out.println("***프로그램 실행 중 오류 발생***");
		e.printStackTrace();
		
		System.exit(0);
	}
}
	
	//-----------------------------------------
	// [메인 메뉴]
	public void mainMenu() {
		
		int input = 0;
		do {
			try {
				input = selectMenu();
				
				switch(input) {
				case 1: selectAll(); break;
				case 2: selectIndex(); break;
				case 3: addTodo(); break;
				case 4: completTodo(); break;
				case 5: break;
				case 6: deleteTodo();break;
				case 0: System.out.println("***프로그램 종료***");break;
				default:System.out.println("###메뉴에 작성된 번호만 입력 해주세요###");
				
				System.out.println("===============================");
				}
			}catch(NumberFormatException e) {
				System.out.println("\n###숫자만 입력 해주세요###\n");
				input = -1;
			}catch(IOException e) {
				System.out.println("/n###입출력 관련 예외 발생###/n");
			}catch(Exception e){
				e.printStackTrace();
				
			}
			
		}while(input!=0); 
			
		
	}
	
	
	//-----------------------------------------
	// [메뉴 출력/선택하는 메서드]
	private int selectMenu() throws NumberFormatException, IOException {
		System.out.println("\n===== Todo List =====\n");
		
		System.out.println("1. Todo List Full View");
		System.out.println("2. Todo Detail View");
		System.out.println("3. Todo Add");
		System.out.println("4. Todo Complete");
		System.out.println("5. Todo Update");
		System.out.println("6. Todo Delete");
		System.out.println("0. Exit");
		
		System.out.println("select menu number>>>");
		int input = Integer.parseInt(br.readLine());
		return input;
		
		
	}
	
	
	//---------------------------------------------
	//[1. Todo List Full view]
	private void selectAll() {
		System.out.println("===========1. Todo List Full View============");
		
		// 회원 목록을 조회해 반환하는 서비스 호출
		List<Todo> todoList = service.getTodoList();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
		String formattedDateTime = currentDateTime.format(formatter);
		for(Todo todo : todoList) {
			for(int i =0; i< todoList.size();i++) {
			System.out.printf("[%d] %s %s",  i, formatter, todo.getTitle());
		}
		}
		
	}
	//[2. Todo Detail View]
	private void selectIndex() throws NumberFormatException, IOException {
		System.out.println("===========2. Todo detail View============");
		System.out.println("인덱스 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		List<Todo> todoList = service.getTodoList();
		if(index > 0 && index < todoList.size()) {
			Todo todo = todoList.get(index);
			System.out.println(todo);
		}else {
			System.out.println("### 입력한 인덱스 번호에 할 일(Todo)가 존재하지 않습니다 ###");
		}
	}
	//[3. Todo Add]
	private void addTodo() throws IOException {
		System.out.print("할 일 제목 입력 : ");
		String title = br.readLine();
		
		boolean result = service.addTodo(title);
		if(result) {
			for(int i = 0 ; i < title.length();i++) {
			System.out.printf("\n [%s]인덱스에 추가되었습니다\n", i);
		}
     }
	//[4.Todo Complete]		
		private void completeTodo() throws NumberFormatException, IOException {
			System.out.println("===============[4. Todo Complete]===============");
			System.out.println("O <-> X 변경할 인덱스 번호 입력 : ");
			int index = Integer.parseInt(br.readLine());
			List<Todo> todoList = service.getTodoList();
		}
			
		
	//[5. ]
	//[6.Todo Delete]
	private void deleteTodo() {
		System.out.println("===============[6. Todo Delete]===============");
		System.out.println("삭제할 인덱스 번호 입력 :");
		int index = Integer.parseInt(br.readLine());
		List<Todo> todoList = service.getTodoList();
		if(index>=0 && index< todoList.size() ) {
			todoList.remove(index)
			System.out.println("삭제 되었습니다.");
		}else {
			System.out.println("### 입력한 인덱스에 Todo가 존재하지 않습니다 ###");
		}
	}
		
	}
	
}
