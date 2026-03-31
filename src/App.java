import aselole.Register;
import aselole.RegisterUserRequest;
import aselole.UserValidator;
import aselole.ValidasiSalah;

public class App {
    public static void main(String[] args) throws Exception {
        UserValidator userValidator = new UserValidator();
        Register register = new Register(userValidator);

        RegisterUserRequest request = new RegisterUserRequest();
        request.setUsername("");
        request.setPassword("");

        try {
            register.register(request);
        } catch (ValidasiSalah e) {
            System.out.println(e.GetErrors());
        }
    }
}
