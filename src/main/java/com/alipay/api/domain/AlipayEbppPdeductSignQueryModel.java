package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直连代扣协议查询接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:19
 */
public class AlipayEbppPdeductSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8418648536943264599L;

	/**
	 * 支付宝代扣协议Id
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
