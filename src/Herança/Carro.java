package Herança;

public class Carro extends Veiculo{

    String cor;
    String modelo;
    int capdTanque;

    Carro(){

    }


    Carro(String cor, String modelo, int capdTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capdTanque = capdTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void setCapdTanque (int capdTanque){
        this.capdTanque = capdTanque;
    }

    int getCapdTanque(){
        return capdTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capdTanque * valorCombustivel;
    }


}

