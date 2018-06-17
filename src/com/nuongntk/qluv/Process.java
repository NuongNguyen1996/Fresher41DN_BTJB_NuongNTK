package com.nuongntk.qluv;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.org.apache.xerces.internal.impl.dv.ValidatedInfo;

public class Process {

	public static void main(String[] args) throws BirthDayException, EmailException {
		ExperienceDAO expDAO = new ExperienceDAO();
		FresherDAO fresherDAO = new FresherDAO();
		InternDAO internDAO = new InternDAO();
		Validation validate = new Validation();
		CandidateDAO candidateDAO = new CandidateDAO();

		ArrayList<Candidate> listCandidate = new ArrayList<>();
		int choose, n;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("choose enter");
			choose = Integer.parseInt(input.nextLine());

			switch (choose) {
			case 1: {
				boolean isContinue = true;
				String candidateID = "";
				String fullName = "";
				String birthDay = "";
				String phone = "";
				String email = "";
				int candidate_type;

				String message = "The system has encountered an unexpected problem, sincerely sorry !!!";
				Candidate candidate;
				do {
					try {
						do {
							System.out.print("ma ung vien ");
							candidateID = input.nextLine();
						} while (candidateDAO.isIDExist(candidateID));

						System.out.print("ho va ten ");
						fullName = input.nextLine();
						do {
							try {
								System.out.print("ngay sinh ");
								birthDay = input.nextLine();
								if (!validate.isDate(birthDay) || !validate.checkYear(birthDay)) {
									throw new BirthDayException(message);
								}
							} catch (BirthDayException e) {
								System.err.println(e.getMessage());
							}
						} while (!validate.isDate(birthDay) || !validate.checkYear(birthDay));
						do {
							System.out.print("so dien thoai ");
							phone = input.nextLine();
						} while (!validate.isPhone(phone));

						do {
							try {
								System.out.print("email ");
								email = input.nextLine();
								if (!validate.isEmail(email)) {
									throw new EmailException(message);
								}
							} catch (EmailException ex) {
								System.err.println(ex.getMessage());
							}

						} while (!validate.isEmail(email));

						System.out.print("ung vien loai may 1.experence; 2. fresher 3.intern  ");
						candidate_type = Integer.parseInt(input.nextLine());
						switch (candidate_type) {
						case 1: {
							int expInYear;
							String proSkill;

							System.out.print("so nam kinh nghiem ");
							expInYear = Integer.parseInt(input.nextLine());
							System.out.print("ky nang chuyen mon ");
							proSkill = input.nextLine();

							candidate = new Experience(candidateID, fullName, validate.formatDate(birthDay), phone,
									email, candidate_type, expInYear, proSkill);

							expDAO.addNewCandidate((Experience) candidate);
							// candidate.setCanidate_count();

							listCandidate.add(candidate);
							break;
						}

						case 2: {
							String graduation_date;
							String graduation_rank;
							String education;
							do {
								System.out.print("ngay tot nghiep ");
								graduation_date = input.nextLine();
							} while (!validate.isDate(graduation_date));

							System.out.print("xep loai ");
							graduation_rank = input.nextLine();
							System.out.print("truong tot nghiep ");
							education = input.nextLine();

							candidate = new Fresher(candidateID, fullName, validate.formatDate(birthDay), phone, email,
									candidate_type, validate.formatDate(graduation_date), graduation_rank, education);

							fresherDAO.addNewCandidate((Fresher) candidate);
							// candidate.setCanidate_count();

							listCandidate.add(candidate);
							break;
						}

						case 3: {
							String majors;
							int semester;
							String university_name;

							System.out.print("chuyen nganh ");
							majors = input.nextLine();
							System.out.print("hoc ky ");
							semester = Integer.parseInt(input.nextLine());
							System.out.print("truong theo hoc ");
							university_name = input.nextLine();

							candidate = new Intern(candidateID, fullName, validate.formatDate(birthDay), phone, email,
									candidate_type, majors, semester, university_name);

							internDAO.addNewCandidate((Intern) candidate);
							// candidate.setCanidate_count();

							listCandidate.add(candidate);
							break;
						}
						}
					} catch (Exception e) {
						System.out.println(message);
					}

					System.out.println("Continue?");
					isContinue = Boolean.parseBoolean(input.nextLine());
				} while (isContinue);

				break;
			}
			case 2: {
				for (Candidate objCan : listCandidate) {
					if (objCan instanceof Experience) {
						((Experience) objCan).showMe();
					} else if (objCan instanceof Fresher) {
						((Fresher) objCan).showMe();
					} else if (objCan instanceof Intern) {
						((Intern) objCan).showMe();
					}
				}
				break;
			}
			case 3: {
				System.out.println("so luong ung vien " + Candidate.getCanidate_count());
				break;
			}

			case 4: {
				System.out.println("Ten cua cac ung vien la: " + candidateDAO.getAllFullName());
				break;
			}
			default:
				break;
			}
		} while (true);

	}

}
