package com.wxsp.basis.conf;


import com.wxsp.DataSourceOperationProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
/**
 * @author HuXinsheng
 */
@Configuration
@ConfigurationProperties(prefix = "basis.druid")
public class BasisDataSourceOperationProperties extends DataSourceOperationProperties {

}
