package jjw.solo.manager.boarder;

import java.sql.Date;

public class BoarderVO {

	private int boarderId, boarderHit;
	private String boarderWriter, boarderTitle, boarderContents;
	private Date boarderDate;
	public int getBoarderId() {
		return boarderId;
	}
	public void setBoarderId(int boarderId) {
		this.boarderId = boarderId;
	}
	public int getBoarderHit() {
		return boarderHit;
	}
	public void setBoarderHit(int boarderHit) {
		this.boarderHit = boarderHit;
	}
	public String getBoarderWriter() {
		return boarderWriter;
	}
	public void setBoarderWriter(String boarderWriter) {
		this.boarderWriter = boarderWriter;
	}
	public String getBoarderTitle() {
		return boarderTitle;
	}
	public void setBoarderTitle(String boarderTitle) {
		this.boarderTitle = boarderTitle;
	}
	public String getBoarderContents() {
		return boarderContents;
	}
	public void setBoarderContents(String boarderContents) {
		this.boarderContents = boarderContents;
	}
	public Date getBoarderDate() {
		return boarderDate;
	}
	public void setBoarderDate(Date boarderDate) {
		this.boarderDate = boarderDate;
	}
	
	public String toString() {
		System.out.println(boarderId + " | ");
		System.out.println(boarderWriter + " | ");
		System.out.println(boarderDate + " | ");
		System.out.println(boarderTitle + " | ");
		if(boarderContents !=null) System.out.println(boarderContents + " | ");
		System.out.println(boarderHit);
		return null;
	}
	
}
