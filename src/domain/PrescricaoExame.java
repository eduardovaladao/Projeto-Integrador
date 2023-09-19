package domain;

import java.util.Date;
import java.util.List;
import java.sql.Time;

public class PrescricaoExame {
    
    private Integer codigo;
    
    private Time duracao;

    private Date data_realizacao;

    private String local;

    private Consulta consulta;

    private List<Exame> exames;

    public PrescricaoExame(Integer codigo, Time duracao, Date data_realizacao, String local, Consulta consulta,
            List<Exame> exames) {
        this.codigo = codigo;
        this.duracao = duracao;
        this.data_realizacao = data_realizacao;
        this.local = local;
        this.consulta = consulta;
        this.exames = exames;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public Date getData_realizacao() {
        return data_realizacao;
    }

    public void setData_realizacao(Date data_realizacao) {
        this.data_realizacao = data_realizacao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    @Override
    public String toString() {
        return "PrescricaoExame [codigo=" + codigo + ", duracao=" + duracao + ", data_realizacao=" + data_realizacao
                + ", local=" + local + ", consulta=" + consulta + ", exames=" + exames + "]";
    }
    
    
}
