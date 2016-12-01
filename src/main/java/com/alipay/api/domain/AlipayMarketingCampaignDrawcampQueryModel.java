package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动查询
 *
 * @author auto create
 * @since 1.0, 2016-10-26 21:36:31
 */
public class AlipayMarketingCampaignDrawcampQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7738498413193929216L;

	/**
	 * 抽奖活动id，通过alipay.marketing.campaign.drawcamp.create接口返回
	 */
	@ApiField("camp_id")
	private String campId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

}
