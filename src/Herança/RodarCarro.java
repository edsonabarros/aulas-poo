package Herança;

public class RodarCarro {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setModelo("BMW");
        carro1.setCapdTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapdTanque());

        System.out.println(carro1.totalValorTanque(6.39));
        Carro carro2 = new Carro("cinza", "mercedez", 69);
        System.out.println();
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapdTanque());
        System.out.println(carro2.totalValorTanque(6.39));

    }
}
