package domain;

public class Medicamento {
    
    private Integer codigo;

    private String tipo;

    private String nome;

    private String descricao;

    private PrescricaoMedicamento prescricao;

    public Medicamento(Integer codigo, String tipo, String nome, String descricao, PrescricaoMedicamento prescricao) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
        this.prescricao = prescricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PrescricaoMedicamento getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(PrescricaoMedicamento prescricao) {
        this.prescricao = prescricao;
    }

    @Override
    public String toString() {
        return "Medicamento [codigo=" + codigo + ", tipo=" + tipo + ", nome=" + nome + ", descricao=" + descricao
                + ", prescricao=" + prescricao + "]";
    }

    
}
