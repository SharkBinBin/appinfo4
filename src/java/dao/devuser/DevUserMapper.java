package dao.devuser;

import pojo.DevUser;
import org.apache.ibatis.annotations.Param;

public interface DevUserMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public DevUser getLoginUser(@Param("devCode") String devCode)throws Exception;
	public DevUser LoginUser(@Param("devCode")String DevCode);
}
