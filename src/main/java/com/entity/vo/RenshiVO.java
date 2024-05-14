package com.entity.vo;

import com.entity.RenshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 人事人员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("renshi")
public class RenshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 人事人员姓名
     */

    @TableField(value = "renshi_name")
    private String renshiName;


    /**
     * 人事人员手机号
     */

    @TableField(value = "renshi_phone")
    private String renshiPhone;


    /**
     * 人事人员身份证号
     */

    @TableField(value = "renshi_id_number")
    private String renshiIdNumber;


    /**
     * 人事人员头像
     */

    @TableField(value = "renshi_photo")
    private String renshiPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "ruzhi_time")
    private Date ruzhiTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：人事人员姓名
	 */
    public String getRenshiName() {
        return renshiName;
    }


    /**
	 * 获取：人事人员姓名
	 */

    public void setRenshiName(String renshiName) {
        this.renshiName = renshiName;
    }
    /**
	 * 设置：人事人员手机号
	 */
    public String getRenshiPhone() {
        return renshiPhone;
    }


    /**
	 * 获取：人事人员手机号
	 */

    public void setRenshiPhone(String renshiPhone) {
        this.renshiPhone = renshiPhone;
    }
    /**
	 * 设置：人事人员身份证号
	 */
    public String getRenshiIdNumber() {
        return renshiIdNumber;
    }


    /**
	 * 获取：人事人员身份证号
	 */

    public void setRenshiIdNumber(String renshiIdNumber) {
        this.renshiIdNumber = renshiIdNumber;
    }
    /**
	 * 设置：人事人员头像
	 */
    public String getRenshiPhoto() {
        return renshiPhoto;
    }


    /**
	 * 获取：人事人员头像
	 */

    public void setRenshiPhoto(String renshiPhoto) {
        this.renshiPhoto = renshiPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：入职时间
	 */
    public Date getRuzhiTime() {
        return ruzhiTime;
    }


    /**
	 * 获取：入职时间
	 */

    public void setRuzhiTime(Date ruzhiTime) {
        this.ruzhiTime = ruzhiTime;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
