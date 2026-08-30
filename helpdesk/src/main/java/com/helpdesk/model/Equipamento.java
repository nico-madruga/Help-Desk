package com.helpdesk.model;

public class Equipamento 
{
    private Integer idEquipamento;
    private String nome;
    private String tipo;
    private String patrimonio;
    private Integer idSetor;
    private Boolean ativo;

    public Equipamento(String nome, String tipo, String patrimonio, Integer idSetor)
    {
        idEquipamento = 0;
        this.nome = nome;
        this.tipo = tipo;
        this.patrimonio = patrimonio;
        this.idSetor = idSetor;
        ativo = false;
    }

    public Integer getIdEquipamento() 
    {
        return idEquipamento;
    }

    public void setIdEquipamento(Integer idEquipamento) 
    {
        this.idEquipamento = idEquipamento;
    }
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public String getPatrimonio() 
    {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) 
    {
        this.patrimonio = patrimonio;
    }

    public Integer getIdSetor() 
    {
        return idSetor;
    }

    public void setIdSetor(Integer idSetor) 
    {
        this.idSetor = idSetor;
    }

    public Boolean getAtivo() 
    {
        return ativo;
    }

    public void setAtivo(Boolean ativo) 
    {
        this.ativo = ativo;
    }

    @Override
    public String toString() 
    {
        return """
        Equipamento
        idEquipamento = %d, 
        nome = %s 
        tipo = %s 
        patrimonio= %s
        idSetor= %d
        ativo=" + %b
        """.formatted(idEquipamento, nome, tipo, patrimonio, idSetor, ativo);
    }

    
    
}
