package jjw.solo.manager.common;

import java.util.List;

public interface DaoInterface<T> {

	public List<T> selectAll();
	public T select(T vo);
	public int insert(T vo);
	public int delete(T vo);
	public int update(T vo);
	
}
