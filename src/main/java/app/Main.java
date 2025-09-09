package app;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Tarefa[] tarefas = new Tarefa[5];
        Compromisso[] compromissos = new Compromisso[5];
        PessoaFisica[] pf = new PessoaFisica[5];
        PessoaJuridica[] pj = new PessoaJuridica[5];

        tarefas[0] = new Tarefa(0, "Teste", false);
        tarefas[4] = new Tarefa(4, "Novo Teste", false);
        pf[0] = new PessoaFisica("FATEC", "rua chorume", LocalDate.of(2006, Month.NOVEMBER, 03), "00000000");
        pj[0] = new PessoaJuridica("FATEC", "rua chorume","FATEC SHUNJI NISHIMURA", "00000000");

        System.out.println(tarefas[0].getDescricao());
        System.out.println(pf[0].exibirInformacoes());
        System.out.println(pj[0].exibirInformacoespj());
    }
}