package com.helpdesk.service;

import com.helpdesk.model.Setor;
import com.helpdesk.exceptions.BusinessException;

public class SetorService 
{
    public void cadastrar(Setor setor)
    {
        if(setor.getNome().isBlank() || setor.getNome() == null)
        {
            throw new BusinessException("Nome é um campo obrigatório.");
        }
        
        
    }
}
