//package com.capgemini.pts.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpHeaders;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.capgemini.pts.service.UserDetailsServiceImpl;
//
//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class WebSecurityConfiguration{
//	
//	@Autowired
//	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
//	
//	@Autowired
//	private JwtRequestFilter jwtRequestFilter;
//	
//	@Autowired
//	private UserDetailsServiceImpl userDetailsService;
//	
//	@Bean
//	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception{
//		return authConfig.getAuthenticationManager();
//	}
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//		http.cors().and().csrf().disable()
//        .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and()
//        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
//        .authorizeRequests().antMatchers("").permitAll()
//        .antMatchers(HttpHeaders.ALLOW).permitAll()
//        .anyRequest().authenticated();
//    
//    http.authenticationProvider(authenticationProvider());
//
//    http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
//    
//    return http.build();
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//		
//		authProvider.setUserDetailsService(userDetailsService);
//		authProvider.setPasswordEncoder(passwordEncoder());
//		
//		return authProvider;
//	}
//
//}
