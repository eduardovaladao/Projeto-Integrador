package domain;

public class Medicamento {
    
    private Integer codigo;

    private PrecricaoMedicamento prescricao;

    private String tipo;

    private String nome;

    private String descricao;

    public Medicamento() {
    }

    public Medicamento(Integer codigo, PrecricaoMedicamento prescricao, String tipo, String nome, String descricao) {
        this.codigo = codigo;
        this.prescricao = prescricao;
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
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

    
    public PrecricaoMedicamento getPrescricao() {
        return prescricao;
    }



    public void setPrescricao(PrecricaoMedicamento prescricao) {
        this.prescricao = prescricao;
    }

    @Override
    public String toString() {
        return "Medicamento [codigo=" + codigo + ", prescricao=" + prescricao + ", tipo=" + tipo + ", nome=" + nome
                + ", descricao=" + descricao + "]";
    }

    
}
