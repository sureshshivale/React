package cab.transformer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cab.dao.entity.Cab;
import com.cab.dao.entity.CabRoute;
import com.cab.dao.entity.TimeSlot;
import com.cab.dao.entity.UserProfile;

import cab.dto.CabDto;
import cab.dto.CabRouteDto;
import cab.dto.TimeslotDto;
import cab.dto.UserProfileDto;

public class CabTransformer {

	public static final CabDto convertIntoCabDto(Cab cab)
	{
		CabDto cabdto=new CabDto();
		cabdto.setCabNumber(cab.getCabNum());
		cabdto.setCabDriverName(cab.getCabDrvName());
		cabdto.setCabDriverPhone(cab.getCabDrvPhone());
		cabdto.setCabPoc(cab.getCabPoc());
		cabdto.setCabCapacity(cab.getCabCapacity());
		return cabdto;
	}
	public static final Cab convertIntoCab(CabDto cabdto)
	{
		Cab cab=new Cab();
		cab.setCabNum(cabdto.getCabNumber());
		cab.setCabDrvName(cabdto.getCabDriverName());
		cab.setCabCapacity(cabdto.getCabCapacity());
		cab.setCabDrvPhone(cabdto.getCabDriverPhone());
		cab.setCabPoc(cabdto.getCabPoc());
		return cab;
	}
	public static final List<CabDto> convertIntoCabDtoList(List<Cab> allcab)
	{
		List<CabDto> cabdtolist=new ArrayList<CabDto>();
		for(Cab cab:allcab)
		{
			CabDto cabdto=new CabDto();
			cabdto.setCabNumber(cab.getCabNum());
			cabdto.setCabDriverName(cab.getCabDrvName());
			cabdto.setCabCapacity(cab.getCabCapacity());
			cabdto.setCabDriverPhone(cab.getCabDrvPhone());
			cabdto.setCabPoc(cab.getCabPoc());
			cabdtolist.add(cabdto);
		}
		return cabdtolist;
	}
	public static final List<CabRouteDto> convertCabRouteDtoList(List<CabRoute> cabrtlist)
	{
		
		List<CabRouteDto> cabdtolist=new ArrayList<CabRouteDto>();
		for(CabRoute cabrt:cabrtlist)
		{
			CabRouteDto cabrtdto=new CabRouteDto();
			cabrtdto.setCabDirection(cabrt.getCabDirection());
			cabrtdto.setCabRoute(cabrt.getCabRoute());
			
			cabdtolist.add(cabrtdto);
		}
		
		
		return cabdtolist;
	}
	public static List<TimeslotDto> convertCabTimeDtoList(List<TimeSlot> cabtimelist)
	{

		List<TimeslotDto> cabtimedtolist=new ArrayList<TimeslotDto>();
		for(TimeSlot cabtime:cabtimelist)
		{
			TimeslotDto cabtimedto=new TimeslotDto();
			cabtimedto.setTimeSlot(cabtime.getTimeSlot().toString());
			cabtimedtolist.add(cabtimedto);
		}
		return cabtimedtolist;
	}

}
