package com.pb.apps.cms.dao;

import com.pb.apps.cms.bean.RolePrivilege;
import com.pb.apps.cms.bean.RolePrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePrivilegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    long countByExample(RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    int deleteByExample(RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    int insert(RolePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    int insertSelective(RolePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    List<RolePrivilege> selectByExample(RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    RolePrivilege selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") RolePrivilege record, @Param("example") RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    int updateByExample(@Param("record") RolePrivilege record, @Param("example") RolePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(RolePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_privilege
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    int updateByPrimaryKey(RolePrivilege record);
}