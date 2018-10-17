package com.shjd.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 微信授权数据持久化
 *
 * @author YangS
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WeChatAccountConfig {
    private String mpAppId;

    private String mpAppSecret;

}
