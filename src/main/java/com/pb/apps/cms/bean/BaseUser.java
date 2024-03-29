package com.pb.apps.cms.bean;

public class BaseUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.id
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.username
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.password
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.telephone
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.realname
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.gender
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.birth
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private Long birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.register_time
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private Long registerTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.status
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.user_face
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String userFace;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.id
     *
     * @return the value of base_user.id
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.id
     *
     * @param id the value for base_user.id
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.username
     *
     * @return the value of base_user.username
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.username
     *
     * @param username the value for base_user.username
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.password
     *
     * @return the value of base_user.password
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.password
     *
     * @param password the value for base_user.password
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.telephone
     *
     * @return the value of base_user.telephone
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.telephone
     *
     * @param telephone the value for base_user.telephone
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.realname
     *
     * @return the value of base_user.realname
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.realname
     *
     * @param realname the value for base_user.realname
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.gender
     *
     * @return the value of base_user.gender
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.gender
     *
     * @param gender the value for base_user.gender
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.birth
     *
     * @return the value of base_user.birth
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public Long getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.birth
     *
     * @param birth the value for base_user.birth
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setBirth(Long birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.register_time
     *
     * @return the value of base_user.register_time
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public Long getRegisterTime() {
        return registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.register_time
     *
     * @param registerTime the value for base_user.register_time
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.status
     *
     * @return the value of base_user.status
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.status
     *
     * @param status the value for base_user.status
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.user_face
     *
     * @return the value of base_user.user_face
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getUserFace() {
        return userFace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.user_face
     *
     * @param userFace the value for base_user.user_face
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setUserFace(String userFace) {
        this.userFace = userFace == null ? null : userFace.trim();
    }
}