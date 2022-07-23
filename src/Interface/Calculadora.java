package Interface;

class Calculadora implements OperacaoMatematica {


    @Override
    public void soma(double val1, double val2) {
        System.out.println("Soma: "+val1 + val2);
    }

    @Override
    public void subtracao(double val1, double val2) {
        System.out.println("Subtração" + (val1 - val2));
    }

    @Override
    public void multi(double val1, double val2) {
        System.out.println("Multi: "+val1 * val2);
    }

    @Override
    public void div(double val1, double val2) {
        System.out.println("Divisão: "+val1 / val2);
    }
}
