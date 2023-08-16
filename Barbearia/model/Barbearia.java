package Barbearia.model;

public abstract class Barbearia {

    private String dia;
    private String horario;
    private float preco;
    private int tipo;
    private int pedido;

    public Barbearia(String dia, String horario, float preco, int tipo, int pedido) {
        this.dia = dia;
        this.horario = horario;
        this.preco = preco;
        this.tipo = tipo;
        this.pedido = pedido;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public void visualizar(){
        String tipo = " ";

        switch (this.tipo){
            case 1:
                tipo = "Corte de cabelo";
                switch (pedido){
                    case 1:
                        System.out.println("Corte");
                        preco = preco;
                        break;
                    case 2:
                        System.out.println("Corte de Cabelo e Barba");
                        preco = preco;
                        break;
                    case 3:
                        System.out.println("Corte de cabelo, Barba e Sobrancelha");
                        preco = preco;
                        break;
                }
                break;
            case 2:
                tipo = "Luzes";
                switch (pedido){
                    case 1:
                        System.out.println("Luzes normal");
                        preco = preco;
                        break;
                    case 2:
                        System.out.println("Luzes platinado");
                        preco = preco;
                        break;
                }
                break;
            case 3:
                tipo = "Progressiva";
                switch (pedido){
                    case 1:
                        System.out.println("Botox");
                        preco = preco;
                        break;
                    case 2:
                        System.out.println("Progressiva");
                        preco = preco;
                        break;
                }
        }
        System.out.println("***********************************************************");
        System.out.println("Dia marcado: " + this.dia);
        System.out.println("Horario marcado: " + this.horario);
        System.out.println("Tipo do corte : " + this.tipo);
        System.out.println("Pedido: " + this.pedido);
        System.out.println("Preço: " + this.preco);

    }

}
