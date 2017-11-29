package business;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.ExperienceCandidate;
import model.FresherCandidate;
import model.InternCandidate;
import dao.CandidateDAO;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class CandidateBus {
	
	
	/**
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @Parameter: No
	 * @Return: Lay ra id ma nguoi dung chon de kiem tra
	 * @modifier:
	 */
	public void chooseCandidate() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Display information all candidate:");
		getAllCandidate();
		System.out.println();
		System.out.println("\nChoose id of candidate to check match:");
		Integer idChoose = Integer.parseInt(sc.nextLine());
		doCheckFact(idChoose);
	}
	/**
	 * @Parameter: 
	 * @Return: All candidate in database
	 * @modifier:
	 */
	public void getAllCandidate() throws ClassNotFoundException, SQLException {
		CandidateDAO candidateDAO = new CandidateDAO();
		candidateDAO.getAllCandidate();
	}
	/**
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws ParseException 
	 * @Parameter: No
	 * @Return:
	 * @description: Input information of caindate
	 * @modifier:
	 */
	public void inputInformation() throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to program:^^");

		System.out.println("Input first name:");
		String firstName = sc.nextLine();

		System.out.println("Input last name:");
		String lastName = sc.nextLine();

		System.out.println("Input address:");
		String address = sc.nextLine();

		System.out.println("Input candidate Type - Only 0, 1 or 2:");
		Integer candidateType = Integer.parseInt(sc.nextLine());

		// create candidateDAO to call method to insert data
		CandidateDAO candidateDAO = new CandidateDAO();
		if (candidateType >= 0)
			if (candidateType == 0) {

				ExperienceCandidate experienceCandidate = new ExperienceCandidate();
				experienceCandidate.setFirstName(firstName);
				experienceCandidate.setLastName(lastName);
				experienceCandidate.setAddress(address);
				experienceCandidate.setCandidateType(candidateType);
				
			// Nhap thong tin cho cac truong con lai can validate
				while (true) {
					System.out.println("Input Email Ex:(abc@gmail.com):");
					String email = sc.nextLine();
					if (isValidateEmail(email)) {
						experienceCandidate.setEmail(email);
						break;
					}
				}
				// check validate va nhap cho dem khi dung yeu cau
				while (true) {
					System.out.println("Input phone has leats 7 numbers:");
					String phone = sc.nextLine();
					if (isValidatePhone(phone)) {
						experienceCandidate.setPhone(phone);
						break;
					}
				}
			// check validate va nhap cho dem khi dung yeu cau
				while (true) {
					System.out.println("Input birth date (yyyy):");
					String birthDate = sc.nextLine();
					if (isValidateBirth(birthDate)) {
						experienceCandidate.setBirthDate(birthDate);
						break;
					}
				}
			// check validate va nhap cho dem khi dung yeu cau
				while (true) {
					System.out.println("Input experience year:");
					String expinYear = sc.nextLine();
					if (isValidateExp(expinYear)) {
						experienceCandidate.setExpInYear(Integer.parseInt(expinYear));
						break;
					}
				}

				System.out.println("Input pro skill:");
				String proSkill = sc.nextLine();
				experienceCandidate.setProSkill(proSkill);
				
				//Insert experienceCandidate to db
				candidateDAO.insertExperience(experienceCandidate);


			} else if (candidateType == 1) {
				FresherCandidate fresherCandidate = new FresherCandidate();
				fresherCandidate.setFirstName(firstName);
				fresherCandidate.setLastName(lastName);
				fresherCandidate.setAddress(address);
				fresherCandidate.setCandidateType(candidateType);
				
			// Nhap thong tin cho cac truong con lai can validate
				while (true) {
					System.out.println("Input Email Ex:(abc@gmail.com):");
					String email = sc.nextLine();
					if (isValidateEmail(email)) {
						fresherCandidate.setEmail(email);
						break;
					}
				}
				
				while (true) {
					System.out.println("Input phone has leats 7 numbers:");
					String phone = sc.nextLine();
					if (isValidatePhone(phone)) {
						fresherCandidate.setPhone(phone);
						break;
					}
				}
				
				while (true) {
					System.out.println("Input birth date (yyyy) lon hon 1900:");
					String birthDate = sc.nextLine();
					if (isValidateBirth(birthDate)) {
						fresherCandidate.setBirthDate(birthDate);
						break;
					}
				}
				
				while (true) {
					System.out.println("Input graduation date (yyyy) lon hon 1900:");
					String graduationDate = sc.nextLine();
					if (isValidateBirth(graduationDate)) {
						fresherCandidate.setGraduationDate(graduationDate);
						break;
					} else {
						System.err.println("Nhap dung dinh dang(yyyy)");
					}
				}
				
				while (true) {
					System.out.println("Input graduation rank (Excellent, Good, Fair, Poor):");
					String graduationRank = sc.nextLine();
					if (isValidateRank(graduationRank)) {
						fresherCandidate.setGraduationRank(graduationRank);
						break;
					} else {
						System.err.println("Input worm format");
					}
				}
				
				System.out.println("Input education School:");
				String educationSchool = sc.nextLine();
				fresherCandidate.setEducationSchool(educationSchool);
				
				//Insert fresherCandidate to db
				candidateDAO.insertFresher(fresherCandidate);
				
			} else {
				InternCandidate internCandidate = new InternCandidate();
				internCandidate.setFirstName(firstName);
				internCandidate.setLastName(lastName);
				internCandidate.setAddress(address);
				internCandidate.setCandidateType(candidateType);
				
			// Nhap thong tin cho cac truong con lai can validate
				while (true) {
					System.out.println("Input Email Ex:(abc@gmail.com):");
					String email = sc.nextLine();
					if (isValidateEmail(email)) {
						internCandidate.setEmail(email);
						break;
					}
				}
				
				while (true) {
					System.out.println("Input phone has leats 7 numbers:");
					String phone = sc.nextLine();
					if (isValidatePhone(phone)) {
						internCandidate.setPhone(phone);
						break;
					}
				}
				
				while (true) {
					System.out.println("Input birth date (yyyy) lon hon 1900:");
					String birthDate = sc.nextLine();
					if (isValidateBirth(birthDate)) {
						internCandidate.setBirthDate(birthDate);
						break;
					}
				}
				
				System.out.println("Input major :");
				String major = sc.nextLine();
				internCandidate.setMajor(major);
				
				System.out.println("Input semester (1, 2 ,3 or 4) :");
				Integer semester = Integer.parseInt(sc.nextLine());
				internCandidate.setSemester(semester);
				
				System.out.println("Input university Name :");
				String universityName = sc.nextLine();
				internCandidate.setUniversityName(universityName);
				
				//Insert fresherCandidate to db
				candidateDAO.insertIntern(internCandidate);
			}
	}

	/**
	 * @Parameter: str
	 * @Return: boolean. check validate email
	 * @modifier:
	 */
	public boolean isValidateEmail(String str) {
		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if (matcher.matches()) {
			return true;
		} else {
			System.err.println("Nhap sai dinh dang roi:\nExample:abc@gmail.com");
			return false;
		}
	}

	/**
	 * @Parameter: str
	 * @Return: boolean. check validate phone
	 * @modifier:
	 */
	public boolean isValidatePhone(String str) {
		Pattern pattern = Pattern.compile("^[0-9]*$");
		Matcher matcher = pattern.matcher(str);
		if (!matcher.matches()) {
			System.err.println("So dien thoai la so va co it nhat 7 ki tu");
			return false;
		} else if (str.length() >= 7) {
			return true;
		} else {
			System.err.println("So dien thoai phai co it nhat 7 chu so:");
			return false;
		}
	}

	/**
	 * @Parameter: str
	 * @Return: boolean. check validate birth date
	 * @modifier:
	 */
	public boolean isValidateBirth(String str) {
			Pattern pattern = Pattern.compile("^[0-9]*$");
			Matcher matcher = pattern.matcher(str);
			if (!matcher.matches()) {
				System.err.println("Phai nhap nam 1900 - 2017");
				return false;
			} else  if (matcher.matches()) {
				Integer number = Integer.parseInt(str);
				if (number >= 1900 && number <= 2017) return true; else {
					System.err.println("Phai nhap nam 1900 - 2017");
					return false;
				}
			}
			return matcher.matches();
	}
	/**
	 * @Parameter: str
	 * @Return: boolean. check validate exp year
	 * @modifier:
	 */
	public boolean isValidateExp(String str) {
		Pattern pattern = Pattern.compile("^[0-9]{1,2}$");
		Matcher matcher = pattern.matcher(str);
		if (!matcher.matches()) {
			System.err.println("Phai nhap nam cho kinh nghiem tu 0 - 100");
			return false;
		} else return true;
	}
	/**
	 * @Parameter: str
	 * @Return: boolean. check validate graduation rank
	 * @modifier:
	 */
	public boolean isValidateRank(String str) {
		if ("Excellent".equalsIgnoreCase(str) || "Good".equalsIgnoreCase(str) || 
				"Fair".equalsIgnoreCase(str) || "Poor".equalsIgnoreCase(str))
			return true; else return false;
	}
	
	/**
	 * @throws SQLException 
	 * @Parameter: 
	 * @Return: 
	 * @modifier: kiem tra nguoi duoc chon co phu hop voi goi tuyen dung nao k dua vao id
	 * ma nguoi dung da chon
	 */
	public void doCheckFact(Integer numberChoose) throws SQLException {
		CandidateDAO candidateDAO = new CandidateDAO();
		String returnString = candidateDAO.doCheckFact(numberChoose);
		candidateDAO.checkUpdateRecruiment(returnString);
	}
}
