package service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import dto.Todo;

public interface TodoListService {

	/**
	 * 할 일 목록 반환 서비스
	 * @return
	 */
	public abstract Map<String, Object> todoListFullView();

}
