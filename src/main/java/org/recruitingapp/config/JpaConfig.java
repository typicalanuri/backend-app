package org.recruitingapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages ="org.recruitingapp.repository")
public class JpaConfig {
}
