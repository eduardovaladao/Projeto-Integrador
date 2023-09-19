package domain;

import java.util.Date;

public class Medico extends Pessoa {
    
    private String rg;

    private Date data_nascimento;

    private String crm;

    private String epecialidade;

    public Medico() {
    }

    public Medico(String rg, Date data_nascimento, String crm, String epecialidade) {
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.crm = crm;
        this.epecialidade = epecialidade;
    }

    public Medico(Integer codigo, String nome, String cpf, Character sexo, String rg, Date data_nascimento, String crm,
            String epecialidade) {
        super(codigo, nome, cpf, sexo);
        this.rg = rg;
        this.data_nascimento = data_nascimento;
        this.crm = crm;
        this.epecialidade = epecialidade;
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

    public String getEpecialidade() {
        return epecialidade;
    }

    public void setEpecialidade(String epecialidade) {
        this.epecialidade = epecialidade;
    }

    @Override
    public String toString() {
        return "Medico [rg=" + rg + ", data_nascimento=" + data_nascimento + ", crm=" + crm + ", epecialidade="
                + epecialidade + "]";
    }

    

}
