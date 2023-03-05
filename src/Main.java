import br.com.dio.desafio.dominio.Curso;
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



        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);







    }
}
