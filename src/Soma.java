public class Soma {
    private int valor;
    private int total;

    public Soma(int valor){
        this.valor = valor;
    }

    public int somaValor(){
        for(int i=0; i < valor; i++){
            if(i%3 == 0){
                total += i;
            }
            else if(i%5==0){
                total += i;
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "Soma{" +
                "total=" + somaValor() +
                '}';
    }
}
