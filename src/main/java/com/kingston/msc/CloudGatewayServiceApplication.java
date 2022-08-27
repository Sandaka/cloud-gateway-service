package com.kingston.msc;

import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class CloudGatewayServiceApplication {

    @Value("learngenix.ui.url")
    private String uiEndpoint;



//    @Autowired
//    private RedisHashComponent redisHashComponent;
//
//    @PostConstruct
//    public void initKeysToRedis() {
//        List<ApiKey> apiKeys = new ArrayList<>();
//        apiKeys.add(new ApiKey("343C-ED0B-4137-B27E", Stream.of(AppConstants.STUDENT_SERVICE_KEY,
//                AppConstants.COURSE_PROVIDER_SERVICE_KEY).collect(Collectors.toList())));
//        apiKeys.add(new ApiKey("FA48-EF0C-427E-8CCF", Stream.of(AppConstants.COURSE_PROVIDER_SERVICE_KEY)
//                .collect(Collectors.toList())));
//        List<Object> lists = redisHashComponent.hValues(AppConstants.RECORD_KEY);
//        if (lists.isEmpty()) {
//            apiKeys.forEach(k -> redisHashComponent.hSet(AppConstants.RECORD_KEY, k.getKey(), k));
//        }
//    }


//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(AppConstants.STUDENT_SERVICE_KEY,
//                        r -> r.path("/api/student-service/**")
//                                .filters(f -> f.stripPrefix(2)).uri("http://localhost:8081"))
//                .route(AppConstants.COURSE_PROVIDER_SERVICE_KEY,
//                        r -> r.path("/api/course-service/**")
//                                .filters(f -> f.stripPrefix(2)).uri("http://localhost:8082"))
//                .build();
//    }

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayServiceApplication.class, args);
    }

//    @Bean
//    public CorsFilter corsFilter() {
//
//        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.setAllowCredentials(true);
//        corsConfiguration.setAllowedOrigins(List.of(uiEndpoint));
//
//        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
//                "Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
//                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
//
//        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Jwt-Token", "Authorization",
//                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "File-Name"));
//
//        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
//
//        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//
//        return new CorsFilter(urlBasedCorsConfigurationSource);
//    }


}
