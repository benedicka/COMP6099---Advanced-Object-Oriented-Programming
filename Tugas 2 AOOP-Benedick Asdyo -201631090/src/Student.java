
public class Student {
	String nim,nama,no_hp;
	
	public Student(String _nama,String _nim, String _no_hp) {
		this.nim = _nim;
		this.nama = _nama;
		this.no_hp = _no_hp;
	}
	public String getNo_hp() {
		return no_hp;
	}
	public void setNo_hp(String no_hp) {
		this.no_hp = no_hp;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
}
