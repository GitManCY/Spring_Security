package com.imooc.security.core.validate.code;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import java.util.Map;

/**
 * 生成校验码的请求处理器
 * 
 * @author wangyouliang
 *
 */
@RestController
public class ValidateCodeController {

	@Autowired
	private Map<String, ValidateCodeProcessor> validateCodeProcessors;

	/**
	 * 创建验证码，根据验证码类型不同，调用不同的 {@link ValidateCodeProcessor}接口实现
	 * 
	 * @param request
	 * @param response
	 * @param type
	 * @throws Exception
	 */
	@GetMapping("/code/{type}")
	public void createCode(HttpServletRequest request, HttpServletResponse response, @PathVariable String type) throws Exception {

        validateCodeProcessors.get(type + "ValidateCodeProcessor").create(new ServletWebRequest(request, response));
	}

}
