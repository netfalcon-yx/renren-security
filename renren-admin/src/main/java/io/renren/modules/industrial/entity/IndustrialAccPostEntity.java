package io.renren.modules.industrial.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 岗位信息
 * 
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
@TableName("industrial_acc_post")
public class IndustrialAccPostEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long postId;
	/**
	 * 岗位名称
	 */
	private Long postName;
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 设置：
	 */
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	/**
	 * 获取：
	 */
	public Long getPostId() {
		return postId;
	}
	/**
	 * 设置：岗位名称
	 */
	public void setPostName(Long postName) {
		this.postName = postName;
	}
	/**
	 * 获取：岗位名称
	 */
	public Long getPostName() {
		return postName;
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
