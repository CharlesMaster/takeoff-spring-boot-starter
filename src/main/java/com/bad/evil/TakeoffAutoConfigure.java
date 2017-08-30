package com.bad.evil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(TakeoffService.class)
@EnableConfigurationProperties(TakeoffProperties.class)
public class TakeoffAutoConfigure {

    @Autowired
    private TakeoffProperties takeoffProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "takeoff.service",value = "enabled",havingValue = "true")
    TakeoffService takeoffService(){
        return new TakeoffService(takeoffProperties.getPrefix(),takeoffProperties.getSuffix());
    }

}
