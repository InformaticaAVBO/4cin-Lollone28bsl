
package seriea;

public class Squadra {
    private String nome;
    private int giocate, vinte, pareggiate, perse, punti;

    public Squadra(String nome, int giocate, int vinte, int pareggiate, int perse, int punti) {
        this.nome = nome;
        this.giocate = giocate;
        this.vinte = vinte;
        this.pareggiate = pareggiate;
        this.perse = perse;
        this.punti = punti;
    }

    public String getNome() { 
        return nome; 
    }

    public int getGiocate() { 
        return giocate; 
    }

    public int getVinte() { 
        return vinte; 
    }

    public int getPareggiate() { 
        return pareggiate; 
    }

    public int getPerse() { 
        return perse; 
    }

    public int getPunti() { 
        return punti; 
    }

    public void addVittoria() {
        giocate++;
        vinte++;
        punti += 3;
    }

    public void addPareggio() {
        giocate++;
        pareggiate++;
        punti += 1;
    }

    public void addSconfitta() {
        giocate++;
        perse++;
        // 0 punti per la sconfitta
    }

    @Override
    public String toString() {
        return nome + " - Giocate: " + giocate + ", Vinte: " + vinte +
               ", Pareggiate: " + pareggiate + ", Perse: " + perse +
               ", Punti: " + punti;
    }
}
