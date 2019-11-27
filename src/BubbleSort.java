import java.util.Arrays;

public class BubbleSort {

    private int[] vetor;

    public BubbleSort(int[] order){
        this.vetor = order;
    }

    public int[] ordenacao(){

        for( int i = 0; i < vetor.length; i++ ){
            for(int j = 0; j < vetor.length - 1; j++){
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j+1] = aux;
                }
            }
        }

        return vetor;
    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "vetor=" + Arrays.toString(ordenacao()) +
                '}';
    }
}
