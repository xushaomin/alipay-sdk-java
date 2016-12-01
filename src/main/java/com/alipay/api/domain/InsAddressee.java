package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单邮寄地址
 *
 * @author auto create
 * @since 1.0, 2016-09-21 17:15:45
 */
public class InsAddressee extends AlipayObject {

	private static final long serialVersionUID = 7546373552767728511L;

	/**
	 * 收件人地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 收件人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 收件人移动电话
	 */
	@ApiField("phone")
	private String phone;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
