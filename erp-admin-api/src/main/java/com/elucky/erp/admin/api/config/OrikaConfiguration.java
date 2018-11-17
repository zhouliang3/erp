package com.elucky.erp.admin.api.config;

import com.elucky.erp.admin.api.utils.OrikaBeanMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class OrikaConfiguration {

    public OrikaConfiguration() {
    }

    @Bean
    public OrikaBeanMapper beanMapper() {
        return new OrikaBeanMapper();
    }

}
