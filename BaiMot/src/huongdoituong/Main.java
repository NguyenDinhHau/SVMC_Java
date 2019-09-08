package huongdoituong;

public class Main {

	public static void main(String[] args) {
		// mọi thứ trong bên ngoài đều quy về object và class java
		// ta có một con mèo, object là con mèo, 
		ConMeo conMeo = new ConMeo();
		// hướng đối tượng có 4 đặc điểm chính 
		/// tính đóng gói. private bảo mật thông tin.
		// khi ta tạo 1 class con mèo, ta không muốn cái lớp bên cạnh truy cập nó thì ta đóng gói nó lại
		// tính thừa kế :  extend
		// tính đa hình
		// tính trừu tượng
		//conMeo.getMaulong(); // chỉ để bảo mật dữ liệu
		// các cấp bảo mật  private , chỉ truy cập được trong cùng một lớp
		// protected truy cập được trong cùng package
		// public truy cập được mọi nơi
		// defult khi ta k muốn khai báo 
		ConMeo meoden = new ConMeo();
		meoden.setMaulong("Tím");
		ConMeo meodo = new ConMeo();
		meodo.setMaulong("Mau Trăng");
		System.out.println(meoden.getMaulong());
		System.out.println(meodo.getMaulong());
	}

}
