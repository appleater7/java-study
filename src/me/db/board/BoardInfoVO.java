package me.db.board;

public class BoardInfoVO {
	private int biNum;
	private String biTitle;
	private String biContent;
	private String biCredat;
	private String biCretim;
	private int biCnt;
	private String biIsActive;
	
	public int getBiNum() {
		return biNum;
	}
	public void setBiNum(int biNum) {
		this.biNum = biNum;
	}
	public String getBiTitle() {
		return biTitle;
	}
	public void setBiTitle(String biTitle) {
		this.biTitle = biTitle;
	}
	public String getBiContent() {
		return biContent;
	}
	public void setBiContent(String biContent) {
		this.biContent = biContent;
	}
	public String getBiCredat() {
		return biCredat;
	}
	public void setBiCredat(String biCredat) {
		this.biCredat = biCredat;
	}
	public String getBiCretim() {
		return biCretim;
	}
	public void setBiCretim(String biCretim) {
		this.biCretim = biCretim;
	}
	public int getBiCnt() {
		return biCnt;
	}
	public void setBiCnt(int biCnt) {
		this.biCnt = biCnt;
	}
	public String getBiIsActive() {
		return biIsActive;
	}
	public void setBiIsActive(String biIsActive) {
		this.biIsActive = biIsActive;
	}
	@Override
	public String toString() {
		return "번호=" + biNum + ", 제목=" + biTitle + ", 내용=" + biContent + ", 생성일="
				+ biCredat + ", 생성시간=" + biCretim + ", 조회수=" + biCnt + ", 유효=" + biIsActive + "]";
	} 
	
}
