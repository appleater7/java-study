package db.board2;
// value object, NTT, DTO(Data transfer object)
// 자바에서 첫글자 대문자인건, 클래스 혹은 인터페이스
public class BoardInfoVO {
	
	private int biNum;
	private String biTitle;
	private String biContent;
	private String biCredat;
	private String biCretim;
	private int biCnt;
	private String biIsactive;
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
	public String getBiIsactive() {
		return biIsactive;
	}
	public void setBiIsactive(String biIsactive) {
		this.biIsactive = biIsactive;
	}
	@Override
	public String toString() {
		return "BoardInfoVO [biNum=" + biNum + ", biTitle=" + biTitle + ", biContent=" + biContent + ", biCredat="
				+ biCredat + ", biCretim=" + biCretim + ", biCnt=" + biCnt + ", biIsactive=" + biIsactive + ", uiNum="
				+ uiNum + ", uiName=" + uiName + "]";
	}
	
}
