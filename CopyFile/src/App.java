import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void copyFile (String fileIn, String fileOut) throws IOException{
        File f = new File(fileIn);
        Scannerleggi = new Scanner(f);
        FileWriter scrivi = new FileWriter(fileOut);

        while (leggi.hasNextLine()) {
            String s = leggi.nextLine();
            scrivi.write(s);

        }
        leggi.close();
        scrivi.close();
    }

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il nome del file di input: ");
        String nomeInput = input.nextLine();

        System.out.print("Inserisci il nome del file di output: ");
        String nomeOutput = input.nextLine();

        input.close();

        System.out.println("Fine della copia di " + nomeInput + " in " + nomeOutput);

        App.copyFile(nomeInput, nomeOutput);
    }
}