package cab.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.dao.entity.Cab;
import com.cab.dao.entity.CabRoute;
import com.cab.dao.entity.DailySlotSnap;
import com.cab.dao.entity.TimeSlot;
import com.cab.dao.entity.UserProfile;
import com.cab.dao.factory.CabDaoIface;
import com.cab.dao.factory.CabDaoImpl;

import cab.dto.CabDto;
import cab.dto.CabRouteDto;
import cab.dto.CabTableBean;
import cab.dto.DashBoardBean;
import cab.dto.TimeslotDto;
import cab.dto.UserProfileDto;
import cab.transformer.CabTransformer;
import cab.transformer.UserProfileTransformer;

//@Service
public class CabService {
	@Autowired
	private CabDaoIface login;

	@Autowired
	private UserProfileTransformer userTransform;

	private boolean isValid;

	public boolean isValidLogin(String userId, HttpSession session) {
		isValid = false;

		UserProfile userProfile = login.readUser(userId);// returning the list
															// of all rows of
															// user profile
															// table(returns
															// entity objects)

		/*
		 * List<UserProfileDto>
		 * userDto=userTransform.convertUserProfileDtoList(userProfile
		 * );//returns the list of dto by transforming entity objects to dtos
		 * for(UserProfileDto userProfileDto:userDto) {
		 * if(userId.equals(userProfileDto.getUserId())) { isValid=true;
		 * session.setAttribute("username", userProfileDto.getUserName());
		 * break; } }
		 */
		if (userProfile != null) {
			if (userProfile.getUserId().equals(userId)) {
				session.setAttribute("username", userProfile.getUserName());
				return true;
			} else {
				return isValid;
			}
		} else {
			return isValid;
		}

	}

	public boolean isInsert(UserProfileDto userdto) {
		boolean isInsert = false;
		UserProfile user = new UserProfile();
		user.setUserName(userdto.getUserName());
		user.setUserId(userdto.getUserId());
		user.setUserEmail(userdto.getUserEmail());
		user.setUserPhone(userdto.getUserPhone());
		String validateuser=user.getUserId();
			System.out.println("uprof::" + user.getUserId());
			isInsert = login.isInsert(user);
			return isInsert;		
	}

	public boolean isCabInsert(CabDto cabdto) {
		boolean isCabInsert = false;
		Cab cab = CabTransformer.convertIntoCab(cabdto);

		isCabInsert = login.isCabInsert(cab);
		return isCabInsert;
	}

	public boolean isCabUpdate(CabDto cabdto) {
		boolean isCabInsert = false;
		Cab cab = CabTransformer.convertIntoCab(cabdto);

		isCabInsert = login.isCabUpdate(cab);
		return isCabInsert;
	}
	public boolean isContactUpdate(String userid, String contactno) {
		boolean isCabInsert = false;
		isCabInsert = login.isContactUpdate(userid, contactno);
		return isCabInsert;
	}
	public boolean isEmailUpdate(String userid, String emailid) {
		boolean isCabInsert = false;
		isCabInsert = login.isEmailUpdate(userid, emailid);
		return isCabInsert;
	}
	public boolean isAdminUpdate(String userid, String adminid) {
		// TODO Auto-generated method stub
		boolean isAdminInsert = false;
		isAdminInsert = login.isAdminUpdate(userid, adminid);
		return isAdminInsert;
	}

	public List<CabDto> getAllCabs() {
		List<Cab> allcab = login.getAllCabs();
		List<CabDto> allcabdto = CabTransformer.convertIntoCabDtoList(allcab);
		return allcabdto;
	}

	public List<CabRouteDto> getAllCabDirection() {
		List<CabRouteDto> cabrtdtolist = null;
		List<CabRoute> cabrtlist = login.getAllCabDirection();

		cabrtdtolist = CabTransformer.convertCabRouteDtoList(cabrtlist);
		return cabrtdtolist;
	}

	public List<TimeslotDto> getAllCabTime() {
		List<TimeslotDto> cabtimedtolist = null;
		List<TimeSlot> cabtimelist = login.getAllCabTime();

		cabtimedtolist = CabTransformer.convertCabTimeDtoList(cabtimelist);
		return cabtimedtolist;
	}

