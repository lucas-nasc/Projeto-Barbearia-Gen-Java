package Barbearia;

import Barbearia.controler.Controller;
import Barbearia.model.Cliente;
import Barbearia.util.Cores;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Controller barbearia = new Controller();

        String[] semana = {"SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SABADO", "DOMINGO"};
        int opcao, tipo, pedido = 0;
        float preco = 0;
        String horario, nome;
        String dia;
        boolean diaValido = false;
        String tabela =
                Cores.TEXT_YELLOW_BOLD_BRIGHT + """
                        ---------------- ██████╗░██╗░░░██╗███████╗██████╗░░█████╗░-------
                                         ██╔══██╗██║░░░██║██╔════╝██╔══██╗██╔══██╗ 
                                         ██║░░██║██║░░░██║█████╗░░██████╦╝██║░░██║
                                         ██║░░██║██║░░░██║██╔══╝░░██╔══██╗██║░░██║
                                         ██████╔╝╚██████╔╝███████╗██████╦╝╚█████╔╝
                                         ╚═════╝░░╚═════╝░╚══════╝╚═════╝░░╚════╝░  Cortes  
                        ------------------------------------------------------------
                        ------------------------------------------------------------
                                          1- Marcar Horario
                                          2- Lista de Clientes
                                          3- Cancelar horario
                                          4- Atualizar Horario
                                          5- Buscar Cliente
                                          6- Sair 
                                          
                        --------------------------------------------------------------
                        Selecione a opção que deseja:
                         """;

        System.out.println("\n");


        NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
        Scanner leia = new Scanner(System.in);

        while (true) {
            System.out.println(tabela);
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite como gostaria de ser chamado: ");
                    leia.nextLine();
                    nome = leia.nextLine().toUpperCase();
                    System.out.println("Selecione uma das escolhas: ");
                    System.out.println("1-Corte");
                    System.out.println("2-Luzes");
                    System.out.println("3-Progressiva/Botox");
                    tipo = leia.nextInt();
                    switch (tipo) {
                        case 1 -> {
                            System.out.println("MENU");
                            System.out.println("1- Corte de cabelo" + " Preço: R$25 ");
                            System.out.println("2- Cabelo e Barba" + "Preço: R$40");
                            System.out.println("3- Cabelo Barba e Sobrancelha" + " Preço: R$50");
                            System.out.println("Digite o Codigo desejado: ");
                            pedido = leia.nextInt();
                            switch (pedido) {
                                case 1:
                                    preco = 25.0f;
                                    System.out.println("Agendamento de Corte e Barba Valor R$ " + nfMoeda.format(preco));

                                    do {
                                        diaValido = false;
                                        System.out.println("Digite o dia de Segunda a Domingo :  ");
                                        dia = leia.next().toUpperCase();
                                        if (Arrays.asList(semana).contains(dia)) {
                                            System.out.println("Dia confirmadado");
                                            diaValido = true;
                                        } else {
                                            System.out.println("Digite um dia valido! Segunda a Domingo");
                                        }
                                    } while (!diaValido);

                                    System.out.println("\nDigite o Horario que deseja realizar seu corte: ex(00:00) ");
                                    horario = leia.next();
                                    System.out.println("Dia: " + dia + " Horario:" + horario);
                                    barbearia.cadastrar(new Cliente(dia, horario, preco, tipo, pedido, nome));

                                    break;
                                case 2:
                                    preco = 40.0f;
                                    System.out.println("Agendamento de Corte e Barba Valor R$ " + nfMoeda.format(preco));

                                    do {
                                        diaValido = false;
                                        System.out.println("Digite o dia de Segunda a Domingo :  ");
                                        dia = leia.next().toUpperCase();
                                        if (Arrays.asList(semana).contains(dia)) {
                                            System.out.println("Dia confirmadado");
                                            diaValido = true;
                                        } else {
                                            System.out.println("Digite um dia valido! Segunda a Domingo");
                                        }
                                    } while (!diaValido);

                                    System.out.println("Digite o Horario que deseja realizar seu corte: ex(00:00) ");
                                    horario = leia.next();
                                    System.out.println("Dia: " + dia + " Horario:" + horario);
                                    barbearia.cadastrar(new Cliente(dia, horario, preco, tipo, pedido, nome));
                                    break;
                                case 3:
                                    preco = 50.0f;
                                    System.out.println("Agendamento de Corte,Barba e Sobrancelha Valor R$ " + nfMoeda.format(preco));

                                    do {
                                        diaValido = false;
                                        System.out.println("Digite o dia de Segunda a Domingo :  ");
                                        dia = leia.next().toUpperCase();
                                        if (Arrays.asList(semana).contains(dia)) {
                                            System.out.println("Dia confirmadado");
                                            diaValido = true;
                                        } else {
                                            System.out.println("Digite um dia valido! Segunda a Domingo");
                                        }
                                    } while (!diaValido);

                                    System.out.println("Digite o Horario que deseja realizar seu corte: ex(00:00) ");
                                    horario = leia.next();
                                    System.out.println("Dia: " + dia + " Horario:" + horario);
                                    barbearia.cadastrar(new Cliente(dia, horario, preco, tipo, pedido, nome));
                                    break;
                                default:
                                    System.out.println("Opção Invalida!");
                            }

                        }
                        case 2 -> {
                            System.out.println("1- Luzes normal");
                            System.out.println("2- Platinado");
                            System.out.println("Realize sua escolha");
                            pedido = leia.nextInt();

                            switch (pedido) {
                                case 1:
                                    preco = 50.0f;
                                    System.out.println("Agendamento de Luzes Valor R$ " + nfMoeda.format(preco));

                                    do {
                                        diaValido = false;
                                        System.out.println("Digite o dia de Segunda a Domingo :  ");
                                        dia = leia.next().toUpperCase();
                                        if (Arrays.asList(semana).contains(dia)) {
                                            System.out.println("Dia confirmadado");
                                            diaValido = true;
                                        } else {
                                            System.out.println("Digite um dia valido! Segunda a Domingo");
                                        }
                                    } while (!diaValido);

                                    System.out.println("Digite o Horario: ex(00:00) ");
                                    horario = leia.next();
                                    System.out.println("Dia: " + dia + " Horario:" + horario);
                                    barbearia.cadastrar(new Cliente(dia, horario, preco, tipo, pedido, nome));
                                    break;
                                case 2:
                                    preco = 80.0f;
                                    System.out.println("Agendamento de Luzes Valor R$ " + nfMoeda.format(preco));

                                    do {
                                        diaValido = false;
                                        System.out.println("Digite o dia de Segunda a Domingo :  ");
                                        dia = leia.next().toUpperCase();
                                        if (Arrays.asList(semana).contains(dia)) {
                                            System.out.println("Dia confirmadado");
                                            diaValido = true;
                                        } else {
                                            System.out.println("Digite um dia valido! Segunda a Domingo");
                                        }
                                    } while (!diaValido);

                                    System.out.println("Digite o Horario: ex(00:00) ");
                                    horario = leia.next();
                                    System.out.println("Dia: " + dia + " Horario:" + horario);
                                    barbearia.cadastrar(new Cliente(dia, horario, preco, tipo, pedido, nome));
                                    break;
                                default:
                                    System.out.println("Opção invalida");
                            }

                        }
                        case 3 -> {
                            System.out.println("1- Botox");
                            System.out.println("2- Progressiva");
                            System.out.println("Digite a opção desejada");
                            pedido = leia.nextInt();
                            switch (pedido) {
                                case 1:
                                    preco = 50.0f;
                                    System.out.println("Agendamento de Botox Valor R$ " + nfMoeda.format(preco));

                                    do {
                                        diaValido = false;
                                        System.out.println("Digite o dia de Segunda a Domingo :  ");
                                        dia = leia.next().toUpperCase();
                                        if (Arrays.asList(semana).contains(dia)) {
                                            System.out.println("Dia confirmadado");
                                            diaValido = true;
                                        } else {
                                            System.out.println("Digite um dia valido! Segunda a Domingo");
                                        }
                                    } while (!diaValido);

                                    System.out.println("Digite o Horario: ex(00:00) ");
                                    horario = leia.next();
                                    System.out.println("Dia: " + dia + " Horario:" + horario);
                                    barbearia.cadastrar(new Cliente(dia, horario, preco, tipo, pedido, nome));
                                    break;
                                case 2:
                                    preco = 80.0f;
                                    System.out.println("Agendamento de Progressiva Valor R$ " + nfMoeda.format(preco));

                                    do {
                                        diaValido = false;
                                        System.out.println("Digite o dia de Segunda a Domingo :  ");
                                        dia = leia.next().toUpperCase();
                                        if (Arrays.asList(semana).contains(dia)) {
                                            System.out.println("Dia confirmadado");
                                            diaValido = true;
                                        } else {
                                            System.out.println("Digite um dia valido! Segunda a Domingo");
                                        }
                                    } while (!diaValido);

                                    System.out.println("Digite o Horario: ex(00:00) ");
                                    horario = leia.next();
                                    System.out.println("Dia: " + dia + " Horario:" + horario);
                                    barbearia.cadastrar(new Cliente(dia, horario, preco, tipo, pedido, nome));
                                    break;
                                default:
                                    System.out.println("Opção invalida!");

                            }
                        }
                    }

                    break;
                case 2:
                    System.out.println("Lista de clientes: ");
                    System.out.println("\n");
                    barbearia.listarTodas();
                    System.out.println("\n");

                    break;
                case 3:
                    System.out.println("Apagar Horario");
                    System.out.println("Digite o nome do cliente: ");
                    leia.nextLine();
                    nome = leia.nextLine().toUpperCase();

                    barbearia.deletar(nome);
                    break;
                case 4:
                    System.out.println("Atualizar Dados do cliente");

                    System.out.println("Digite o nome do cliente: ");
                    leia.nextLine();
                    nome = leia.nextLine().toUpperCase();

                    if (barbearia.buscaNaLista(nome) != null) {
                        System.out.println("Digite o novo Dia:  ");
                        String novoDia = leia.next();
                        System.out.println("Digite o novo Horario: ");
                        String novoHorario = leia.next();

                        barbearia.atualizarHorarioCliente(nome, novoDia, novoHorario);


                    } else {
                        System.out.println("Cliente não encontrado");
                    }

                    break;

                case 5:
                    System.out.println("Digite o nome do cliente ");
                    leia.nextLine();
                    nome = leia.nextLine().toUpperCase();

                    barbearia.procurarNome(nome);
                    break;

                case 6:
                    System.out.println("Esse projeto foi criado por Lucas Nascimento Silva");
                    System.out.println("Perfil do Github: https://github.com/lucas-nasc");
                    System.out.println("Obrigado por utilizar nosso programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção invalida");
            }
        }

    }
}
