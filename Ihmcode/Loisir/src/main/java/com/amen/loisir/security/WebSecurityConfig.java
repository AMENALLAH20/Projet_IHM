package com.amen.loisir.security;



import com.amen.loisir.security.Jwt.AuthEntryPointJwt;
import com.amen.loisir.security.Jwt.AuthTokenFilter;
import com.amen.loisir.security.Services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.web.server.SecurityWebFiltersOrder;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.server.authorization.AuthorizationWebFilter;
import org.springframework.security.web.server.util.matcher.ServerWebExchangeMatcher;
import org.springframework.web.server.ServerWebExchange;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        // securedEnabled = true,
        // jsr250Enabled = true,
        prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserDetailsServiceImpl userDetailsService;
    @Autowired
    private AuthEntryPointJwt unauthorizedHandler;
    @Bean
    public AuthTokenFilter authenticationJwtTokenFilter() {
        return new AuthTokenFilter();
    }
    @Override
    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
                .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .authorizeRequests()
                .antMatchers("/activity/add").permitAll()  // Permet l'accès sans authentification
                .antMatchers("/activity/sport").permitAll()
                .antMatchers("/activity/restaurant").permitAll()  // Permet l'accès sans authentification
                .antMatchers("/auth/**").permitAll()  // Permet l'accès sans authentification
                .antMatchers("/role/add**").permitAll()
                .antMatchers("/signup**").permitAll()
                .antMatchers("/signin**").permitAll()
                .antMatchers("/resetPassword").permitAll()
                .antMatchers("/api/test/**").permitAll()
                .antMatchers("/reservation/**").permitAll()  // Nécessite une authentification pour la réservation
                .anyRequest().authenticated();  // Toutes les autres requêtes nécessitent une authentification

        http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    }

}
