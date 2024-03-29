package com.pb.apps.cms.dao.extend;

import java.util.List;

import com.pb.apps.cms.bean.BaseRole;
import com.pb.apps.cms.bean.extend.BaseRoleExtend;

/**

* @类说明 
* @Title BaseRoleExtendMapper.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 上午10:21:21

*/
public interface BaseRoleExtendMapper {
	public BaseRole selectByUserId(long id);
	
	public List<BaseRoleExtend> findAllWithPrivilege();
}
