package domain;

import java.util.List;

public class Recepcionista extends Pessoa {
    
    private String email;

    private String telefone;

    private Recepcao recepcao;

    private List<Consulta> consultas;

    public Recepcionista(String email, String telefone, Recepcao recepcao, List<Consulta> consultas) {
        this.email = email;
        this.telefone = telefone;
        this.recepcao = recepcao;
        this.consultas = consultas;
    }

    public Recepcionista(Integer codigo, String nome, String cpf, Character sexo, String email, String telefone,
            Recepcao recepcao, List<Consulta> consultas) {
        super(codigo, nome, cpf, sexo);
        this.email = email;
        this.telefone = telefone;
        this.recepcao = recepcao;
        this.consultas = consultas;
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

    public Recepcao getRecepcao() {
        return recepcao;
    }

    public void setRecepcao(Recepcao recepcao) {
        this.recepcao = recepcao;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Recepcionista [email=" + email + ", telefone=" + telefone + ", recepcao=" + recepcao + ", consultas="
                + consultas + "]";
    }

    
}
