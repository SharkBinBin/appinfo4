package service.developer;

import pojo.DevUser;

public interface DevUserService {
	/**
	 * 用户登录
	 * @param devCode
	 * @param devPassword
	 * @return
	 */
	public DevUser login(String devCode, String devPassword) throws Exception;
	public DevUser loginUser(String devCode,String devPassword)throws  Exception;
}
