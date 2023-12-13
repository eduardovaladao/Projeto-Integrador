import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import domain.*;

public class Testeee {
    public static void main(String args[]) throws ParseException {

        Scanner input = new Scanner(System.in);

        Date data1 = new SimpleDateFormat("dd/MM/yyyy").parse("12/03/1995");

        Time time1 = new Time(10, 0, 0);

        Paciente paciente1 = new Paciente(
            1, 
            "Lucas Matheus", 
            "123.456.789-10", 
            'M', 
            "RJ-70.102.031", 
            data1, 
            "+55 34 96543-8987", 
            "lusca@gmail.com", 
            null);
        
        Medico medico1 = new Medico(
            1, 
            "Samuel Prado", 
            "111.213.141-51", 
            'M', 
            "SP-92.164.369-", 
            null, 
            "74.457/MG", 
            "Cardiologista", 
            null);

        Consulta nova_consulta = paciente1.reservarConsulta(medico1, data1, time1);        
    }
}
