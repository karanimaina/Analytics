package com.example.abalytics.config;
@EnableWebSecurity
@Configuration
@ComponentScan(basePackages={"com.litemore.z_analytics_v2.security"})
public class AppSecurity extends  WebSecurity {
    @Autowired
    private UserDetails
            Service;

            userDetailsService;



    @Autowired
    private RestUnauthorizedEntryPoint entryPoint

}
