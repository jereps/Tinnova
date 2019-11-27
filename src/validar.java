public class validar {
    public static void main(String[] args){
        Votos votos = new Votos(1000,800,150,50);
        System.out.println(votos.toString());

        BubbleSort bubbleSort = new BubbleSort(new int[]{5, 3, 2, 4, 7, 1, 0, 6});
        System.out.println(bubbleSort.toString());

        Fatorial fatorial = new Fatorial(6);
        System.out.println(fatorial.toString());

        Soma soma = new Soma(10);
        System.out.println(soma.toString());
    }
}
