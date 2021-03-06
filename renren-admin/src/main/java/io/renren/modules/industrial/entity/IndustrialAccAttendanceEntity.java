package io.renren.modules.industrial.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 考勤记录
 * 
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
@TableName("industrial_acc_attendance")
public class IndustrialAccAttendanceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long attendanceId;
	/**
	 * 员工编号
	 */
	private Long empId;
	/**
	 * 年月
	 */
	private String ym;
	/**
	 * 年月
	 */
	private Long maxday;
	/**
	 * 
	 */
	private String d1;
	/**
	 * 
	 */
	private String d2;
	/**
	 * 
	 */
	private String d3;
	/**
	 * 
	 */
	private String d4;
	/**
	 * 
	 */
	private String d5;
	/**
	 * 
	 */
	private String d6;
	/**
	 * 
	 */
	private String d7;
	/**
	 * 
	 */
	private String d8;
	/**
	 * 
	 */
	private String d9;
	/**
	 * 
	 */
	private String d10;
	/**
	 * 
	 */
	private String d11;
	/**
	 * 
	 */
	private String d12;
	/**
	 * 
	 */
	private String d13;
	/**
	 * 
	 */
	private String d14;
	/**
	 * 
	 */
	private String d15;
	/**
	 * 
	 */
	private String d16;
	/**
	 * 
	 */
	private String d17;
	/**
	 * 
	 */
	private String d18;
	/**
	 * 
	 */
	private String d19;
	/**
	 * 
	 */
	private String d20;
	/**
	 * 
	 */
	private String d21;
	/**
	 * 
	 */
	private String d22;
	/**
	 * 
	 */
	private String d23;
	/**
	 * 
	 */
	private String d24;
	/**
	 * 
	 */
	private String d25;
	/**
	 * 
	 */
	private String d26;
	/**
	 * 
	 */
	private String d27;
	/**
	 * 
	 */
	private String d28;
	/**
	 * 
	 */
	private String d29;
	/**
	 * 
	 */
	private String d30;
	/**
	 * 
	 */
	private String d31;
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 设置：
	 */
	public void setAttendanceId(Long attendanceId) {
		this.attendanceId = attendanceId;
	}
	/**
	 * 获取：
	 */
	public Long getAttendanceId() {
		return attendanceId;
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
	 * 设置：年月
	 */
	public void setYm(String ym) {
		this.ym = ym;
	}
	/**
	 * 获取：年月
	 */
	public String getYm() {
		return ym;
	}
	/**
	 * 设置：年月
	 */
	public void setMaxday(Long maxday) {
		this.maxday = maxday;
	}
	/**
	 * 获取：年月
	 */
	public Long getMaxday() {
		return maxday;
	}
	/**
	 * 设置：
	 */
	public void setD1(String d1) {
		this.d1 = d1;
	}
	/**
	 * 获取：
	 */
	public String getD1() {
		return d1;
	}
	/**
	 * 设置：
	 */
	public void setD2(String d2) {
		this.d2 = d2;
	}
	/**
	 * 获取：
	 */
	public String getD2() {
		return d2;
	}
	/**
	 * 设置：
	 */
	public void setD3(String d3) {
		this.d3 = d3;
	}
	/**
	 * 获取：
	 */
	public String getD3() {
		return d3;
	}
	/**
	 * 设置：
	 */
	public void setD4(String d4) {
		this.d4 = d4;
	}
	/**
	 * 获取：
	 */
	public String getD4() {
		return d4;
	}
	/**
	 * 设置：
	 */
	public void setD5(String d5) {
		this.d5 = d5;
	}
	/**
	 * 获取：
	 */
	public String getD5() {
		return d5;
	}
	/**
	 * 设置：
	 */
	public void setD6(String d6) {
		this.d6 = d6;
	}
	/**
	 * 获取：
	 */
	public String getD6() {
		return d6;
	}
	/**
	 * 设置：
	 */
	public void setD7(String d7) {
		this.d7 = d7;
	}
	/**
	 * 获取：
	 */
	public String getD7() {
		return d7;
	}
	/**
	 * 设置：
	 */
	public void setD8(String d8) {
		this.d8 = d8;
	}
	/**
	 * 获取：
	 */
	public String getD8() {
		return d8;
	}
	/**
	 * 设置：
	 */
	public void setD9(String d9) {
		this.d9 = d9;
	}
	/**
	 * 获取：
	 */
	public String getD9() {
		return d9;
	}
	/**
	 * 设置：
	 */
	public void setD10(String d10) {
		this.d10 = d10;
	}
	/**
	 * 获取：
	 */
	public String getD10() {
		return d10;
	}
	/**
	 * 设置：
	 */
	public void setD11(String d11) {
		this.d11 = d11;
	}
	/**
	 * 获取：
	 */
	public String getD11() {
		return d11;
	}
	/**
	 * 设置：
	 */
	public void setD12(String d12) {
		this.d12 = d12;
	}
	/**
	 * 获取：
	 */
	public String getD12() {
		return d12;
	}
	/**
	 * 设置：
	 */
	public void setD13(String d13) {
		this.d13 = d13;
	}
	/**
	 * 获取：
	 */
	public String getD13() {
		return d13;
	}
	/**
	 * 设置：
	 */
	public void setD14(String d14) {
		this.d14 = d14;
	}
	/**
	 * 获取：
	 */
	public String getD14() {
		return d14;
	}
	/**
	 * 设置：
	 */
	public void setD15(String d15) {
		this.d15 = d15;
	}
	/**
	 * 获取：
	 */
	public String getD15() {
		return d15;
	}
	/**
	 * 设置：
	 */
	public void setD16(String d16) {
		this.d16 = d16;
	}
	/**
	 * 获取：
	 */
	public String getD16() {
		return d16;
	}
	/**
	 * 设置：
	 */
	public void setD17(String d17) {
		this.d17 = d17;
	}
	/**
	 * 获取：
	 */
	public String getD17() {
		return d17;
	}
	/**
	 * 设置：
	 */
	public void setD18(String d18) {
		this.d18 = d18;
	}
	/**
	 * 获取：
	 */
	public String getD18() {
		return d18;
	}
	/**
	 * 设置：
	 */
	public void setD19(String d19) {
		this.d19 = d19;
	}
	/**
	 * 获取：
	 */
	public String getD19() {
		return d19;
	}
	/**
	 * 设置：
	 */
	public void setD20(String d20) {
		this.d20 = d20;
	}
	/**
	 * 获取：
	 */
	public String getD20() {
		return d20;
	}
	/**
	 * 设置：
	 */
	public void setD21(String d21) {
		this.d21 = d21;
	}
	/**
	 * 获取：
	 */
	public String getD21() {
		return d21;
	}
	/**
	 * 设置：
	 */
	public void setD22(String d22) {
		this.d22 = d22;
	}
	/**
	 * 获取：
	 */
	public String getD22() {
		return d22;
	}
	/**
	 * 设置：
	 */
	public void setD23(String d23) {
		this.d23 = d23;
	}
	/**
	 * 获取：
	 */
	public String getD23() {
		return d23;
	}
	/**
	 * 设置：
	 */
	public void setD24(String d24) {
		this.d24 = d24;
	}
	/**
	 * 获取：
	 */
	public String getD24() {
		return d24;
	}
	/**
	 * 设置：
	 */
	public void setD25(String d25) {
		this.d25 = d25;
	}
	/**
	 * 获取：
	 */
	public String getD25() {
		return d25;
	}
	/**
	 * 设置：
	 */
	public void setD26(String d26) {
		this.d26 = d26;
	}
	/**
	 * 获取：
	 */
	public String getD26() {
		return d26;
	}
	/**
	 * 设置：
	 */
	public void setD27(String d27) {
		this.d27 = d27;
	}
	/**
	 * 获取：
	 */
	public String getD27() {
		return d27;
	}
	/**
	 * 设置：
	 */
	public void setD28(String d28) {
		this.d28 = d28;
	}
	/**
	 * 获取：
	 */
	public String getD28() {
		return d28;
	}
	/**
	 * 设置：
	 */
	public void setD29(String d29) {
		this.d29 = d29;
	}
	/**
	 * 获取：
	 */
	public String getD29() {
		return d29;
	}
	/**
	 * 设置：
	 */
	public void setD30(String d30) {
		this.d30 = d30;
	}
	/**
	 * 获取：
	 */
	public String getD30() {
		return d30;
	}
	/**
	 * 设置：
	 */
	public void setD31(String d31) {
		this.d31 = d31;
	}
	/**
	 * 获取：
	 */
	public String getD31() {
		return d31;
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
