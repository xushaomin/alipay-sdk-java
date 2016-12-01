package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.auth.info.authquery response.
 * 
 * @author auto create
 * @since 1.0, 2016-09-21 19:49:58
 */
public class ZhimaAuthInfoAuthqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3347761198537373451L;

	/** 
	 * 是否已经授权,已授权:true,未授权:false
	 */
	@ApiField("authorized")
	private Boolean authorized;

	public void setAuthorized(Boolean authorized) {
		this.authorized = authorized;
	}
	public Boolean getAuthorized( ) {
		return this.authorized;
	}

}
