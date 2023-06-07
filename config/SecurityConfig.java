package org.jbdev.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.jbdev.proxy", "org.jbdev.repositories", "org.jbdev.services"})
public class SecurityConfig {
}
