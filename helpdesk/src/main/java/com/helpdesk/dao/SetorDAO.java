package com.helpdesk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SetorDAO 
{
    public void inserir()
    {
        String sql = """
                INSERT INTO setores (nome)
                VALUES (?)
                """;

        try()
    }
}
