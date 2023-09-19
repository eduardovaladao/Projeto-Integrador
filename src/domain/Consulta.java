package domain;

import java.sql.Time;
import java.util.Date;

public class Consulta {
    
    private Integer codigo;
    
    private Paciente paciente;

    private Medico medico;

    private Recepcionista recepcionista;

    private String local;

    private Date data_realizacao;

    private Time horario_realizacao;

    public Consulta() {
    }

    public Consulta(Integer codigo, Paciente paciente, Medico medico, Recepcionista recepcionista, String local,
            Date data_realizacao, Time horario_realizacao) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.medico = medico;
        this.recepcionista = recepcionista;
        this.local = local;
        this.data_realizacao = data_realizacao;
        this.horario_realizacao = horario_realizacao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getData_realizacao() {
        return data_realizacao;
    }

    public void setData_realizacao(Date data_realizacao) {
        this.data_realizacao = data_realizacao;
    }

    public Time getHorario_realizacao() {
        return horario_realizacao;
    }

    public void setHorario_realizacao(Time horario_realizacao) {
        this.horario_realizacao = horario_realizacao;
    }

    @Override
    public String toString() {
        return "Consulta [codigo=" + codigo + ", paciente=" + paciente + ", medico=" + medico + ", recepcionista="
                + recepcionista + ", local=" + local + ", data_realizacao=" + data_realizacao + ", horario_realizacao="
                + horario_realizacao + "]";
    }


}