	public List<String> getCabRoute(String direction) {
		List<String> routelist = new ArrayList<String>();
		List<CabRoute> cabrt = login.getCabRoute(direction);
		for (CabRoute cab : cabrt)
			routelist.add(cab.getCabRoute());
		return routelist;
	}

	public boolean bookCab(String route, String time, String userid) {
		boolean isbookingSuccess = false;
		String info = login.seatCount(route, time);
		StringTokenizer st = new StringTokenizer(info, "|");
		long seatcnt = Long.parseLong(st.nextToken());
		String routeid = st.nextToken();
		String timeslotid = st.nextToken();
		int dailyslotsnapid = Integer.parseInt(st.nextToken());

		int cabcapacity = login.getCapacity(routeid, timeslotid);

		if (cabcapacity > seatcnt) {
			isbookingSuccess = login.bookCab(dailyslotsnapid, userid);
		}

		return isbookingSuccess;
	}

	public List<DashBoardBean> getCabDetails(String cabNumber, int capacity) {
		List<DashBoardBean> resultbean = new ArrayList<DashBoardBean>();
		String details = login.getCabDetails(cabNumber);

		StringTokenizer st = new StringTokenizer(details, "|");

		while (st.hasMoreTokens()) {
			DashBoardBean db = new DashBoardBean();
			String time = st.nextToken();
			String route = st.nextToken();
			String seat = login.seatCount(route, time);

			db.setCabTime(time);
			db.setCabRoute(route);
			db.setCabNum(cabNumber);
			db.setSeatCount(Integer.parseInt(seat.substring(0,
					seat.indexOf("|"))));
			db.setCabCapacity(capacity);
			resultbean.add(db);
		}
		return resultbean;
	}

	public CabTableBean getFirstCabTabData(String cabNum, String cabTime,
			String cabRoute) {

		CabTableBean firstcabinfo = new CabTableBean();
		List<Object> list = login.getFirstCabTabData(cabNum, cabRoute);
		firstcabinfo.setCabDirection((String) list.get(1));
		Cab cab = (Cab) list.get(0);
		firstcabinfo.setCabDriverName(cab.getCabDrvName());
		firstcabinfo.setCabDriverPhone(cab.getCabDrvPhone());
		firstcabinfo.setCabNumber(cab.getCabNum());
		firstcabinfo.setCabRoute(cabRoute);
		firstcabinfo.setCabTime(cabTime);

		return firstcabinfo;
	}

	public List<UserProfileDto> getFirstUserTabData(String cabNum,
			String cabTime, String cabRoute) {

		String result = login.seatCount(cabRoute, cabTime);
		StringBuffer sb = new StringBuffer(result);
		String dailysnapid = sb.substring(sb.lastIndexOf("|") + 1);

		List<UserProfile> userlist = login.getCabUserList(dailysnapid);
		if (userlist.size() > 0) {
			List<UserProfileDto> returnlist = new UserProfileTransformer()
					.convertUserProfileDtoList(userlist);
			return returnlist;
		} else
			return null;

	}

	public boolean findUserBooking(String userid) {
		boolean isBookingAvailable = false;
		isBookingAvailable = login.findUserBooking(userid);

		return isBookingAvailable;
	}

	public CabDto getCabDetailsWithId(String cabnum) {
		Cab cab = login.getCabDetailsWithId(cabnum);
		CabDto cabdto = CabTransformer.convertIntoCabDto(cab);
		return cabdto;
	}

	public boolean doesUserExist(UserProfileDto userdto) {
		boolean doesUserExist = false;
		UserProfile user = new UserProfile();
		user.setUserName(userdto.getUserName());
		user.setUserId(userdto.getUserId());
		user.setUserEmail(userdto.getUserEmail());
		user.setUserPhone(userdto.getUserPhone());
		String validateuser=user.getUserId();	
		UserProfile userProfile = login.readUser(user.getUserId());
		if (userProfile != null) {
			if (userProfile.getUserId().equals(validateuser)) {				
				return true;
			} else {
				return doesUserExist;
			}
		} else {
			return doesUserExist;
		}	
	}
}
