package tobyspring.config.autoconfig;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
<<<<<<<< HEAD:src/main/java/tobyspring/config/autoconfig/TomcatWebServerConfig.java
import tobyspring.config.MyAutoConfiguration;

@MyAutoConfiguration
public class TomcatWebServerConfig {

========
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatWebServerConfiguration {
>>>>>>>> 5473d270c29a966809e394f9c3a7964caaacc5c4:src/main/java/tobyspring/config/autoconfig/TomcatWebServerConfiguration.java
    @Bean
    public ServletWebServerFactory servletWebServerFactory() {
        return new TomcatServletWebServerFactory();
    }
}
