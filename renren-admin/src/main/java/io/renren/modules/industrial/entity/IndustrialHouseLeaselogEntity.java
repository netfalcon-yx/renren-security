package io.renren.modules.industrial.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 租赁记录
 * 
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:22
 */
@TableName("industrial_house_leaselog")
public class IndustrialHouseLeaselogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long leaseId;
	/**
	 * 房屋id
	 */
	private Long houseId;
	/**
	 * 租客id
	 */
	private Long tenantId;
	/**
	 * 入住日期
	 */
	private String startDate;
	/**
	 * 到期日期
	 */
	private String endDate;
	/**
	 * 经办人
	 */
	private String agent;
	/**
	 * 租金
	 */
	private BigDecimal rent;
	/**
	 * 租金状态
	 */
	private String rentType;
	/**
	 * 押金
	 */
	private BigDecimal deposit;
	/**
	 * 押金状态
	 */
	private String depositType;
	/**
	 * 备注信息
	 */
	private String remark;

	/**
	 * 设置：
	 */
	public void setLeaseId(Long leaseId) {
		this.leaseId = leaseId;
	}
	/**
	 * 获取：
	 */
	public Long getLeaseId() {
		return leaseId;
	}
	/**
	 * 设置：房屋id
	 */
	public void setHouseId(Long houseId) {
		this.houseId = houseId;
	}
	/**
	 * 获取：房屋id
	 */
	public Long getHouseId() {
		return houseId;
	}
	/**
	 * 设置：租客id
	 */
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}
	/**
	 * 获取：租客id
	 */
	public Long getTenantId() {
		return tenantId;
	}
	/**
	 * 设置：入住日期
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：入住日期
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * 设置：到期日期
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：到期日期
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * 设置：经办人
	 */
	public void setAgent(String agent) {
		this.agent = agent;
	}
	/**
	 * 获取：经办人
	 */
	public String getAgent() {
		return agent;
	}
	/**
	 * 设置：租金
	 */
	public void setRent(BigDecimal rent) {
		this.rent = rent;
	}
	/**
	 * 获取：租金
	 */
	public BigDecimal getRent() {
		return rent;
	}
	/**
	 * 设置：租金状态
	 */
	public void setRentType(String rentType) {
		this.rentType = rentType;
	}
	/**
	 * 获取：租金状态
	 */
	public String getRentType() {
		return rentType;
	}
	/**
	 * 设置：押金
	 */
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}
	/**
	 * 获取：押金
	 */
	public BigDecimal getDeposit() {
		return deposit;
	}
	/**
	 * 设置：押金状态
	 */
	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}
	/**
	 * 获取：押金状态
	 */
	public String getDepositType() {
		return depositType;
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
}
