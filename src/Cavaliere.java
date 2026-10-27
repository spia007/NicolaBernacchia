public class Cavaliere {
    private String nome;
    public Cavaliere(String nome){
        this.nome = nome;
    }
    public void lanciaDardi(Thread d){
        for (int i = 0; i <= 20; i++){
            try {
                Thread.sleep(10);
                d.interrupt();
                System.out.println(nome+ " sta cercando di colpire il drago " + i+1);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
