package view;

import java.sql.SQLException;
import java.text.ParseException;

import business.CandidateBus;

/**
 * @author User
 * @date Nov 28, 2017
 * @description: Chay chuong trinh hien thi cho nguoi dung
 */
public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		CandidateBus candidateBus = new CandidateBus();
		
		// nhap thong tin nguoi dung sau do in ra tat ca Candidate trong db
		candidateBus.inputInformation();
		
		/** Cho phep nguoi dung chon ung vien tuy y de kiem tra kha nang
		phu hop voi goi tuyen dung */
		candidateBus.chooseCandidate();
	}
}
