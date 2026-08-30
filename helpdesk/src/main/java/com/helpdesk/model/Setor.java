package com.helpdesk.model;

public class Setor 
{
    private Integer setorId;
    private String nome;

    public Setor(int setorId, String nome)
    {
        this.setorId = setorId;
        this.nome = nome;
    }

    public int getSetorId()
    {
        return setorId;
    }

    public void setSetorId(int setorId)
    {
        this.setorId = setorId;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    @Override
    public String toString() 
    {
        return """
                Setor
                ID = %d
                Nome = @s
                """.formatted(setorId, nome);
    }

}
