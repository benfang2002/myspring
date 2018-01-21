package hello.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import hello.storage.UserDto;

public class PasswordMatchesValidator 
implements ConstraintValidator<PasswordMatches, Object> { 
   
  @Override
  public void initialize(PasswordMatches constraintAnnotation) {       
  }
  @Override
  public boolean isValid(Object obj, ConstraintValidatorContext context){   
      UserDto user = (UserDto) obj;
      return user.getpassword().equals(user.getmatchingpassword());    
  }
     
}
