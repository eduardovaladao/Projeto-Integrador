package domain;

import java.util.List;

public class PrescricaoMedicamento {
    
    private Integer codigo;

    private String periodo;

    private String quantidade_dia;

    private Consulta consulta;

    private List<Medicamento> medicamentos;

    public PrescricaoMedicamento(Integer codigo, String periodo, String quantidade_dia, Consulta consulta,
            List<Medicamento> medicamentos) {
        this.codigo = codigo;
        this.periodo = periodo;
        this.quantidade_dia = quantidade_dia;
        this.consulta = consulta;
        this.medicamentos = medicamentos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        return "PrescricaoMedicamento [codigo=" + codigo + ", periodo=" + periodo + ", quantidade_dia=" + quantidade_dia
                + ", consulta=" + consulta + ", medicamentos=" + medicamentos + "]";
    }

    
}
