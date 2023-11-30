package domain;

import java.sql.Time;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Paciente extends Pessoa {

    private String rg;

    private Date data_nascimento;

    private String telefone;

    private String email;

    private List<Consulta> consultas;

    public Paciente(String rg, Date data_nascimento, String telefone, String email, List<Consulta> consultas) {
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
        this.email = email;
        this.consultas = consultas;
    }

    public Paciente(Integer codigo, String nome, String cpf, Character sexo, String rg, Date data_nascimento,
            String telefone, String email, List<Consulta> consultas) {
        super(codigo, nome, cpf, sexo);
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
        this.email = email;
        this.consultas = consultas;
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

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Paciente [" + super.toString() + "rg=" + rg + ", data_nascimento=" + data_nascimento + ", telefone=" + telefone + ", email="
                + email + ", consultas=" + consultas + "]";
    }

    public void reservarConsulta(Medico medico, Date data, Time horario){
        Boolean confirmacao = medico.confirmarPresenca(data, horario);
        if(confirmacao == true){
            Consulta consulta = new Consulta(1, "Sala 111", data, horario, this, medico, null, null, null);
            this.setConsultas(Arrays.asList(consulta));
            System.out.println("Sucesso! " + data + " " + horario);
        } else {
            System.err.println("Desculpe, algo deu errado! Tente mudar o horário ou a data.");
        }
    }
    
}
