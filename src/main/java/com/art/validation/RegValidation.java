package com.art.validation;

import com.art.classWrapper.Registration;
import com.art.dao.UserDAO;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class RegValidation implements Validator {
    @Autowired
    private UserDAO userDAO;

    @Override
    public boolean supports(Class<?> clazz) {
        return Registration.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Registration registration = (Registration) target;

        if (registration.getLogin().isEmpty()) {
            errors.rejectValue("login", "RegForm.login.empty");
        } else if (registration.getLogin().length() < 3) {
            errors.rejectValue("login", "RegForm.login.MinSize");
        } else if (registration.getLogin().length() > 10) {
            errors.rejectValue("login", "RegForm.login.MaxSize");
        } else if (userDAO.findByLogin(registration.getLogin()) != null) {
            errors.rejectValue("login", "RegForm.login.Duplication");
        }

        if (registration.getEmail().isEmpty()) {
            errors.rejectValue("email", "RegForm.email.empty");
        } else if (!EmailValidator.getInstance().isValid(registration.getEmail())) {
            errors.rejectValue("email", "RegForm.email.Incorrect");
        } else if (userDAO.findByEmail(registration.getEmail()) != null) {
            errors.rejectValue("email", "RegForm.email.Duplication");
        }

        if (registration.getPassword().isEmpty()) {
            errors.rejectValue("password", "RegForm.password.empty");
        } else if (registration.getPassword().length() < 6) {
            errors.rejectValue("password", "RegForm.password.MinSize");
        } else if (registration.getPassword().length() > 10) {
            errors.rejectValue("password", "RegForm.password.MaxSize");
        }
    }
}
