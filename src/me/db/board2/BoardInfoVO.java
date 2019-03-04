package me.db.board2;

public class BoardInfoVO {
	private int biNum;
	private String biTitle;
	private String biContent;
	private String biCredat;
	private String biCretim;
	private int biCnt;
	private String biIsActive;
	private int uiNum;
	private String uiName;
	
		
	public int getUiNum() {
		return uiNum;
	}
	public void setUiNum(int uiNum) {
		this.uiNum = uiNum;
	}
	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
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
		return "BoardInfoVO [biNum=" + biNum + ", biTitle=" + biTitle + ", biContent=" + biContent + ", biCredat="
				+ biCredat + ", biCretim=" + biCretim + ", biCnt=" + biCnt + ", biIsActive=" + biIsActive + ", uiNum="
				+ uiNum + ", uiName=" + uiName + "]";
	}
	
}
