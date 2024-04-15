import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(
                "Java",
                "Curso de Java abordando POO",
                90
        );

        Mentoria mentoria = new Mentoria(
                "Mentoria de Java",
                "Mentoria sobre TDD aplicado em Java",
                LocalDate.now()
        );

        Conteudo curso2 = new Curso(
                "Curso de Javascript",
                "Curso de NextJS",
                30
        );

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java completo e alguns adicionais");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso2);

        Dev dev = new Dev("Joao Silva");
        Dev dev2 = new Dev("Camila Oliveira");

        dev.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println(dev.getConteudosInscritos());
        System.out.println(dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularXpTotal());
        System.out.println("Progredir 2 vezes...");
        dev.progredir();
        dev.progredir();
        System.out.println(dev.getConteudosInscritos());
        System.out.println(dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularXpTotal());
        dev.progredir();
        dev.progredir();
    }
}
