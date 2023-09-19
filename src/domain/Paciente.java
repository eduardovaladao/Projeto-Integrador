package domain;

import java.util.Date;

public class Paciente extends Pessoa {
    
    private String rg;

    private Date data_nascimento;

    private String telefone;

    private String email;

    public Paciente() {
    }

    public Paciente(String rg, Date data_nascimento, String telefone, String email) {
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
        this.email = email;
    }

    public Paciente(Integer codigo, String nome, String cpf, Character sexo, String rg, Date data_nascimento,
            String telefone, String email) {
        super(codigo, nome, cpf, sexo);
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Paciente [rg=" + rg + ", data_nascimento=" + data_nascimento + ", telefone=" + telefone + ", email="
                + email + "]";
    }

    
}
