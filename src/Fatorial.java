public class Fatorial {

    private int valor;
    private int fatorial =1;

    public Fatorial(int valor){
        this.valor= valor;
    }

    public int calculoFatorial(){
        for(int i =1; i <= valor; i++){
            fatorial *= i;
        }

        return fatorial;
    }

    @Override
    public String toString() {
        return "Fatorial{" +
                "fatorial=" + calculoFatorial() +
                '}';
    }
}
