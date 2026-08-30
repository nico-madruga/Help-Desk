package com.helpdesk.view;

import java.util.Scanner;

public class Menu 
{
    Scanner scanner = new Scanner(System.in);

    public void iniciar()
    {
        int escolha = menu();
        decisao(escolha);
    }

    public int menu()
    {
        System.out.println("""
                ==========================
                        HELPDESK
                ==========================

                --SETORES--
                1 - Cadastrar setor
                2 - Listar setores
                3 - Buscar setor por ID

                --EQUIPAMENTOS--
                4 - Cadastrar equipamento
                5 - Listar equipamentos
                6 - Listar equipamentos ativos
                7 - Listar equipamentos por setor

                --CHAMADOS--
                8  - Cadastrar chamado
                9  - Listar chamados
                10 - Buscar chamado por ID
                11 - Listar chamados abertos
                12 - Filtrar chamados por prioridade
                13 - Resolver chamado

                ---------
                0 - Sair
                Insira o codigo da ação que deseja efetuar:
                """);

        int escolha = scanner.nextInt();
        scanner.nextLine();

        return escolha;
    }

    public void decisao(int escolha)
    {
        switch (escolha) 
        {
            case 1:
                {
                    //cadastrarSetor();
                    break;
                }
            case 2:
                {
                    //listarSetores();
                    break;
                }
            case 3:
                {
                    //buscarSetorPorID();
                    break;
                }
            case 4:
                {
                    //cadastrarEquipamento();
                    break;
                }
            case 5:
                {
                    //listarEquipamentos();
                    break;
                }
            case 6:
                {
                    //listarEquipamentosAtivos();
                    break;
                }
            case 7:
                {
                    //listarEquipamentosPorSetor();
                    break;
                }
            case 8:
                {
                    //cadastrarChamado();
                    break;
                }
            case 9:
                {
                    //listarChamados();
                    break;
                }
            case 10:
                {
                    //buscarChamadoPorID();
                    break;
                }
            case 11:
                {
                    //listarChamadosAbertos();
                    break;
                }
            case 12:
                {
                    //filtrarChamadosPorPrioridade();
                    break;
                }
            case 13:
                {
                    //resolverChamado();
                    break;
                }
            default:
                {
                    break;
                }
        }
    }
}