package domain;

import java.util.List;

public class PrecricaoMedicamento {
    
    private Integer codigo;

    private Consulta consulta;

    private String periodo;

    private String quantidade_dia;

    public PrecricaoMedicamento() {
    }

    public PrecricaoMedicamento(Integer codigo, Consulta consulta, String periodo, String quantidade_dia) {
        this.codigo = codigo;
        this.consulta = consulta;
        this.periodo = periodo;
        this.quantidade_dia = quantidade_dia;
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getQuantidade_dia() {
        return quantidade_dia;
    }

    public void setQuantidade_dia(String quantidade_dia) {
        this.quantidade_dia = quantidade_dia;
    }

    @Override
    public String toString() {
        return "PrecricaoMedicamento [codigo=" + codigo + ", consulta=" + consulta + ", periodo=" + periodo
                + ", quantidade_dia=" + quantidade_dia + "]";
    }

    
}
