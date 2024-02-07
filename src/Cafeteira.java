//classe com objeto do mundo real
public class Cafeteira {
    private String marca;
    private String cor;
    private int qtdadeMl;

    //Método para receber a marca da cafeteira
    public String getMarca() {
        return marca;
    }

    //Método para inserir a marca da cafeteira na classe
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Método para receber a cor da cafeteira
    public String getCor() {
        return cor;
    }

    //Método para inserir a cor da cafeteira na classe
    public void setCor(String cor) {
        this.cor = cor;
    }

    //Método para receber a quantidade de ml que a cafeteira pode fazer
    public int getQtdadeMl() {
        return qtdadeMl;
    }

    //Método para inserir a quantidade de ml que a cafeteira pode fazer na classe
    public void setQtdadeMl(int qtdadeMl) {
        this.qtdadeMl = qtdadeMl;
    }
}
