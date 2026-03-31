package aselole;

import java.util.ArrayList;
import java.util.List;

public class UserValidator {
    public void test() {
        System.out.println("test");
    }

    public List<String> validate(RegisterUserRequest request) {

        List<String> errors = new ArrayList<>();

        if (request.getUsername() == null || request.getUsername().isEmpty()) {
            errors.add("Username tidak boleh kosong");
        }

        if (request.getPassword() == null || request.getPassword().isEmpty()) {
            errors.add("Password tidak boleh kosong");
        }

        return errors;
    }
}
