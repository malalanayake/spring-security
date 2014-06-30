package spring.security.custom.rest.api.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * This class is provide the user details which is needed for authentication
 * 
 * @author malalanayake
 * 
 */
public class CustomUserData implements UserDetails {
	Collection<? extends GrantedAuthority> list = null;
	String userName = null;
	String password = null;
	boolean status = false;

	public CustomUserData() {
		list = new ArrayList<GrantedAuthority>();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.list;
	}

	public void setAuthorities(Collection<? extends GrantedAuthority> roles) {
		this.list = roles;
	}

	public void setAuthentication(boolean status) {
		this.status = status;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
