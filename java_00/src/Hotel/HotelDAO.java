package Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelDAO {

	final int RoomCnt = 10;

	//D =데이터

	//선언문
	List<Room> roomList;

	public HotelDAO() {
		//딱 10개 까지 공간만 마련
		roomList = new ArrayList<Room>(RoomCnt);

		//객실 사용 가능여부
		for(int i=0; i<RoomCnt; i++) {
			//Room 자체를 False로 
			roomList.add(new Room(false));

		}


	}
	
	public void checkIn(int roomNum) {
		
		//객실 체크인 = List에 속해 있는 Room 객체의 사용여부를  "사용중"으로 변경
		//roomNum으로 IsUing 체인지
		roomList.set(roomNum-1, new Room(true));
		
	}
	
	public void checkOut(int roomNum) {
		//체크 아웃
		roomList.set(roomNum-1, new Room(false));
		

	}
	

	//방 사용
	public boolean selectRoomChk(int roomNum) {
		boolean isFlag = false;

		isFlag = roomList.get(roomNum-1).isUsing();

		return isFlag;
	}
	
	public List<Room> selectRoomList() {
		return roomList;
	}


}
