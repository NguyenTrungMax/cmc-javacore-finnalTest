package connection;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class SqlQuery {
	public static final String SELECT_CANDIDATE = "SELECT * FROM [trung].CandidateManage";
	
	public static final String SELECT_BY_ID = "SELECT candidateType FROM "
			+ "[trung].CandidateManage WHERE id = ?";
	
	// Insert data into table
	public static final String 
	INSERT_EXPERIENCECANDIDATE = "INSERT INTO [trung].CandidateManage(firstName, lastName, birthDate"
			+ ", address, phone, email, candidateType, expInYear, proSkill)"
			+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public static final String 
	INSERT_FRESHERCANDIDATE = "INSERT INTO [trung].CandidateManage(firstName, lastName, birthDate"
			+ ", address, phone, email, candidateType, graduationDate, graduationRank, educationSchool)"
			+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public static final String 
	INSERT_INTERNCANDIDATE = "INSERT INTO [trung].CandidateManage(firstName, lastName, birthDate"
			+ ", address, phone, email, candidateType, major, semester, universityName)"
			+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public static final String 
	UPDATE_RECRUIMENT = "UPDATE [trung].Recruiment SET quantum = quantum + 1 WHERE recrumentPackage = ? ";
}
