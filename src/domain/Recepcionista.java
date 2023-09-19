package domain;

public class Recepcionista extends Pessoa {
    
    private String email;

    private String telefone;

    public Recepcionista() {
    }

    public Recepcionista(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public Recepcionista(Integer codigo, String nome, String cpf, Character sexo, String email, String telefone) {
        super(codigo, nome, cpf, sexo);
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Recepcionista [email=" + email + ", telefone=" + telefone + "]";
    }

    
}
