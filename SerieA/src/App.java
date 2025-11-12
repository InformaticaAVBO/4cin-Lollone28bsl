package seriea;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Campionato serieA = new Campionato("deta/serieA.csv");

        int scelta;
        do {
            System.out.println("\n1 - Stampa classifica");
            System.out.println("2 - Cerca squadra");
            System.out.println("3 - Giornata successiva (inserisci risultati)");
            System.out.println("0 - Esci");
            System.out.print("Scelta: ");
            scelta = in.nextInt();
            in.nextLine();

            if (scelta == 1) serieA.stampaClassifica();
            else if (scelta == 2) {
                System.out.print("Nome squadra: ");
                String nome = in.nextLine();
                serieA.cercaSquadra(nome);
            } else if (scelta == 3) {
                serieA.giornataSuccessivaInteractive(in);
            }
        } while (scelta != 0);
    }
}
