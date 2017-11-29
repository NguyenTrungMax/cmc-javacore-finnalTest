package model;



/**
 * @author User
 * @date Nov 28, 2017
 */
public class Candidate {
	
	private String firstName;
	
	private String lastName;
	
	private String birthDate;
	
	private String address;
	
	private String phone;
	
	private String email;
	
	private int candidateType;

	
	public Candidate() {
		
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param address
	 * @param phone
	 * @param email
	 * @param candidateType
	 */
	public Candidate(String firstName, String lastName, String birthDate,
			String address, String phone, String email, int candidateType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.candidateType = candidateType;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the candidateType
	 */
	public int getCandidateType() {
		return candidateType;
	}

	/**
	 * @param candidateType the candidateType to set
	 */
	public void setCandidateType(int candidateType) {
		this.candidateType = candidateType;
	}
	
	
}
