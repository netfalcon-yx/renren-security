package io.renren.modules.industrial.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 租客信息
 * 
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:22
 */
@TableName("industrial_house_tenant")
public class IndustrialHouseTenantEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long tenantId;
	/**
	 * 租客名称
	 */
	private String tenantName;
	/**
	 * 租客公司名称
	 */
	private String tenantCompany;
	/**
	 * 证件名称
	 */
	private String certificateTyep;
	/**
	 * 证件编号
	 */
	private String certificateNumber;
	/**
	 * 手机号
	 */
	private String tenantMob;
	/**
	 * 固定电话
	 */
	private String tenantTel;
	/**
	 * 备注信息
	 */
	private String remark;
	/**
	 * 证件图片
	 */
	private String certificatePicpath;

	/**
	 * 设置：
	 */
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}
	/**
	 * 获取：
	 */
	public Long getTenantId() {
		return tenantId;
	}
	/**
	 * 设置：租客名称
	 */
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	/**
	 * 获取：租客名称
	 */
	public String getTenantName() {
		return tenantName;
	}
	/**
	 * 设置：租客公司名称
	 */
	public void setTenantCompany(String tenantCompany) {
		this.tenantCompany = tenantCompany;
	}
	/**
	 * 获取：租客公司名称
	 */
	public String getTenantCompany() {
		return tenantCompany;
	}
	/**
	 * 设置：证件名称
	 */
	public void setCertificateTyep(String certificateTyep) {
		this.certificateTyep = certificateTyep;
	}
	/**
	 * 获取：证件名称
	 */
	public String getCertificateTyep() {
		return certificateTyep;
	}
	/**
	 * 设置：证件编号
	 */
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
	/**
	 * 获取：证件编号
	 */
	public String getCertificateNumber() {
		return certificateNumber;
	}
	/**
	 * 设置：手机号
	 */
	public void setTenantMob(String tenantMob) {
		this.tenantMob = tenantMob;
	}
	/**
	 * 获取：手机号
	 */
	public String getTenantMob() {
		return tenantMob;
	}
	/**
	 * 设置：固定电话
	 */
	public void setTenantTel(String tenantTel) {
		this.tenantTel = tenantTel;
	}
	/**
	 * 获取：固定电话
	 */
	public String getTenantTel() {
		return tenantTel;
	}
	/**
	 * 设置：备注信息
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注信息
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：证件图片
	 */
	public void setCertificatePicpath(String certificatePicpath) {
		this.certificatePicpath = certificatePicpath;
	}
	/**
	 * 获取：证件图片
	 */
	public String getCertificatePicpath() {
		return certificatePicpath;
	}
}
