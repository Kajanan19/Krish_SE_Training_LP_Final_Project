package com.kajanan.inventorygatewayserver.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig {

  /**
   * Fix CORS error in docker Need to add properties along with this bean to
   * completely fix CORS
   */
  // @Bean
  // public CorsFilter corsFilter() {
  //   final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
  //   final CorsConfiguration config = new CorsConfiguration();
  //   config.setAllowCredentials(true);
  //   config.addAllowedOrigin("*");
  //   config.addAllowedHeader("*");
  //   config.addAllowedMethod("*");
  //   source.registerCorsConfiguration("*", config);
  //   return new CorsFilter(source);
  // }

}
