package domain;

public class Exame {
    
    private Integer codigo;

    private String tipo;

    private String nome;

    private String descricao;

    public Exame() {
    }

    public Exame(Integer codigo, String tipo, String nome, String descricao) {
        this.codigo = codigo;
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

    @Override
    public String toString() {
        return "Exame [codigo=" + codigo + ", tipo=" + tipo + ", nome=" + nome + ", descricao=" + descricao + "]";
    }

    
}
