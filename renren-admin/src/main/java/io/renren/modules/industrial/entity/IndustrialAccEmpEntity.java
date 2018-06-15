package io.renren.modules.industrial.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工信息
 * 
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
@TableName("industrial_acc_emp")
public class IndustrialAccEmpEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long empId;
	/**
	 * 姓名
	 */
	private String empName;
	/**
	 * 性别
	 */
	private String empSex;
	/**
	 * 出生年月
	 */
	private Date empBirthday;
	/**
	 * 学历
	 */
	private String empEdu;
	/**
	 * 政治面貌
	 */
	private String empPolitics;
	/**
	 * 身份证号码
	 */
	private String empCertificateNumber;
	/**
	 * 户籍地址
	 */
	private String empRegistered;
	/**
	 * 移动电话
	 */
	private String empMob;
	/**
	 * 固定电话
	 */
	private String empTel;
	/**
	 * 通讯地址
	 */
	private String empAdd;
	/**
	 * 紧急联系人
	 */
	private String empEmergencyContact;
	/**
	 * 紧急联系人电话
	 */
	private String empEmergencyTel;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 身份证照片
	 */
	private String empCertificatePic;

	/**
	 * 设置：
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	/**
	 * 获取：
	 */
	public Long getEmpId() {
		return empId;
	}
	/**
	 * 设置：姓名
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * 获取：姓名
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * 设置：性别
	 */
	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}
	/**
	 * 获取：性别
	 */
	public String getEmpSex() {
		return empSex;
	}
	/**
	 * 设置：出生年月
	 */
	public void setEmpBirthday(Date empBirthday) {
		this.empBirthday = empBirthday;
	}
	/**
	 * 获取：出生年月
	 */
	public Date getEmpBirthday() {
		return empBirthday;
	}
	/**
	 * 设置：学历
	 */
	public void setEmpEdu(String empEdu) {
		this.empEdu = empEdu;
	}
	/**
	 * 获取：学历
	 */
	public String getEmpEdu() {
		return empEdu;
	}
	/**
	 * 设置：政治面貌
	 */
	public void setEmpPolitics(String empPolitics) {
		this.empPolitics = empPolitics;
	}
	/**
	 * 获取：政治面貌
	 */
	public String getEmpPolitics() {
		return empPolitics;
	}
	/**
	 * 设置：身份证号码
	 */
	public void setEmpCertificateNumber(String empCertificateNumber) {
		this.empCertificateNumber = empCertificateNumber;
	}
	/**
	 * 获取：身份证号码
	 */
	public String getEmpCertificateNumber() {
		return empCertificateNumber;
	}
	/**
	 * 设置：户籍地址
	 */
	public void setEmpRegistered(String empRegistered) {
		this.empRegistered = empRegistered;
	}
	/**
	 * 获取：户籍地址
	 */
	public String getEmpRegistered() {
		return empRegistered;
	}
	/**
	 * 设置：移动电话
	 */
	public void setEmpMob(String empMob) {
		this.empMob = empMob;
	}
	/**
	 * 获取：移动电话
	 */
	public String getEmpMob() {
		return empMob;
	}
	/**
	 * 设置：固定电话
	 */
	public void setEmpTel(String empTel) {
		this.empTel = empTel;
	}
	/**
	 * 获取：固定电话
	 */
	public String getEmpTel() {
		return empTel;
	}
	/**
	 * 设置：通讯地址
	 */
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	/**
	 * 获取：通讯地址
	 */
	public String getEmpAdd() {
		return empAdd;
	}
	/**
	 * 设置：紧急联系人
	 */
	public void setEmpEmergencyContact(String empEmergencyContact) {
		this.empEmergencyContact = empEmergencyContact;
	}
	/**
	 * 获取：紧急联系人
	 */
	public String getEmpEmergencyContact() {
		return empEmergencyContact;
	}
	/**
	 * 设置：紧急联系人电话
	 */
	public void setEmpEmergencyTel(String empEmergencyTel) {
		this.empEmergencyTel = empEmergencyTel;
	}
	/**
	 * 获取：紧急联系人电话
	 */
	public String getEmpEmergencyTel() {
		return empEmergencyTel;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：身份证照片
	 */
	public void setEmpCertificatePic(String empCertificatePic) {
		this.empCertificatePic = empCertificatePic;
	}
	/**
	 * 获取：身份证照片
	 */
	public String getEmpCertificatePic() {
		return empCertificatePic;
	}
}
