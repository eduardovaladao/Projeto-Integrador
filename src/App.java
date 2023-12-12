import domain.*;

import java.text.SimpleDateFormat;
import java.util.Date;


public class App {
    public static void main(String[] args) throws Exception {

        Date data1 = new SimpleDateFormat("dd/MM/yyyy").parse("12/03/1995");

        Recepcao recepcao = new Recepcao(1, "+55 34 3222-6724", null, null);

        Paciente paciente = new Paciente(1, "Lucas Matheus", "123.456.789-10", 'M', "RJ-70.102.031", data1, "+55 34 96543-8987", "lusca@gmail.com", null);

        Medico medico = new Medico(2, "Samuel Prado", "111.213.141-51", 'M', "SP-92.164.369-", null, "74.457/MG", "Cardiologista", null);
        
        Recepcionista recepcionista = new Recepcionista(3, "Thiago Daniel", "617.181.920-21", 'M', "thiagao@recepcao.gmail.com", "+55 34 99878-9076", null, null);

        Consulta consulta = new Consulta(1, "Consultório 1", null, null, paciente, medico, recepcionista, null, null);
        
        PrescricaoMedicamento prescricaoMedicamento = new PrescricaoMedicamento(1, "Duas semanas", "200 mg/dia", consulta, null);

        Medicamento medicamento = new Medicamento(1, "Diurético", "Furozemida", "Apresenta efeito diurético (promove a excreção da urina) e antihipertensivo (auxilia no tratamento da pressão alta).", prescricaoMedicamento);

        PrescricaoExame prescricaoExame = new PrescricaoExame(1, null, null, "Laboratório 1", consulta, null);

        Exame exame = new Exame(1, "Imagem", "Angiografia digital", "Avalia os vasos do cérebro ou do coração", null);

        /*/
        System.out.println(recepcao.toString() + "\n" + paciente.toString() + "\n" + medico.toString() +
        "\n" + recepcionista.toString() + "\n\n" + consulta.toString() + "\n" + prescricaoMedicamento.toString() +
        "\n" + prescricaoExame.toString() + "\n" + medicamento.toString() + "\n" + exame.toString());
        */

        System.out.println(medico.getConsultas());
        
    }
}
