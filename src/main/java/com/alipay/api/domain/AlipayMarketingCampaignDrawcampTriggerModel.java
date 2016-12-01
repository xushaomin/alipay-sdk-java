package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动触发
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:17
 */
public class AlipayMarketingCampaignDrawcampTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 7391224528537135151L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 用户登录号/用户uid，非脱敏账号
	 */
	@ApiField("user_id")
	private String userId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
