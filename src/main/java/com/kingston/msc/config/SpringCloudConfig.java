package com.kingston.msc.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Sandaka Wijesinghe.
 * Date: 10/18/21
 */

@Configuration
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


    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/cps/**")
                        .filters(f -> f.hystrix(h -> h.setName("Hystrix")
                                //.setFallbackUri("forward:/fallback/message")
                        ))
                        .uri("lb://COURSE-PROVIDER-SERVICE")
                        .id("courseProviderModule"))

                .route(r -> r.path("/sts/**")
                        .filters(f -> f.hystrix(h -> h.setName("Hystrix")
                                //.setFallbackUri("forward:/fallback/message")
                        ))
                        .uri("lb://STUDENT-SERVICE")
                        .id("studentModule"))

                .route(r -> r.path("/sms/**")
                        .filters(f -> f.hystrix(h -> h.setName("Hystrix")
                                //.setFallbackUri("forward:/fallback/message")
                        ))
                        .uri("lb://SUBSCRIPTION-MANAGEMENT-SERVICE")
                        .id("smsModule"))
                .build();

    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(AppConstants.STUDENT_SERVICE_KEY,
//                        r -> r.path("/consumer/**")
//                                .filters(f -> f.stripPrefix(2)).uri("lb://STUDENT-SERVICE"))
//                .route(AppConstants.COURSE_PROVIDER_SERVICE_KEY,
//                        r -> r.path("/employee/**")
//                                .filters(f -> f.stripPrefix(2)).uri("lb://COURSE-PROVIDER-SERVICE"))
//                .build();
//    }

}
