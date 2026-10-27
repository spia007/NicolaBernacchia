//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inTastiera = new Scanner(System.in);
        System.out.println("INSERISCI il numero di battiti di ali: ");
        int count = inTastiera.nextInt();
        Cavaliere sangiorgio = new Cavaliere("Giorgio");
        Thread argo = new Thread(new Drago(count, "Argo"));
        argo.start();
        sangiorgio.lanciaDardi(argo);
        for (int i = 0; i < count; i++) {
                System.out.println("main sta osservando il drago...i = " + i);

        }
    }
}