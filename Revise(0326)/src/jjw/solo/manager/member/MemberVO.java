package jjw.solo.manager.member;

public class MemberVO {

	private String id, password, name, tel;
	
	public MemberVO() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String toString() {
		System.out.println(id + " ");
		System.out.println(password + " ");
		System.out.println(name + " ");
		System.out.println(tel + " ");
		return null;
	}
	
}
