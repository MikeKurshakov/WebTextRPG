package com.art.validation;

import com.art.classWrapper.SignIn;
import com.art.dao.UserDAO;
import com.art.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SignInValidation implements Validator {

    @Autowired
    private UserDAO userDAO;

    @Override
    public boolean supports(Class<?> clazz) {
        return SignIn.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SignIn signIn = (SignIn) target;

        if (signIn.getLogin().isEmpty()) {
            errors.rejectValue("login", "UserForm.login.empty");
        } else if (signIn.getLogin().length() > 10) {
            errors.rejectValue("login", "UserForm.login.MaxSize");
        } else if (signIn.getLogin().length() < 3) {
            errors.rejectValue("login", "UserForm.login.MinSize");
        } else if (userDAO.findByLogin(signIn.getLogin()) == null) {
            errors.rejectValue("login", "UserForm.login.not");
        }

        if (signIn.getPassword().isEmpty()) {
            errors.rejectValue("password", "UserForm.password.empty");
        } else if (signIn.getPassword().length() > 10) {
            errors.rejectValue("password", "UserForm.password.MaxSize");
        } else if (signIn.getPassword().length() < 6) {
            errors.rejectValue("password", "UserForm.password.MinSize");
        } else if (userDAO.findByLogin(signIn.getLogin()) != null) {
            User bylogin = userDAO.findByLogin(signIn.getLogin());
            if (!bylogin.getPassword().equals(signIn.getPassword())) {
                errors.rejectValue("password", "UserForm.password.Incorrect");
            }
        }
    }
}
