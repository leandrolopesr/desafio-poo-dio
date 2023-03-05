import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
            curso.setTitulo("Curso Java");
            curso.setDescricao("descrição do curso java");
            curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
            curso2.setTitulo("Curso Js");
            curso2.setDescricao("descrição do curso js");
            curso2.setCargaHoraria(4);






        Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria Java");
            mentoria.setDescricao("descrição mentoria");
            mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("----------------------------");
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP" + devCamila.calcularXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("----------------------------");
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularXp());











    }
}
