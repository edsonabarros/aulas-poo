package HerançaUpcast;

public class RodarAplicação {

    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast
        Vendedor vendedor1 = (Vendedor) new Funcionario();

    }

}
