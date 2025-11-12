package seriea;

import java.io.File;
import java.util.Scanner;

public class Campionato {
    private Squadra[] squadre = new Squadra[20];

    public Campionato(String nomeFile) throws Exception {
        Scanner file = new Scanner(new File(nomeFile));
        file.nextLine();
        int i = 0;
        while (file.hasNextLine() && i < 20) {
            String[] p = file.nextLine().split(",");
            String nome = p[1];
            int giocate = Integer.parseInt(p[2]);
            int vinte = Integer.parseInt(p[3]);
            int pareggiate = Integer.parseInt(p[4]);
            int perse = Integer.parseInt(p[5]);
            int punti = Integer.parseInt(p[6]);
            squadre[i] = new Squadra(nome, giocate, vinte, pareggiate, perse, punti);
            i++;
        }
        file.close();
    }

    public void stampaClassifica() {
        for (Squadra s : squadre)
            System.out.println(s);
    }

    public void cercaSquadra(String nome) {
        for (Squadra s : squadre)
            if (s.getNome().equalsIgnoreCase(nome)) {
                System.out.println("\n" + s);
                return;
            }
        System.out.println("Squadra non trovata!");
    }


public void giornataSuccessivaInteractive(Scanner in) {
    System.out.println("\n--- Giornata successiva ---");
    System.out.println("Per ogni squadra inserisci: v (vittoria), p (pareggio), s (sconfitta)");
    for (int i = 0; i < squadre.length; i++) {
        Squadra s = squadre[i];
        String scelta = "";
        do {
            System.out.print("Risultato per " + s.getNome() + " (v/p/s): ");
            scelta = in.nextLine().trim().toLowerCase();
        } while (!scelta.equals("v") && !scelta.equals("p") && !scelta.equals("s"));
        if (scelta.equals("v")) {
            s.addVittoria();
        } else if (scelta.equals("p")) {
            s.addPareggio();
        } else {
            s.addSconfitta();
        }
    }
    // Riordina la classifica in base ai punti (decrescente)
    java.util.Arrays.sort(squadre, new java.util.Comparator<Squadra>() {
        @Override
        public int compare(Squadra a, Squadra b) {
            return Integer.compare(b.getPunti(), a.getPunti());
        }
    });
    System.out.println("\nClassifica aggiornata dopo la giornata:");
    stampaClassifica();
}
}
