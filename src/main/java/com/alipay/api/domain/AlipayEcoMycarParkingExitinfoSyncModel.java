package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆驶出上送接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:18
 */
public class AlipayEcoMycarParkingExitinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4366541168363334996L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 上送车辆的时间，格式"yyyy-MM-dd HH
	 */
	@ApiField("out_time")
	private String outTime;

	/**
	 * 停车场id
	 */
	@ApiField("parking_id")
	private String parkingId;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getOutTime() {
		return this.outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}
