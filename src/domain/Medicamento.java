package domain;

public class Medicamento {
    
    private Integer codigo;

    private String tipo;

    private String nome;

    private String descricao;

    public Medicamento() {
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

    @Override
    public String toString() {
        return "Medicamento [codigo=" + codigo + ", tipo=" + tipo + ", nome=" + nome + ", descricao=" + descricao + "]";
    }

    
}
