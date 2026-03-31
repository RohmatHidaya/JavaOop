package aselole;

import java.util.List;

public class ValidasiSalah extends RuntimeException {
    private List<String> errors;

    public ValidasiSalah(List<String> errors) {
        this.errors = errors;
    }

    public List<String> GetErrors() {
        return errors;
    }
}
