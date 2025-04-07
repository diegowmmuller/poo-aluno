package com.diegowmmuller.poo.aluno;

import Model.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class PooAluno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Informe o nome do aluno: ");
        String name = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print("Informe a " + (i + 1) + "a nota: ");
            Double nota = sc.nextDouble();
            aluno.setNotas(i, nota);

        }

        double media = aluno.getMedia();

        System.out.println("Aluno : " + name + " tem a média de: " + String.format("%.2f", media));

        sc.close();
    }
}
