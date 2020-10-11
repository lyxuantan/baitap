package phanso;

import java.io.IOException;

public class PhanSo {
	public int tuSo;
	public int mauSo;

	public PhanSo() {
		super();
	}

	public PhanSo(int tuSo, int mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	public int timUCLN(int a, int b) throws IOException {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;

	}

	public void toiGianPhanSo() throws IOException {
		int UCLNCuaTuVaMau;

		UCLNCuaTuVaMau = timUCLN(Math.abs(this.getTuSo()), Math.abs(this.getMauSo()));
		this.setTuSo(this.getTuSo() / UCLNCuaTuVaMau);
		this.setMauSo(this.getMauSo() / UCLNCuaTuVaMau);

	}

	public void congPhanSo(PhanSo ps) throws IOException {
		try {
			int tuSo = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
			int mauSo = this.getMauSo() * ps.getMauSo();
			PhanSo phanSoTong = new PhanSo(tuSo, mauSo);
			phanSoTong.toiGianPhanSo();
			System.out.println("Tổng hai phân số = " + phanSoTong.tuSo + "/" + phanSoTong.mauSo);
		} catch (IOException ex) {

		}
	}

	public void truPhanSo(PhanSo ps) throws IOException{

		try {
			int tuSo = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
			int mauSo = this.getMauSo() * ps.getMauSo();
			PhanSo phanSoHieu = new PhanSo(tuSo, mauSo);
			phanSoHieu.toiGianPhanSo();
			System.out.println("Hiệu =" + phanSoHieu.tuSo + "/" + phanSoHieu.mauSo);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void nhanPhanSo(PhanSo phanSo) throws IOException {

		try {
			int tuSo = this.getTuSo() * phanSo.getTuSo();
			int mauSo = this.getMauSo() * phanSo.getMauSo();
			PhanSo phanSoTich = new PhanSo(tuSo, mauSo);
			phanSoTich.toiGianPhanSo();
			System.out.println("Tích =" + phanSoTich.tuSo + "/" + phanSoTich.mauSo);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void chiaPhanSo(PhanSo phanSo) throws IOException{

		try {
			int tuSo = this.getTuSo() * phanSo.getMauSo();
			int mauSo = this.getMauSo() * phanSo.getTuSo();
			PhanSo phanSoThuong = new PhanSo(tuSo, mauSo);
			phanSoThuong.toiGianPhanSo();
			System.out.println("Thương hai phân số = " + phanSoThuong.tuSo + "/" + phanSoThuong.mauSo);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
