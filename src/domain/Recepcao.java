package domain;

import java.sql.Time;

public class Recepcao {

    private Integer codigo;

    private String telefone;

    private Time hora_funcionamento;

    public Recepcao() {
    }

    public Recepcao(Integer codigo, String telefone, Time hora_funcionamento) {
        this.codigo = codigo;
        this.telefone = telefone;
        this.hora_funcionamento = hora_funcionamento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Time gethora_funcionamento() {
        return hora_funcionamento;
    }

    public void sethora_funcionamento(Time hora_funcionamento) {
        this.hora_funcionamento = hora_funcionamento;
    }

    @Override
    public String toString() {
        return "Recepcao [codigo=" + codigo + ", telefone=" + telefone + ", hora_funcionamento=" + hora_funcionamento
                + "]";
    }

    

}