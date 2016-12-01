package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建活动的招商信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class RecruitTool extends AlipayObject {

	private static final long serialVersionUID = 8815765556994526942L;

	/**
	 * 招商结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 招商pid和pid对应的门第列表（对于品牌商，此字段必填，活动和券的适用门店为空。对于商圈，此字段需为空，门店需要填在活动和券的适用门店上）
	 */
	@ApiListField("pid_shops")
	@ApiField("pid_shop_info")
	private List<PidShopInfo> pidShops;

	/**
	 * 招商开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<PidShopInfo> getPidShops() {
		return this.pidShops;
	}
	public void setPidShops(List<PidShopInfo> pidShops) {
		this.pidShops = pidShops;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
