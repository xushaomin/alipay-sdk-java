package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义报表过滤标签
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class FilterTag extends AlipayObject {

	private static final long serialVersionUID = 3394799533433762417L;

	/**
	 * 过滤条件的标签code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 分组过滤条件
	 */
	@ApiField("filter_items")
	private String filterItems;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getFilterItems() {
		return this.filterItems;
	}
	public void setFilterItems(String filterItems) {
		this.filterItems = filterItems;
	}

}
