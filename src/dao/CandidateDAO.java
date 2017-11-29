package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.ExperienceCandidate;
import model.FresherCandidate;
import model.InternCandidate;
import connection.ConnectionDB;
import connection.SqlQuery;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class CandidateDAO {
	/**
	 * @throws SQLException 
	 * @Parameter: No 
	 * @Return: list of candidate 
	 * @modifier:
	 */
	public void getAllCandidate() throws SQLException, ClassNotFoundException {
		Connection con = ConnectionDB.connectDb();
		ResultSet rs = null;
		try {
			PreparedStatement ps = con.prepareStatement(SqlQuery.SELECT_CANDIDATE);
			
			// Execute query
			rs = ps.executeQuery();
			
			//Return list of person if table has value
			System.out.println("List of All Candidate:");
			System.out.println(String.format("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s"
					+ "%-15s %-15s %-15s %-15s %-15s %-15s", "Id", "FirstName", "LastName", "Birth",
					"Address", "Phone", "Email", "Type", "Exp", "ProSkill", "GraDate", "GraRank", 
					"EduSchool", "Major", "Semester", "University"));
			System.out.println("___________________________________________________________________"
					+ "_____________________________________________________________________________"
					+ "______________________________________________________________________________");
			while (rs.next()) {
					System.out.println(String.format("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s"
					+ "%-15s %-15s %-15s %-15s %-15s %-15s",rs.getInt(1), rs.getString(2), rs.getString(3)
					, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9)
					, rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14)
					, rs.getInt(15), rs.getString(16)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		} 
		finally {
			con.close();
		}
	}
	/**
	 * @throws SQLException 
	 * @Parameter: person
	 * @Return: 
	 * @description: insert experience candidate
	 * @modifier:
	 */
	public void insertExperience(ExperienceCandidate person) throws SQLException {
		Connection con = ConnectionDB.connectDb();
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(SqlQuery.INSERT_EXPERIENCECANDIDATE);
			
			ps.setString(1, person.getFirstName());
			ps.setString(2, person.getLastName());
			ps.setString(3, person.getBirthDate());
			ps.setString(4, person.getAddress());
			ps.setString(5, person.getPhone());
			ps.setString(6, person.getEmail());
			ps.setInt(7, person.getCandidateType());
			ps.setInt(8, person.getExpInYear());
			ps.setString(9, person.getProSkill());
			
			int i = ps.executeUpdate();
			if (i > 0) System.out.println("Insert succesfully"); else
				System.err.println("Insert failed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
	/**
	 * @throws SQLException 
	 * @Parameter: person
	 * @Return: 
	 * @description: insert fresher candidate
	 * @modifier:
	 */
	public void insertFresher(FresherCandidate person) throws SQLException {
		Connection con = ConnectionDB.connectDb();
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(SqlQuery.INSERT_FRESHERCANDIDATE);
			
			ps.setString(1, person.getFirstName());
			ps.setString(2, person.getLastName());
			ps.setString(3, person.getBirthDate());
			ps.setString(4, person.getAddress());
			ps.setString(5, person.getPhone());
			ps.setString(6, person.getEmail());
			ps.setInt(7, person.getCandidateType());
			ps.setString(8, person.getGraduationDate());
			ps.setString(9, person.getGraduationRank());
			ps.setString(10, person.getEducationSchool());
			
			int i = ps.executeUpdate();
			if (i > 0) System.out.println("Insert succesfully"); else
				System.err.println("Insert failed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
	/**
	 * @throws SQLException 
	 * @Parameter: person
	 * @Return: 
	 * @description: insert intern candidate
	 * @modifier:
	 */
	public void insertIntern(InternCandidate person) throws SQLException {
		Connection con = ConnectionDB.connectDb();
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(SqlQuery.INSERT_INTERNCANDIDATE);
			
			ps.setString(1, person.getFirstName());
			ps.setString(2, person.getLastName());
			ps.setString(3, person.getBirthDate());
			ps.setString(4, person.getAddress());
			ps.setString(5, person.getPhone());
			ps.setString(6, person.getEmail());
			ps.setInt(7, person.getCandidateType());
			ps.setString(8, person.getMajor());
			ps.setInt(9, person.getSemester());
			ps.setString(10, person.getUniversityName());
			
			int i = ps.executeUpdate();
			if (i > 0) System.out.println("Insert succesfully"); else
				System.err.println("Insert failed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
	/**
	 * @throws SQLException 
	 * @Parameter: 
	 * @Return: 
	 * @modifier:Lay ra candidateType tuong ung voi A, B, C. de kiem tra va update trong
	 * bang recruiment
	 */
	public String doCheckFact(Integer numberChoose) throws SQLException {
		Connection con = ConnectionDB.connectDb();
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(SqlQuery.SELECT_BY_ID);
			ps.setInt(1, numberChoose);
			ResultSet rs = ps.executeQuery();
			
			// To hold value A or B or C
			String retunString="";
			
			// lay gia tri cua candidateType de kiem tra trong bang Recruiment
			while (rs.next()) {
				if ( rs.getInt(1) == 0) retunString = "A"; else
					if (rs.getInt(1) == 1) retunString = "B"; else
						retunString = "C";
			}
			
			return retunString;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			con.close();
		}
	}
	/**
	 * @throws SQLException 
	 * @Parameter: 
	 * @Return: 
	 * @modifier:Kiem tra xem candidate co phu hop voi goi tuyen dung nao khong
	 * co thi in ra "Submitted this candidate successfully" khong thi
	 * "This candidate not matching"
	 */
	public void checkUpdateRecruiment(String retunrString) throws SQLException {
		Connection con = ConnectionDB.connectDb();
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(SqlQuery.UPDATE_RECRUIMENT);
			ps.setString(1, retunrString);
			if (ps.executeUpdate() > 0) {
				System.out.println("Submitted this candidate successfully");
			} else {
				System.err.println("This candidate not matching");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
}
