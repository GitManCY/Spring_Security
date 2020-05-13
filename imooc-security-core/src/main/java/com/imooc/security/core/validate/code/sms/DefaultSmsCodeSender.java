package com.imooc.security.core.validate.code.sms;

/**
 * 默认的短信验证码发送器
 * 
 * @author wangyouliang
 *
 */
public class DefaultSmsCodeSender implements SmsCodeSender {

	@Override
	public void send(String mobile, String code) {
        System.out.println("向手机"+mobile+"发送短信验证码"+code);
	}

}
