package org.jbdev.config;

import org.jbdev.aspect.InvoiceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"org.jbdev.proxy",
                                "org.jbdev.repositories",
                                "org.jbdev.services"})
public class SecurityConfig {

    @Bean
    public InvoiceAspect aspect() {
        return new InvoiceAspect();
    }
}
