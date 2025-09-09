package app;

public class Compromisso extends Atividade{
    private String datainicial;
    private String dataFinal;




    public String getDatainicial(){
        return datainicial;
    }

    public void setDatainicial(String datainicial) {
        this.datainicial = datainicial;
    }



    public String getDataFinal(){
        return dataFinal;
    }

    public void setDataFinal(String dataFinal){
        this.dataFinal = dataFinal;
    }


    public Compromisso(long id, String descricao, String datainicial, String dataFinal){
        this.setId(id);
        this.setDescricao(descricao);
        this.setDatainicial(datainicial);
        this.setDataFinal(dataFinal);
    }


}