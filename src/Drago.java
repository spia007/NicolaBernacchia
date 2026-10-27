public class Drago implements Runnable {
    private String nome;
    private int numBattiti;


    public Drago(int numBattiti, String nome) {
        this.numBattiti = numBattiti;
        this.nome = nome;
    }

    public void run() {
        for (int i = 0; (i < numBattiti) && !Thread.interrupted(); i++) {
            System.out.println(nome + " Si libera nell'aria! Gioia immensa, al battito " + (i + 1));
        }
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(nome+ " - " + e);
        }
    }





}