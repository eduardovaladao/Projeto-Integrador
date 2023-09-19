package domain;

import java.util.Date;

public class Medico extends Pessoa {
    
    private String rg;

    private Date data_nascimento;

    private String crm;

    private String especialidade;

    public Medico() {
    }

    public Medico(String rg, Date data_nascimento, String crm, String especialidade) {
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Medico(Integer codigo, String nome, String cpf, Character sexo, String rg, Date data_nascimento, String crm,
            String especialidade) {
        super(codigo, nome, cpf, sexo);
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.crm = crm;
        this.especialidade = especialidade;
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

    public String getespecialidade() {
        return especialidade;
    }

    public void setespecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico [rg=" + rg + ", data_nascimento=" + data_nascimento + ", crm=" + crm + ", especialidade="
                + especialidade + "]";
    }

    

}
