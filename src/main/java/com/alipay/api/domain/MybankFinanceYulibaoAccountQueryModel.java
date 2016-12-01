package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余利宝账户和收益查询
 *
 * @author auto create
 * @since 1.0, 2016-09-20 11:37:51
 */
public class MybankFinanceYulibaoAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8659732617231599366L;

	/**
	 * 基金代码，必填。目前默认填001529，代表余利宝
	 */
	@ApiField("fund_code")
	private String fundCode;

	public String getFundCode() {
		return this.fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

}
