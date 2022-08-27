//package com.kingston.msc.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.cors.CorsConfigurationSource;
//
///**
// * Created by Sandaka Wijesinghe.
// * Date: 8/21/22
// */
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http.cors().and().csrf().disable();
//    }
//
//    @Bean
//    CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Arrays.asList("*"));
//        configuration.setAllowedMethods(Arrays.asList("*"));
//        configuration.setAllowedHeaders(Arrays.asList("*"));
//        configuration.setAllowCredentials(true);
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }
//
//}
