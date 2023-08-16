package Barbearia.controler;

import Barbearia.model.Barbearia;
import Barbearia.model.Cliente;
import repository.Barbeariarepository;

import java.util.ArrayList;

public class Controller implements Barbeariarepository {

    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    @Override
    public void listarTodas() {
        if (listaClientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado");
        }
        for (var cliente:listaClientes) {
            System.out.println("\n");
            cliente.visualizar();
            System.out.println("****************************************");
        }

    }

    @Override
    public void cadastrar(Cliente cliente) {
        listaClientes.add(cliente);
        System.out.println("O valor é de: R$ " + cliente.getPreco() + " Agendamento criado com sucesso");

    }

    @Override
    public void deletar(String nome) {
        var cliente = buscaNaLista(nome);
        if (cliente!= null){
            if (listaClientes.remove(cliente) ==true)
                System.out.println("O cliente " +  nome + " Foi deletado com sucesso");
        }else
            System.out.println("\nO cliente: " + nome + " não foi encontrado");
    }

    @Override
    public void atualizar(Cliente cliente) {
        var buscaCliente = buscaNaLista(cliente.getNome());

        if (buscaCliente != null){
            listaClientes.set(listaClientes.indexOf(buscaCliente),cliente);
            System.out.println("\nO cliente " + cliente.getNome() + "Foi Atualizado com sucesso");
        }else {
            System.out.println("\nO cliente: " + cliente.getNome() + "não foi encontrado");
        }

    }

    @Override
    public void procurarNome(String nome) {
        var cliente = buscaNaLista(nome);

        if (cliente!= null)
            cliente.visualizar();
        else
            System.out.println("\nO " + nome + "não existe");

    }

    public Cliente buscaNaLista(String nome){
        for (var cliente:listaClientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)){
                return cliente;
            }
        }
        return null;
    }

    public void atualizarHorarioCliente(String nome, String novoDia, String novoHorario) {
        Cliente cliente = buscaNaLista(nome);

        if (cliente != null) {
            cliente.atualizarHorario(novoDia, novoHorario);
        } else {
            System.out.println("Cliente não encontrado");
        }
    }


}
