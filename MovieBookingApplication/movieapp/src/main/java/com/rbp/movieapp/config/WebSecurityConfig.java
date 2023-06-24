//package com.rbp.movieapp.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//import com.rbp.movieapp.security.jwt.AuthEntryPointJwt;
//import com.rbp.movieapp.security.jwt.AuthTokenFilter;
//import com.rbp.movieapp.security.jwt.JwtUtils;
//import com.rbp.movieapp.security.services.MovieService;
//import com.rbp.movieapp.security.services.UserDetailsImpl;
//import com.rbp.movieapp.security.services.UserDetailsServiceImpl;
//
//@Configuration
//@EnableWebSecurity
//@EnableWebMvc
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private MovieService movieService;
//	
//	@Autowired
//	private UserDetailsImpl userDetailsImpl;
//	
//	@Autowired
//	private UserDetailsServiceImpl uesrDetailsServiceImpl;
//	
//	
//	@Autowired
//	private AuthEntryPointJwt authEntryPointJwt;
//	
//	
//	@Autowired
//	private AuthTokenFilter authTokenFilter;
//	
//	
//	@Autowired
//	private JwtUtils jwtUtils;
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception{
//		http
//		 
//		    .csrf().disable()
//		    .authorizeHttpRequests()
//		    .antMatchers(HttpMethod.GET).permitAll()
//		    .antMatchers(HttpMethod.POST).permitAll()
//		    .antMatchers(HttpMethod.PUT).permitAll()
//		    .antMatchers(HttpMethod.DELETE).permitAll()
//		    .antMatchers("/api/v1.0/moviebooking/**").permitAll()
//		    .antMatchers("/v3/api-docs").permitAll()
//		    .anyRequest()
//		    .authenticated()
//		    .and()
//		    .httpBasic();
//		    
//	}
//	
//}
//
