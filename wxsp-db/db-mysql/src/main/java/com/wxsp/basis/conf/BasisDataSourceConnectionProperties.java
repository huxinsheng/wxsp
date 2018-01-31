package com.wxsp.basis.conf;


import com.wxsp.DataSourceConnectionProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
/**
 * @author HuXinsheng
 */
@Configuration
@ConfigurationProperties(prefix = "basis.connection")
public class BasisDataSourceConnectionProperties extends DataSourceConnectionProperties {

}
