package zone.zhiyi.boot.oauth2.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
@Configuration
@EnableResourceServer // 启动资源服务器配置
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

}
