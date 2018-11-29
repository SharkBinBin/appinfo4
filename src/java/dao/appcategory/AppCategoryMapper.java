package dao.appcategory;

import org.apache.ibatis.annotations.Param;
import pojo.AppCategory;

import java.util.List;

public interface AppCategoryMapper {
	
	public List<AppCategory> getAppCategoryListByParentId(@Param("parentId") Integer parentId)throws Exception;
}
