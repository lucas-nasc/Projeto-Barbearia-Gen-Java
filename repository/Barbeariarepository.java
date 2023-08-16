package repository;

import Barbearia.model.Cliente;

public interface Barbeariarepository {
    public void listarTodas();
    public void cadastrar(Cliente cadastrar);
    public void deletar(String nome);
    public void atualizar(Cliente atualizar);
    public void procurarNome(String nome);
}
