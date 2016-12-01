package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统商通过该接口可以查询所有门店的外部门店编号（系统商的门店编号）
 *
 * @author auto create
 * @since 1.0, 2016-09-19 17:47:24
 */
public class AlipayOfflineMarketShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4718657479533418619L;

	/**
	 * 页码，第一页传入"1"，默认500个结果为一页
	 */
	@ApiField("page_no")
	private String pageNo;

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

}
