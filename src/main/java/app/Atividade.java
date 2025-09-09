package app;

public class Atividade{
    private long id;
    private String descricao;

    public long getId(){
        return id;
    }

    public void setId(long id) {   //Sempre retorna void
        this.id = id;
    }   

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}