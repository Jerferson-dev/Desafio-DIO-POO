import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("dsecrição curso js");
        curso2.setCargaHoraria(4);
        System.out.println("---------------------");
        Mentoria mentoria = new Mentoria( "mentoria de java", "descrição de java", LocalDate.now());
        /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
       */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java");
        bootcamp.setDescricao("descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devcamila = new Dev();
        devcamila.setNome("camila");
        devcamila.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos" + devcamila.getConteudosInscritos());
        devcamila.progredir();
        devcamila.progredir();
        System.out.println();
        System.out.println("conteudos inscritos" + devcamila.getConteudosInscritos());
        System.out.println("conteudos concluidos" + devcamila.getConteudosCooncluidos());
        System.out.println("XP: " + devcamila.calcularTotalXp());

        System.out.println("------------------");

        Dev devjoao = new Dev();
        devjoao.setNome("Joao");
        devjoao.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos" + devjoao.getConteudosInscritos());
        devjoao.progredir();
        System.out.println();
        System.out.println("conteudos inscritos" + devjoao.getConteudosInscritos());
        System.out.println("conteudos concluidos" + devjoao.getConteudosCooncluidos());
        System.out.println("XP: " + devjoao.calcularTotalXp());



    }
}