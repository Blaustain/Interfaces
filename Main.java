


public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", "Rua A, 123", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Av. Central, 1000", "12.345.678/0001-99");

        System.out.println("Pessoa Física: " + pf.getNome() + " - CPF: " + pf.getCpf());
        System.out.println("Pessoa Jurídica: " + pj.getNome() + " - CNPJ: " + pj.getCnpj());
    }
}
