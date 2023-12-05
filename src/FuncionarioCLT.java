public abstract class FuncionarioCLT {
    protected String nome;
    protected String documento;
    protected Double valorSalario;
    protected Endereco endereco;

    public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.valorSalario = valorSalario;
        this.endereco = endereco;
    }
}
