package bai4;

import java.util.Scanner;

public class Person {
	private String hoten,macode,ngaysinh,hesoluong;
	
	

	public Person() {
		super();
	}

	public Person(String hoten, String macode, String ngaysinh, String hesoluong) {
		super();
		this.hoten = hoten;
		this.macode = macode;
		this.ngaysinh = ngaysinh;
		this.hesoluong = hesoluong;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getMacode() {
		return macode;
	}

	public void setMacode(String macode) {
		this.macode = macode;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(String hesoluong) {
		this.hesoluong = hesoluong;
	}
	
	public void Nhap(Scanner sc)
	{
		System.out.println();
		
	}
	public float tongLuong()
	{
		return 0;
		
	}
	
}
