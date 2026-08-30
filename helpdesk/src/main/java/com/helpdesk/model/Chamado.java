package com.helpdesk.model;

import java.time.LocalDateTime;

public class Chamado 
{
    private Integer idChamado;
    private Integer idEquipamento;
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private StatusChamado status;
    private LocalDateTime criadoEm;
    private LocalDateTime resolvidoEm;
    
    public Chamado(Integer idEquipamento, String titulo, String descricao, Prioridade prioridade, StatusChamado status, LocalDateTime criadoEm)
    {
        idChamado = 0;
        this.idEquipamento = idEquipamento;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
        this.criadoEm = criadoEm;
        resolvidoEm = null;
    }

    public Integer getIdChamado() 
    {
        return idChamado;
    }

    public void setIdChamado(Integer idChamado) 
    {
        this.idChamado = idChamado;
    }

    public Integer getIdEquipamento() 
    {
        return idEquipamento;
    }

    public void setIdEquipamento(Integer idEquipamento) 
    {
        this.idEquipamento = idEquipamento;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() 
    {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) 
    {
        this.prioridade = prioridade;
    }

    public StatusChamado getStatus() 
    {
        return status;
    }

    public void setStatus(StatusChamado status) 
    {
        this.status = status;
    }

    public LocalDateTime getCriadoEm() 
    {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) 
    {
        this.criadoEm = criadoEm;
    }

    public LocalDateTime getResolvidoEm() 
    {
        return resolvidoEm;
    }

    public void setResolvidoEm(LocalDateTime resolvidoEm) 
    {
        this.resolvidoEm = resolvidoEm;
    }

    @Override
    public String toString()
    {
        return """
                Chamado
                idChamado = %d
                idEquipamento = %d
                titulo = %s
                descricao = %s
                prioridade = %s
                status = %s
                criado em %t
                resolvido em %t
                """.formatted(idChamado, idEquipamento, titulo, descricao, prioridade, status, criadoEm, resolvidoEm);
    }
}
