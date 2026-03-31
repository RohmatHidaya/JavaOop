package aselole;

import java.util.List;

public class Register {

    public UserValidator validator;

    public Register(UserValidator validator) {
        this.validator = validator;
    }

    public void register(RegisterUserRequest request) {
        List<String> errors = validator.validate(request);

        if (!errors.isEmpty()) {
            throw new ValidasiSalah(errors);
        }
    }
}
