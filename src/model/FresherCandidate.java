package model;



/**
 * @author User
 * @date Nov 28, 2017
 */
public class FresherCandidate extends Candidate{
	
	/** nam tot nghiep */
	private String graduationDate;
	
	/** Thu hang tot nghiep */
	private  String graduationRank;
	
	/** Truong tot nghiep */
	private String educationSchool;

	// constructor khong tham so
	public FresherCandidate() {
		
	}
	
	//constructor co tham so
	public FresherCandidate(String firstName, String lastName,
			String birthDate, String address, String phone, String email,
			int candidateType, String graduationDate, String graduationRank, String educationSchool) {
		super(firstName, lastName, birthDate, address, phone, email, candidateType);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.educationSchool = educationSchool;
	}

	/**
	 * @return the graduationDate
	 */
	public String getGraduationDate() {
		return graduationDate;
	}

	/**
	 * @param graduationDate the graduationDate to set
	 */
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	/**
	 * @return the graduationRank
	 */
	public String getGraduationRank() {
		return graduationRank;
	}

	/**
	 * @param graduationRank the graduationRank to set
	 */
	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}

	/**
	 * @return the educationSchool
	 */
	public String getEducationSchool() {
		return educationSchool;
	}

	/**
	 * @param educationSchool the educationSchool to set
	 */
	public void setEducationSchool(String educationSchool) {
		this.educationSchool = educationSchool;
	}

	
}
