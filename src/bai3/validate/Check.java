package bai3.validate;

import bai3.customer.Customer;

public class Check {

	public static boolean checkID(String s) throws Exception {
		try {
			if (s.matches("^[a-zA-Z](\\w{0,9})$")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw e;
		}

	}

	public static boolean checkName(String s) throws Exception {
		try {
			if (s.matches("[a-z A-Z]{5,40}")) {
				return true;

			} else {
				return false;
			}
		} catch (Exception e) {
			throw e;
		}

	}

	public static boolean checkSex(String s) throws Exception {
		try {
			if (s.equalsIgnoreCase("nam") || s.equalsIgnoreCase("nu")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static boolean checkAll(Customer check) throws Exception {
		try {

			if (checkName(check.getTen()) && checkSex(check.getGioiTinh())) {
				return true;
			} else {
				return false;
			}
		} catch (Exception ex) {
			throw ex;
		}
	}

	public static boolean checkAge(String tuoi) throws Exception {
		try {

			if (Integer.parseInt(tuoi) >= 0 && tuoi.matches("\\d*")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception ex) {
			throw ex;
		}
	}
}
