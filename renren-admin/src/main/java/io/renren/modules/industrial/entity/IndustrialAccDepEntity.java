package io.renren.modules.industrial.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 部门信息
 * 
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
@TableName("industrial_acc_dep")
public class IndustrialAccDepEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long depId;
	/**
	 * 部门名称
	 */
	private String depName;
	/**
	 * 上级单位
	 */
	private Long depParent;
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 设置：
	 */
	public void setDepId(Long depId) {
		this.depId = depId;
	}
	/**
	 * 获取：
	 */
	public Long getDepId() {
		return depId;
	}
	/**
	 * 设置：部门名称
	 */
	public void setDepName(String depName) {
		this.depName = depName;
	}
	/**
	 * 获取：部门名称
	 */
	public String getDepName() {
		return depName;
	}
	/**
	 * 设置：上级单位
	 */
	public void setDepParent(Long depParent) {
		this.depParent = depParent;
	}
	/**
	 * 获取：上级单位
	 */
	public Long getDepParent() {
		return depParent;
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
