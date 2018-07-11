package com.vivebest.mybatis.spring.boot.config;

import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 公共配置类，所有模块共用 AppConfiguration
 * <p>
 * 
 * @version 1.0.0,2017年5月9日
 * @author zhengzhangwen
 * @since 1.0.0
 */
@Configuration
public class AppConfiguration {

    /**
     * @Title: messageSource 
     * @Description: 国际资源化配置 
     * @param @return    设定文件 
     * @return MessageSource    返回类型 
     * @throws
     */
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource bundleMessageSource = new ReloadableResourceBundleMessageSource();
        bundleMessageSource.setBasename("classpath:messages");
        bundleMessageSource.setDefaultEncoding("UTF-8");
        bundleMessageSource.setCacheSeconds(3600);
        return bundleMessageSource;
    }

    /**
     * TODO http服务接入线程池配置
     * <p>
     * @version 1.0.0,2017年5月9日
     * @author zhengzhangwen
     * @since 1.0.0
     */
    @Configuration
    @EnableConfigurationProperties(WebTaskExecutorPropertiesConfiguration.class)
    public class WebTaskExecutorConfiguration {

        @Autowired
        private WebTaskExecutorPropertiesConfiguration webTaskExecutorPropertiesConfiguration;

        @Bean(name = "webTaskExecutor")
        public ThreadPoolTaskExecutor webTaskExecutor() {
            ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
            taskExecutor.setCorePoolSize(webTaskExecutorPropertiesConfiguration.getCorePoolSize());
            taskExecutor.setKeepAliveSeconds(webTaskExecutorPropertiesConfiguration.getKeepAliveSeconds());
            taskExecutor.setMaxPoolSize(webTaskExecutorPropertiesConfiguration.getMaxPoolSize());
            taskExecutor.setQueueCapacity(webTaskExecutorPropertiesConfiguration.getQueueCapacity());
            taskExecutor.setAllowCoreThreadTimeOut(webTaskExecutorPropertiesConfiguration.getAllowCoreThreadTimeout());
            taskExecutor.setAwaitTerminationSeconds(webTaskExecutorPropertiesConfiguration.getAwaitTerminationSeconds());
            taskExecutor.setWaitForTasksToCompleteOnShutdown(webTaskExecutorPropertiesConfiguration.getWaitForTaskToCompleteOnShutdown());
            taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
            return taskExecutor;
        }
    }

    @ConfigurationProperties(prefix = "web.threadpool")
    public class WebTaskExecutorPropertiesConfiguration {

        private int corePoolSize;

        private int keepAliveSeconds;

        private int maxPoolSize;

        private int queueCapacity;

        private boolean allowCoreThreadTimeout;

        private int awaitTerminationSeconds;

        private boolean waitForTaskToCompleteOnShutdown;

        public int getCorePoolSize() {
            return corePoolSize;
        }

        public void setCorePoolSize(int corePoolSize) {
            this.corePoolSize = corePoolSize;
        }

        public int getKeepAliveSeconds() {
            return keepAliveSeconds;
        }

        public void setKeepAliveSeconds(int keepAliveSeconds) {
            this.keepAliveSeconds = keepAliveSeconds;
        }

        public int getMaxPoolSize() {
            return maxPoolSize;
        }

        public void setMaxPoolSize(int maxPoolSize) {
            this.maxPoolSize = maxPoolSize;
        }

        public int getQueueCapacity() {
            return queueCapacity;
        }

        public void setQueueCapacity(int queueCapacity) {
            this.queueCapacity = queueCapacity;
        }

        public boolean getAllowCoreThreadTimeout() {
            return allowCoreThreadTimeout;
        }

        public void setAllowCoreThreadTimeout(boolean allowCoreThreadTimeout) {
            this.allowCoreThreadTimeout = allowCoreThreadTimeout;
        }

        public int getAwaitTerminationSeconds() {
            return awaitTerminationSeconds;
        }

        public void setAwaitTerminationSeconds(int awaitTerminationSeconds) {
            this.awaitTerminationSeconds = awaitTerminationSeconds;
        }

        public boolean getWaitForTaskToCompleteOnShutdown() {
            return waitForTaskToCompleteOnShutdown;
        }

        public void setWaitForTaskToCompleteOnShutdown(boolean waitForTaskToCompleteOnShutdown) {
            this.waitForTaskToCompleteOnShutdown = waitForTaskToCompleteOnShutdown;
        }

        @Override
        public String toString() {
            return "WebTaskExecutorPropertiesConfiguration [corePoolSize=" + corePoolSize + ", keepAliveSeconds=" + keepAliveSeconds
                + ", maxPoolSize=" + maxPoolSize + ", queueCapacity=" + queueCapacity + ", allowCoreThreadTimeout=" + allowCoreThreadTimeout
                + ", awaitTerminationSeconds=" + awaitTerminationSeconds + ", waitForTaskToCompleteOnShutdown=" + waitForTaskToCompleteOnShutdown
                + "]";
        }
    }
}
