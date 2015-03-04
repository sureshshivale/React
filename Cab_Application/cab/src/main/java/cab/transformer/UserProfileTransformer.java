package cab.transformer;

import java.util.ArrayList;
import java.util.List;

import com.cab.dao.entity.UserProfile;

import cab.dto.UserProfileDto;

public class UserProfileTransformer {

	public List<UserProfileDto> convertUserProfileDtoList(List<UserProfile> userProfile)
	{
		
		List<UserProfileDto> userDtoList=new ArrayList<UserProfileDto>();
		for(UserProfile user:userProfile)
		{
			UserProfileDto userDto=new UserProfileDto();
			userDto.setUserId(user.getUserId());
			userDto.setUserName(user.getUserName());
			userDto.setUserEmail(user.getUserEmail());
			userDto.setUserPhone(user.getUserPhone());
			userDtoList.add(userDto);
		}
		
		
		
		return userDtoList;
	}
}
