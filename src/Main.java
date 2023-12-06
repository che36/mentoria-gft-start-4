
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua do funcionario", "Complemento do Endereco", "Bairro do funcionario");
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Cesar Constanzo");
        vendedor.setDocumento("123456465-89");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        System.out.println(vendedor);

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Operador de Caixa", "132456.78", 150d, endereco);
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("César");
        gerente.setDocumento("465.465.465");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();

        System.out.println(gerente);
    }
}
