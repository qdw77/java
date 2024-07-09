package memberMng;

import java.util.List;
import java.util.Scanner;

public class MemberService {

	MemberDAO mDAO;
	Scanner sc = new Scanner(System.in);

	public MemberService() {
		mDAO = new MemberDAO();
	}
	//ㅁ + 한자키 > 기호

	// ===== 회원 관리 프로그램 =====
	// 1. 회원 정보 등록
	// 2. 회원 정보 수정
	// 3. 회원 정보 삭제
	// 4. 회원 정보 출력(이름)
	// 5. 회원 전체 정보 출력
	// 6. 프로그램 종료

	/*
	 * 리스트 선택 목록 부터*/

	public void startProgram() {

		//		int count = 0;

		while (true) {

			int choice = printMenu();

			switch(choice) {
			case 1 :
				displayMsg(" 1. 회원 정보 등록");
				insertMember();
				break;
			case 2 :
				displayMsg(" 2. 회원 정보 수정");
				updateMember();
				break;
			case 3 :
				displayMsg(" 3. 회원 정보 삭제");
				deletMember();
				break;
			case 4 :
				displayMsg("4. 회원 정보 출력(이름)"); 
				printMember();
				break;
			case 5 :
				displayMsg(" 5. 회원 전체 정보 출력");
				findAllMembers();
				break;
			case 6 :
				displayMsg(" 6. 프로그램 종료~!");
				//				count++;
				break;
			default: 
				//System.out.println("잘못된 숫자가 입력됨. 1~6사이의 숫자 입력 가능");
				break;
			}

			if (choice == 6) {
				break;
			}
		}
	}


	//0번 프로그램 출력
	public int printMenu() {
		displayMsg(" ===== 회원 관리 프로그램 =====");
		displayMsg(" 1. 회원 정보 등록");
		displayMsg(" 2. 회원 정보 수정");
		displayMsg(" 3. 회원 정보 삭제");
		displayMsg(" 4. 회원 정보 출력(이름)"); 
		displayMsg(" 5. 회원 전체 정보 출력"); 
		displayMsg(" 6. 프로그램 종료");
		displayMsg("[선택] : ");

		int choice = sc.nextInt();

		return choice;
	}
	// 1. 회원 정보 등록
	public void insertMember() {
		Member member = new Member();

		System.out.println("회원 아이디를 입력해 보세요. : ");
		String memberId = sc.next();

		System.out.println("회원 비밀번호 : ");
		String memberPw = sc.next();

		System.out.println("회원 이름 : ");
		String memberName = sc.next();

		System.out.println("이메일 주소를 입력 해주세요 : ");
		String email= sc.next();

		System.out.println("연락처 정보를 입력해 주세요.");
		String phon = sc.next();

		member.setMemberId(memberId);
		member.setMemberPw(memberPw);
		member.setMemberName(memberName);
		member.setEmail(email);
		member.setPhone(phon);

		mDAO.insertMember(member);
	}

	//2.
	public void updateMember() {

		List<Member> members = mDAO.findMember();

		System.out.print("수정하고 싶은 아이디를 입력해 주세요.");
		String findId = sc.next();

		boolean flag = false;

		for(int i=0; i<members.size(); i++) {
			Member member =  members.get(i);

			if(findId.equals(member.getMemberId())) {
				System.out.println(member.getMemberName()+"님의 정보를 수정해 주세요.");

				System.out.print("비밀번호 : ");
				member.setMemberPw(sc.next());

				System.out.print("이메일 : ");				
				member.setEmail(sc.next());

				System.out.print("연락처 : ");
				member.setPhone(sc.next());

				
				flag = true;
				break;

			}


		}
		if (flag == false) {
			displayMsg("회원 아이디가 존재하지 않습니다.");
		}

	}

	//3.
	public void deletMember() {
		List<Member> members = mDAO.findMember();
		
		System.out.print("삭제 하고 싶은 아이디를 입력 해 주세요. : ");
		String findId =sc.next();

		
		for (int i =0; i<members.size(); i++) {
			Member member = members.get(i);
			boolean flag = false;
			
			if(findId.equals(member.getMemberId())) {
				mDAO.deleteMember(member);
				displayMsg("삭제 완료");
				
				flag =true;
				break;
				
			}
			if (flag == false) {
				displayMsg("회원 정보가 없습니다.");
		}


		}
		
	}


	//4.
	public void printMember () {

		List <Member> members = mDAO.findMember();

		System.out.print("조회할 회원 아이디를 입력해 주세요 : ");
		String findId =sc.next();

		boolean flag = false;

		for (int i = 0; i<members.size(); i++) {
			Member member = members.get(i);

			if(findId.equals(member.getMemberId())) {
				displayMsg("회원 아이디 : "+ member.getMemberId());
				displayMsg("회원 비밀번호 : "+ member.getMemberPw());
				displayMsg("회원 이름 : "+ member.getMemberName());
				displayMsg("회원 이메일 : "+ member.getEmail());
				displayMsg("회원 연락처 : "+ member.getPhone());

				flag = true;
				break;
			}
		}

		if(flag == false) {
			displayMsg("회원 아이디가 존재하지 않습니다.");
		}
	}



	//5. 회원 정보 출력
	public void findAllMembers() {

		List <Member> members = mDAO.findAllMember();

		//members.get(i) = member
		for (int i = 0; i<members.size(); i++) {


			Member member = members.get(i);

			displayMsg("회원 아이디 : "  + member.getMemberId());
			displayMsg("회원 비밀번호 : "  + member.getMemberPw());
			displayMsg("회원 이름 : "  + member.getMemberName());
			displayMsg("회원 이메일 : "  + member.getEmail());
			displayMsg("회원 연락처 : "  + member.getPhone());
			displayMsg("-----------------------------------------");

			//members.get(i) 직접 추가
			//			displayMsg("회원 아이디 : "+ members.get(i).getMemberId());
			//			displayMsg("회원 비밀번호 : "+ members.get(i).getMemberPw());
			//			displayMsg("회원 이름 : "+ members.get(i).getMemberName());
			//			displayMsg("회원 이메일 : "+ members.get(i).getEmail());
			//			displayMsg("회원 연락처 : "+ members.get(i).getPhone());
			//			displayMsg("-------------------------------------------");
		}


	}

	//메세지 출력용 
	public void displayMsg(String msg) {
		System.out.println(msg);
	}

}
