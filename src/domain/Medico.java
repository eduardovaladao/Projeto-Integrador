package domain;

import java.util.Date;
import java.util.List;

public class Medico extends Pessoa {

    private String rg;

    private Date data_nascimento;

    private String crm;

    private String especialidade;

    private List<Consulta> consultas;

    public Medico(String rg, Date data_nascimento, String crm, String especialidade, List<Consulta> consultas) {
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.crm = crm;
        this.especialidade = especialidade;
        this.consultas = consultas;
    }

    public Medico(Integer codigo, String nome, String cpf, Character sexo, String rg, Date data_nascimento, String crm,
            String especialidade, List<Consulta> consultas) {
        super(codigo, nome, cpf, sexo);
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.crm = crm;
        this.especialidade = especialidade;
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

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Medico [rg=" + rg + ", data_nascimento=" + data_nascimento + ", crm=" + crm
                + ", especialidade="
                + especialidade + ", consultas=" + consultas + "]";
    }

    public Boolean confirmarPresenca(Date data, Time horario){
        Boolean r = true;
        Date var_data = consulta.getData_realizacao();
        Time var_horario = consulta.getHorario_realizacao();
        for (Consulta consulta : consultas) {
            if(var_data == data && var_horario == horario){
                r = false;
                break;
            }
        }
        return r;
    }
}