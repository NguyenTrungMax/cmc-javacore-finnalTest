package model;




/**
 * @author User
 * @date Nov 28, 2017
 */
public class InternCandidate extends Candidate{
	/** chuyen nganh dang hoc */
	private String major;
	
	/** hoc ki */
	private  int semester;
	
	/** Truong dang hoc*/
	private String universityName;
	
	// constructor khong tham so
	public InternCandidate() {
	}

	//constructor co tham so
	public InternCandidate(String firstName, String lastName,
			String birthDate, String address, String phone, String email,
			int candidateType, String major, int semester, String universityName) {
		
		super(firstName, lastName, birthDate, address, phone, email, candidateType);
		this.major = major;
		this.semester = semester;
		this.universityName = universityName;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @return the semester
	 */
	public int getSemester() {
		return semester;
	}

	/**
	 * @param semester the semester to set
	 */
	public void setSemester(int semester) {
		this.semester = semester;
	}

	/**
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	
	
}
