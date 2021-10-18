package com.kingston.msc.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Sandaka Wijesinghe.
 * Date: 10/18/21
 */

//@Configuration
public class SpringCloudConfig {

    /*@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/employee/**").uri("lb://COURSE-PROVIDER-SERVICE"))

                .route(r -> r.path("/consumer/**")
                        .uri("lb://STUDENT-SERVICE")
                        )
                .build();
    }*/
}
