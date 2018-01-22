package hello.storage;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import hello.Validation.*;

@PasswordMatches
public class UserDto {
		
	    @NotNull
	    @NotEmpty
	    private String firstName;
	    
	    public String getfirstName()
	    {
	    	return this.firstName;
	    }
	    public void setfirstName(String firstName)
	    {
	    	this.firstName = firstName;
	    }
	     
	    @NotNull
	    @NotEmpty
	    private String lastName;
	    public String getlastName()
	    {
	    	return this.lastName;
	    }
	    public void setlastName(String lastName)
	    {
	    	this.lastName = lastName;
	    } 
	    @NotNull
	    @NotEmpty
	    private String password;
	    private String matchingPassword;
	    
	    @Email
	    @NotNull
	    @NotEmpty
	    private String email;
	    public String getemail()
	    {
	    	return this.email;
	    }
	    public void setemail(String email)
	    {
	    	this.email = email;
	    }
	    
	    
	    public String getPassword()
	    {
	    	return this.password;
	    }
	    public void setPassword(String password)
	    {
	    	this.password = password;
	    }
	    public String getMatchingPassword()
	    {
	    	return this.matchingPassword;
	    }
	    public void setMatchingPassword(String matchingPassword)
	    {
	    	this.matchingPassword = matchingPassword;
	    }
	    // standard getters and setters
	
}
