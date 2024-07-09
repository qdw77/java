package Hotel;

import java.util.List;
import java.util.Scanner;

public class HotelService {
	//1,2
	public static HotelDAO hotelDAO;
	public static Scanner sc = new Scanner(System.in);
	//3
	public HotelService() {
		hotelDAO = new HotelDAO();
	}

	//선언부 종료



	public void startProgram() {
		while (true) {
			int menu = HotelMenu();


			switch(menu) {

			case 1 :
				//입실
				checkIn();

				break;


			case 2 :
				//퇴실
				checkOut();
				break;


			case 3 :
				//방보기
				roomInfo();
				break;


			case 4 :
				//프로그램 종료
				System.out.println("시스템 종료 !");
				System.exit(0);
				break;


			default:
				System.out.println("1~4사이의 정수를 입력해 주세요.");
				break;


			}
		}

	}



	public int HotelMenu() {

		int choice = 0;

		//=== 호텔 관리 프로그램===
		// [호텔에는 총 0000개의 객실이 있습니다.]
		//----------------------------------
		//1.입실 2. 퇴실 3. 방보기 4. 종료
		//선택
		//메뉴 입력을 받아주세요.
		System.out.println("=== 호텔 관리 프로그램===");
		System.out.println("[ 호텔에는 총 " + hotelDAO.RoomCnt+"개의 객실이 있습니다. ]");
		System.out.println("1.입실  2.퇴실  3.방보기  4.종료");
		System.out.print("선택");
		choice = sc.nextInt();



		return choice;
	}

	//체크인

	public void checkIn() {
		System.out.println("몇 번 방에 입실하시겠습니까?");
		int roomNum = sc.nextInt();

		//[체크 1]1~RoomCnt 사이의 객실 수입력

		if(roomNum < 1 || roomNum >hotelDAO.RoomCnt) {

			System.out.println("호텔에는 1~"+hotelDAO.RoomCnt+"호실 까지의 객실이 있습니다.");
			System.out.println("다시 선택 해 주세요.");

		} else if(hotelDAO.selectRoomChk(roomNum)) {

			//[체크2 ] 선택한 객실에 손님이 있는 지
			System.out.println("해당 객실은 이미 손님이 계십니다. 다른 객실을 이용해 주세요.");

		} else  {

			//체크 1, 2가 아니어야 정상적인 입실 가능
			//객실 체크인
			hotelDAO.checkIn(roomNum);
			System.out.println("객실 체크인이 완료되었습니다. 즐거운 하루 되세요.");

		}

	}

	//퇴실
	
	public void checkOut() {
	
		System.out.println("몇번 객실에서 퇴실하시겠습니까?");

		//손님 답
		int roomNum = sc.nextInt();
		
		hotelDAO.checkOut(roomNum);
		
		System.out.println("객실 체크 아웃이 완료되었습니다. 감사합니다.");
		
	}
	

	public void roomInfo() {
		//roomList받아오기
		List<Room> rooms = hotelDAO.selectRoomList();


		//roomList에서 Room 객체의 사용 여부를 확인할 수 있도록 반복문 구현
		//Room 객체의 사용 여부는 isUsing으로 알 수 있다.
		//isUsing = true 이면 사용 중
		//isUsing = false 이면 사용가능(빈 방)
		
		
		int cnt = 1;

		for (Room r : rooms) {
			if(r.isUsing() == true) {
				System.out.println(cnt+"호 객실은 현재 손님이 있습니다.");
			}else {
				System.out.println(cnt+"호 객실은 현재 비어 있습니다.");
			}

			cnt++;
		}

		//[최종 결과 - 총 RoomCnt 만큼의 객실 상태를 봐주면 됨]
		//1호실 객실은 현재 비어있습니다.
		//2호실 객실은 현재 비어있습니다.
		//3..................
		//10호실 객실은 현재 비어있습니다.

	}

	//
	//	public void () {
	//		System.out.println(".");
	//	}

}
