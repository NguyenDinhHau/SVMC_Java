package huongdoituong;

public class ConMeo { //  object 
	// constructor nó như một cái vỏ để tạo nó, 
	
	private String tiengnoi = "Meo Meo"; // thuộc tính, property
	private int sochan = 4;
	private String maulong = "đen"; /// 
	// method : action hành dộng
	public ConMeo(String tiengnoi, int sochan, String maulong) { // constructor
		super();
		this.tiengnoi = tiengnoi;
		this.sochan = sochan;
		this.maulong = maulong;
	}
	public String getTiengnoi() {
		return tiengnoi;
	}
	public void setTiengnoi(String tiengnoi) {
		this.tiengnoi = tiengnoi;
	}
	public int getSochan() {
		return sochan;
	}
	public void setSochan(int sochan) {
		this.sochan = sochan;
	}
	public String getMaulong() {
		return maulong;
	}
	public void setMaulong(String maulong) {
		this.maulong = maulong;
	}
	public ConMeo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
