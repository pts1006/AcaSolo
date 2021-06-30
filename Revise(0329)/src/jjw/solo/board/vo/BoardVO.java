package jjw.solo.board.vo;

import java.util.Date;

public class BoardVO {

	public int boardId, boardHit;
	public String boardWriter, boardTitle, boardContents;
	public Date boardDate;
	
	public BoardVO() {}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public int getBoardHit() {
		return boardHit;
	}

	public void setBoardHit(int boardHit) {
		this.boardHit = boardHit;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContents() {
		return boardContents;
	}

	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	
	public String toString(int n) {
		
		System.out.println(boardId + " | ");
		System.out.println(boardWriter + " | ");
		System.out.println(boardDate + " | ");
		System.out.println(boardTitle + " | ");
		
		if(n == 1) {
			System.out.println(boardContents + " | ");
			
		} System.out.println(boardHit);
		return null;
	}
	
}
