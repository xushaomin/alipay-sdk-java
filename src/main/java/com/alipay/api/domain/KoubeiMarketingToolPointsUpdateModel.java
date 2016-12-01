package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新卡积分
 *
 * @author auto create
 * @since 1.0, 2016-10-09 11:44:58
 */
public class KoubeiMarketingToolPointsUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 1435945957552467284L;

	/**
	 * 活动集点帐户ID
	 */
	@ApiField("activity_account")
	private String activityAccount;

	/**
	 * 业务流水号，集点交易类型为
DEPOSIT，传入支付交易号
FREEZE／COMMIT，传入冻结集点的集点流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 交易备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部流水号,用于控制业务幂等
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 门店ID，集点交易类型为DEPOSIT时填写
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 集点交易数量，必须为正整数字符串
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 集点交易类型，目前支持:
DEPOSIT，加集点
FREEZE，冻结集点
COMMIT，提交冻结集点
CANCEL，取消冻结集点
	 */
	@ApiField("trans_type")
	private String transType;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityAccount() {
		return this.activityAccount;
	}
	public void setActivityAccount(String activityAccount) {
		this.activityAccount = activityAccount;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransType() {
		return this.transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
