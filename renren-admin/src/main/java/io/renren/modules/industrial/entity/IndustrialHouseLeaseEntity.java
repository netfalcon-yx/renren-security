package io.renren.modules.industrial.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 房屋信息
 * 
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:22
 */
@TableName("industrial_house_lease")
public class IndustrialHouseLeaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long houseId;
	/**
	 * 城区
	 */
	private String partitionname;
	/**
	 * 小区名称
	 */
	private String placesname;
	/**
	 * 楼栋
	 */
	private String buildingname;
	/**
	 * 单元
	 */
	private String unitname;
	/**
	 * 房号
	 */
	private String roomnumber;
	/**
	 * 租金
	 */
	private BigDecimal rent;
	/**
	 * 租期
	 */
	private Date expiredate;
	/**
	 * 房屋布局图
	 */
	private String picpath;
	/**
	 * 备注信息
	 */
	private String remark;

	/**
	 * 设置：
	 */
	public void setHouseId(Long houseId) {
		this.houseId = houseId;
	}
	/**
	 * 获取：
	 */
	public Long getHouseId() {
		return houseId;
	}
	/**
	 * 设置：城区
	 */
	public void setPartitionname(String partitionname) {
		this.partitionname = partitionname;
	}
	/**
	 * 获取：城区
	 */
	public String getPartitionname() {
		return partitionname;
	}
	/**
	 * 设置：小区名称
	 */
	public void setPlacesname(String placesname) {
		this.placesname = placesname;
	}
	/**
	 * 获取：小区名称
	 */
	public String getPlacesname() {
		return placesname;
	}
	/**
	 * 设置：楼栋
	 */
	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
	/**
	 * 获取：楼栋
	 */
	public String getBuildingname() {
		return buildingname;
	}
	/**
	 * 设置：单元
	 */
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	/**
	 * 获取：单元
	 */
	public String getUnitname() {
		return unitname;
	}
	/**
	 * 设置：房号
	 */
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	/**
	 * 获取：房号
	 */
	public String getRoomnumber() {
		return roomnumber;
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
	 * 设置：租期
	 */
	public void setExpiredate(Date expiredate) {
		this.expiredate = expiredate;
	}
	/**
	 * 获取：租期
	 */
	public Date getExpiredate() {
		return expiredate;
	}
	/**
	 * 设置：房屋布局图
	 */
	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}
	/**
	 * 获取：房屋布局图
	 */
	public String getPicpath() {
		return picpath;
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
