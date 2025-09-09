package app;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class PessoaJuridica extends Pessoa{

    private String nomeFantasia;
    private String cnpj;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String exibirInformacoespj() {
        String infopj = "o nome fantasia é " + nomeFantasia + " e o endereço é " + getEndereco();
        return infopj;
    }

    public PessoaJuridica(String nome, String endereco, String nomeFantasia, String cnpj) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
    }
}