package com.imooc.security.core.properties;

/**
 * 浏览器环境配置项
 *
 * @author wangyouliang
 *
 */
public class BrowserProperties {

    /**
     * 登录页面，当引发登录行为的url，以html结尾时，会跳到这里配置的url上
     */
	private String loginPage = "/imooc-signIn.html";

    /**
     * 登录响应的方式，默认是json
     */
    private LoginType loginType = LoginType.JSON;

    /**
     * '记住我'功能的有效时间，默认1小时
     */
    private int rememberMeSeconds = 3600;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    public int getRememberMeSeconds() {
        return rememberMeSeconds;
    }

    public void setRememberMeSeconds(int rememberMeSeconds) {
        this.rememberMeSeconds = rememberMeSeconds;
    }
}
