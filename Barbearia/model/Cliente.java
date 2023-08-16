package Barbearia.model;

public class Cliente extends Barbearia{
    private String nome;

    public Cliente(String dia, String horario, float preco, int tipo, int pedido, String nome) {
        super(dia, horario, preco, tipo, pedido);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("Nome do cliente: " + this.nome);
    }

    public void atualizarHorario(String novoDia, String novoHorario) {
        this.setDia(novoDia);
        this.setHorario(novoHorario);
        System.out.println("Horário atualizado para: Dia: " + novoDia + " Horário: " + novoHorario);
    }
}
