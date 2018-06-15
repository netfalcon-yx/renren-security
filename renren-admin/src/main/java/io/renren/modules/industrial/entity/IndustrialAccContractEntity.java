package io.renren.modules.industrial.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 合同信息
 * 
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
@TableName("industrial_acc_contract")
public class IndustrialAccContractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long contractId;
	/**
	 * 员工编号
	 */
	private Long empId;
	/**
	 * 合同计数
	 */
	private String contractCount;
	/**
	 * 合同类型
	 */
	private String contractType;
	/**
	 * 合同起始时间
	 */
	private Date contractStart;
	/**
	 * 合同截止时间
	 */
	private Date contractEnd;
	/**
	 * 合同签订时间
	 */
	private Date contractDate;
	/**
	 * 经办人
	 */
	private String contractOperator;
	/**
	 * 合同文本
	 */
	private String contractPic;
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 设置：
	 */
	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}
	/**
	 * 获取：
	 */
	public Long getContractId() {
		return contractId;
	}
	/**
	 * 设置：员工编号
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	/**
	 * 获取：员工编号
	 */
	public Long getEmpId() {
		return empId;
	}
	/**
	 * 设置：合同计数
	 */
	public void setContractCount(String contractCount) {
		this.contractCount = contractCount;
	}
	/**
	 * 获取：合同计数
	 */
	public String getContractCount() {
		return contractCount;
	}
	/**
	 * 设置：合同类型
	 */
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	/**
	 * 获取：合同类型
	 */
	public String getContractType() {
		return contractType;
	}
	/**
	 * 设置：合同起始时间
	 */
	public void setContractStart(Date contractStart) {
		this.contractStart = contractStart;
	}
	/**
	 * 获取：合同起始时间
	 */
	public Date getContractStart() {
		return contractStart;
	}
	/**
	 * 设置：合同截止时间
	 */
	public void setContractEnd(Date contractEnd) {
		this.contractEnd = contractEnd;
	}
	/**
	 * 获取：合同截止时间
	 */
	public Date getContractEnd() {
		return contractEnd;
	}
	/**
	 * 设置：合同签订时间
	 */
	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}
	/**
	 * 获取：合同签订时间
	 */
	public Date getContractDate() {
		return contractDate;
	}
	/**
	 * 设置：经办人
	 */
	public void setContractOperator(String contractOperator) {
		this.contractOperator = contractOperator;
	}
	/**
	 * 获取：经办人
	 */
	public String getContractOperator() {
		return contractOperator;
	}
	/**
	 * 设置：合同文本
	 */
	public void setContractPic(String contractPic) {
		this.contractPic = contractPic;
	}
	/**
	 * 获取：合同文本
	 */
	public String getContractPic() {
		return contractPic;
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
}
