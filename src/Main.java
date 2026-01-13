import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("curso java", "descrição curso java", 8 );


        Curso curso2 = new Curso("curso js","decrição curso js", 4);



        System.out.println("---------------------");
        Mentoria mentoria = new Mentoria( "mentoria de java", "descrição de java", LocalDate.now());
       

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);








    }
}