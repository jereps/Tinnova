public class Votos {

    private float totalEleitor;
    private float validos;
    private float brancos;
    private float nulos;

    public Votos(int total, int validos, int brancos, int nulos){
        this.totalEleitor = total;
        this.validos = validos;
        this.brancos = brancos;
        this.nulos = nulos;
    }

    public float getTotalEleitor() {
        return totalEleitor;
    }

    public void setTotalEleitor(int totalEleitor) {
        this.totalEleitor = totalEleitor;
    }

    public float getValidos() {
        return validos;
    }

    public void setValidos(int validos) {
        this.validos = validos;
    }

    public float getBrancos() {
        return brancos;
    }

    public void setBrancos(int brancos) {
        this.brancos = brancos;
    }

    public float getNulos() {
        return nulos;
    }

    public void setNulos(int nulos) {
        this.nulos = nulos;
    }

    public float pencentualValidos(){
        return validos * 100 / totalEleitor;
    }

    public float pencentualBrancos(){
        return brancos * 100 /totalEleitor;
    }

    public float pencentualNulos(){
        return nulos * 100 / totalEleitor;
    }

    @Override
    public String toString() {
        return "Votos{" +
                "totalEleitor=" + getTotalEleitor() +
                ", validos=" + pencentualValidos() + "%" +
                ", brancos=" + pencentualBrancos() + "%" +
                ", nulos=" + pencentualNulos() + "%" +
                '}';
    }
}
