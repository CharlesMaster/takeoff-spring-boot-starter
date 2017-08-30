package com.bad.evil;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("takeoff.service")
public class TakeoffProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
