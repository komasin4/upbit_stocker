package komasin4.finance.upbit.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		  .authorizeRequests()
		  .antMatchers("*").permitAll();
//        .authorizeRequests()
//            .antMatchers("/test").permitAll()
//            .antMatchers("/admin").hasRole("ADMIN")
//            .anyRequest().authenticated()
//            .and()
//        .formLogin()
//            .defaultSuccessUrl("/main")
//            .permitAll()
//            .and()
//        .logout();
	}
}
