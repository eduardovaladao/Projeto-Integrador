package domain;

import java.sql.Time;
import java.util.List;

public class Recepcao {

    private Integer codigo;

    private String telefone;

    private Time hora_funcionamento;

    private List<Recepcionista> recepcionistas;

    public Recepcao(Integer codigo, String telefone, Time hora_funcionamento, List<Recepcionista> recepcionistas) {
        this.codigo = codigo;
        this.telefone = telefone;
        this.hora_funcionamento = hora_funcionamento;
        this.recepcionistas = recepcionistas;
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

    public Time getHora_funcionamento() {
        return hora_funcionamento;
    }

    public void setHora_funcionamento(Time hora_funcionamento) {
        this.hora_funcionamento = hora_funcionamento;
    }

    public List<Recepcionista> getRecepcionistas() {
        return recepcionistas;
    }

    public void setRecepcionistas(List<Recepcionista> recepcionistas) {
        this.recepcionistas = recepcionistas;
    }

    @Override
    public String toString() {
        return "Recepcao [codigo=" + codigo + ", telefone=" + telefone + ", hora_funcionamento=" + hora_funcionamento
                + ", recepcionistas=" + recepcionistas + "]";
    }


}