package domain;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Consulta {
    
    private Integer codigo;

    private String local;

    private Date data_realizacao;

    private Time horario_realizacao;

    private Paciente paciente;

    private Medico medico;

    private Recepcionista recepcionista;

    private List<PrescricaoExame> prescricoes_exames;

    private List<PrescricaoMedicamento> prescricoes_medicamento;

    public Consulta(Integer codigo, String local, Date data_realizacao, Time horario_realizacao, Paciente paciente,
            Medico medico, Recepcionista recepcionista, List<PrescricaoExame> prescricoes_exames,
            List<PrescricaoMedicamento> prescricoes_medicamento) {
        this.codigo = codigo;
        this.local = local;
        this.data_realizacao = data_realizacao;
        this.horario_realizacao = horario_realizacao;
        this.paciente = paciente;
        this.medico = medico;
        this.recepcionista = recepcionista;
        this.prescricoes_exames = prescricoes_exames;
        this.prescricoes_medicamento = prescricoes_medicamento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public List<PrescricaoExame> getPrescricoes_exames() {
        return prescricoes_exames;
    }

    public void setPrescricoes_exames(List<PrescricaoExame> prescricoes_exames) {
        this.prescricoes_exames = prescricoes_exames;
    }

    public List<PrescricaoMedicamento> getPrescricoes_medicamento() {
        return prescricoes_medicamento;
    }

    public void setPrescricoes_medicamento(List<PrescricaoMedicamento> prescricoes_medicamento) {
        this.prescricoes_medicamento = prescricoes_medicamento;
    }

    @Override
    public String toString() {
        return "Consulta [codigo=" + codigo + ", local=" + local + ", data_realizacao=" + data_realizacao
                + ", horario_realizacao=" + horario_realizacao + ", paciente=" + paciente + ", medico=" + medico
                + ", recepcionista=" + recepcionista + ", prescricoes_exames=" + prescricoes_exames
                + ", prescricoes_medicamento=" + prescricoes_medicamento + "]";
    }


}  