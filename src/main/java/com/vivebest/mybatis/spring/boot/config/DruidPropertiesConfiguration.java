package com.vivebest.mybatis.spring.boot.config;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Druid的DataResource配置类 凡是被Spring管理的类，实现接口 EnvironmentAware 重写方法 setEnvironment 可以在工程启动时，
 * 获取到系统环境变量和application配置文件中的变量。 还有一种方式是采用注解的方式获取 @value("${变量的key值}") 获取application配置文件中的变量。 这里采用第一种要方便些
 * <p>
 * 
 * @version 1.0.0,2017年4月27日
 * @author zhengzhangwen
 * @since 1.0.0
 */
@ConfigurationProperties(prefix = "druid")
public class DruidPropertiesConfiguration {

	@NotNull
    private String url;

    private String driverClassName;

    private String username;

    private String password;

    private int maxActive;

    private int initialSize;

    private int minIdle;

    private boolean testOnBorrow;

    private String filters;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        return "DruidPropertiesConfiguration [url=" + url + ", driverClassName=" + driverClassName + ", username=" + username + ", password="
            + password + ", maxActive=" + maxActive + ", initialSize=" + initialSize + ", minIdle=" + minIdle + ", testOnBorrow=" + testOnBorrow
            + ", filters=" + filters + "]";
    }
}
