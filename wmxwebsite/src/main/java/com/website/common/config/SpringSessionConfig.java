package com.website.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(prefix = "website", name = "spring-session-open", havingValue = "true")
public class SpringSessionConfig {

}
