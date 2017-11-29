package model;



/**
 * @author User
 * @date Nov 28, 2017
 */
public class ExperienceCandidate extends Candidate{
	
	/** So nam kinh nghiem */
	private Integer expInYear;
	
	/** Ki nang dac biet */
	private  String proSkill;

	// constructor khong tham so
	public ExperienceCandidate() {
		
	}
	
	//constructor co tham so
	public ExperienceCandidate(String firstName, String lastName,
			String birthDate, String address, String phone, String email,
			int candidateType, Integer expInYear, String proSkill) {
		super(firstName, lastName, birthDate, address, phone, email, candidateType);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	/**
	 * @return the expInYear
	 */
	public Integer getExpInYear() {
		return expInYear;
	}

	/**
	 * @param expInYear the expInYear to set
	 */
	public void setExpInYear(Integer expInYear) {
		this.expInYear = expInYear;
	}

	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}

	/**
	 * @param proSkill the proSkill to set
	 */
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	 
}
