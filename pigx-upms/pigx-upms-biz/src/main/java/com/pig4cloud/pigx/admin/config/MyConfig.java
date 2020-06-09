/**
 * Copyright (C), 2019-2020, 成都房联云码科技有限公司
 * FileName: MyConfig
 * Author:   Arron-wql
 * Date:     2020/6/4 14:19
 * Description: 配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pig4cloud.pigx.admin.config;

import com.pig4cloud.pigx.admin.api.entity.SysUser;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * 配置类
 *
 * @author qinglong.wu@funi365.com
 * @create 2020/6/4
 * @Version 1.0.0
 */
@Configuration
@ComponentScan(value = "com.pig4cloud.pigx",includeFilters =  {
		@ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class, Service.class, Mapper.class})
})
public class MyConfig {

	@Bean("setting")
	public SysUser getUser() {
		return new SysUser();
	}

}