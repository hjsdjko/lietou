package com.entity.vo;

import com.entity.CaiwurenyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 财务人员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("caiwurenyuan")
public class CaiwurenyuanVO implements Serializable {
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
     * 财务人员姓名
     */

    @TableField(value = "caiwurenyuan_name")
    private String caiwurenyuanName;


    /**
     * 财务人员手机号
     */

    @TableField(value = "caiwurenyuan_phone")
    private String caiwurenyuanPhone;


    /**
     * 财务人员身份证号
     */

    @TableField(value = "caiwurenyuan_id_number")
    private String caiwurenyuanIdNumber;


    /**
     * 财务人员头像
     */

    @TableField(value = "caiwurenyuan_photo")
    private String caiwurenyuanPhoto;


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
	 * 设置：财务人员姓名
	 */
    public String getCaiwurenyuanName() {
        return caiwurenyuanName;
    }


    /**
	 * 获取：财务人员姓名
	 */

    public void setCaiwurenyuanName(String caiwurenyuanName) {
        this.caiwurenyuanName = caiwurenyuanName;
    }
    /**
	 * 设置：财务人员手机号
	 */
    public String getCaiwurenyuanPhone() {
        return caiwurenyuanPhone;
    }


    /**
	 * 获取：财务人员手机号
	 */

    public void setCaiwurenyuanPhone(String caiwurenyuanPhone) {
        this.caiwurenyuanPhone = caiwurenyuanPhone;
    }
    /**
	 * 设置：财务人员身份证号
	 */
    public String getCaiwurenyuanIdNumber() {
        return caiwurenyuanIdNumber;
    }


    /**
	 * 获取：财务人员身份证号
	 */

    public void setCaiwurenyuanIdNumber(String caiwurenyuanIdNumber) {
        this.caiwurenyuanIdNumber = caiwurenyuanIdNumber;
    }
    /**
	 * 设置：财务人员头像
	 */
    public String getCaiwurenyuanPhoto() {
        return caiwurenyuanPhoto;
    }


    /**
	 * 获取：财务人员头像
	 */

    public void setCaiwurenyuanPhoto(String caiwurenyuanPhoto) {
        this.caiwurenyuanPhoto = caiwurenyuanPhoto;
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
