package bai3.customer;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import bai3.validate.Check;

public class Customer {
	private String id;
	private String ten;
	private String tuoi;
	private String gioiTinh;
	private String diaChi;
	private String maChuyenBay;
	private String maGhe;

	public Customer() {
		super();
	}

	

	public Customer(String id, String ten, String tuoi, String gioiTinh, String diaChi, String maChuyenBay,
			String maGhe) {
		super();
		this.id = id;
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.maChuyenBay = maChuyenBay;
		this.maGhe = maGhe;
	}



	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMaGhe() {
		return maGhe;
	}

	public void setMaGhe(String maGhe) {
		this.maGhe = maGhe;
	}

	public String getMaChuyenBay() {
		return maChuyenBay;
	}

	public void setMaChuyenBay(String i) {
		this.maChuyenBay = i;
	}

	public void nhapThongTinNhanVien() throws Exception {

		try (Scanner sc = new Scanner(System.in)) {
			try {
				do {
					System.out.println("Nhập Ten: ");
					setTen(sc.nextLine());
				} while (!Check.checkName(ten));
				
				do {
					System.out.println("Nhap Tuoi");
					setTuoi(sc.nextLine());
				} while (!Check.checkAge(tuoi));
				
				do {
					System.out.println("Nhap gioi tinh");
					setGioiTinh(sc.nextLine());
				} while (!Check.checkSex(gioiTinh));
				
				System.out.println("Nhap dia chi");
				setDiaChi(sc.nextLine());
				
				System.out.println("Ma chuyen bay");
				setMaChuyenBay(sc.nextLine());
				
				System.out.println("Ma ghe");
				setMaGhe(sc.nextLine());
				
			} catch (Exception e) {
				throw e;
			}
		}

	}

	@Override
	public String toString() {

		return this.getTen() + " " + this.getTuoi() + " " + this.getGioiTinh() + " " + this.getDiaChi() + " "
				+ this.getMaChuyenBay() + " " + this.getMaGhe();
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
