package domain;

import java.util.Date;
import java.sql.Time;

public class PrescricaoExame {
    
    private Integer codigo;

    private Consulta consulta;

    private Time duracao;

    private Date data_realizacao;

    private String local;

    public PrescricaoExame() {
    }

    public PrescricaoExame(Integer codigo, Consulta consulta, Time duracao, Date data_realizacao, String local) {
        this.codigo = codigo;
        this.consulta = consulta;
        this.duracao = duracao;
        this.data_realizacao = data_realizacao;
        this.local = local;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
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

    @Override
    public String toString() {
        return "PrescricaoExame [codigo=" + codigo + ", consulta=" + consulta + ", duracao=" + duracao
                + ", data_realizacao=" + data_realizacao + ", local=" + local + "]";
    }

    
}
