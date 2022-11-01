package papelaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Cliente> listaDeClientes = new ArrayList<>();
        ArrayList<Livro> listaDeLivros = new ArrayList<>();

        int opcaop, opcaoc, opcaol, opcaor;

        do {
            Menus.limparConsola();
            Menus.menuprincipal();
            System.out.println("Digite a opção desejada: ");
            opcaop = scan.nextInt();

            switch (opcaop) {

                case 0:
                    break;

                case 1:
                    do {
                        Menus.limparConsola();
                        Menus.menuclientes();
                        System.out.println("Digite a opção desejada: ");
                        opcaoc = scan.nextInt();

                        switch (opcaoc) {

                            case 0:
                                break;

                            case 1:

                                Menus.limparConsola();
                                Cliente clientes = new Cliente();
                                String nif;

                                do {
                                    System.out.println("Introduza o NIF: ");
                                    nif = scan.next();
                                } while (ValidarNIF.validarNIF(nif) == false);

                                clientes.setNif(nif);

                                System.out.println("Introduza o nome do cliente: ");
                                clientes.setNome(scan.next());

                                System.out.println("Introduza o ano escolar: ");
                                clientes.setAnoC(scan.nextInt());

                                System.out.println("Introduza o escalão do cliente (A , B ou 0): ");
                                String escalao = scan.next();
                                clientes.setEscalao(escalao);
                                double plafond = 0;
                                if (escalao.equalsIgnoreCase("A"))
                                    plafond = 200;
                                if (escalao.equalsIgnoreCase("B"))
                                    plafond = 100;
                                clientes.setPlafond(plafond);

                                listaDeClientes.add(clientes);
                                break;

                            case 2:

                                System.out.println("Introduza o nº do cliente a eliminar: ");
                                int eliminar = scan.nextInt();
                                if (listaDeClientes.size() >= eliminar) {
                                    listaDeClientes.remove(eliminar - 1);
                                    System.out.println("Cliente eliminado!");
                                } else {
                                    System.out.println("Cliente não encontrado!");
                                }
                                Menus.esperartecla();

                                break;

                            case 3:

                                if (listaDeClientes.isEmpty()) {
                                    System.out.println("Não existem clientes registados!");
                                } else {
                                    for (Cliente cliente : listaDeClientes) {
                                        System.out.println("Cliente nº " + (listaDeClientes.indexOf(cliente)+1));
                                        System.out.println(cliente);
                                    }
                                }

                                Menus.esperartecla();

                                break;

                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    }while (opcaoc != 0) ;
                    break;

                case 2:

                    do {
                        Menus.limparConsola();
                        Menus.menulivros();
                        System.out.println("Digite a opção desejada: ");
                        opcaol = scan.nextInt();

                        switch (opcaol) {

                            case 0:
                                break;

                            case 1:
                                Livro livros = new Livro();
                                System.out.println("Introduza o ano escolar do livro: ");
                                livros.setAnoL(scan.nextInt());

                                System.out.println("Introduza o titulo do livro: ");
                                livros.setTitulo(scan.next());

                                System.out.println("Introduza o preço do livro: ");
                                livros.setPreco(scan.nextDouble());

                                listaDeLivros.add(livros);
                                break;

                            case 2:

                                System.out.println("Introduza o códigp do livro a eliminar: ");
                                int eliminar = scan.nextInt();
                                if (listaDeLivros.size()>=eliminar){
                                    listaDeLivros.remove(eliminar-1);
                                    System.out.println("Livro eliminado!");
                                }else{
                                    System.out.println("Livro não encontrado!");
                                }
                                Menus.esperartecla();

                                break;

                            case 3:

                                if(listaDeLivros.isEmpty()){
                                    System.out.println("Não existem livros registados!");
                                }else{
                                    for (Livro livro : listaDeLivros) {
                                        System.out.println("Código do livro: " + listaDeLivros.indexOf(livro) + 1);
                                        System.out.println(livro);
                                    }
                                }

                                Menus.esperartecla();

                                break;

                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    }while (opcaol != 0) ;
                    break;

                case 3:

                    do {
                        Menus.limparConsola();
                        Menus.menucompras();
                        System.out.println("Digite a opção desejada: ");
                        opcaor = scan.nextInt();
                        int numCliente;
                        double total;

                        switch (opcaor) {

                            case 0:
                                break;

                            case 1:

                                System.out.println("Introduza o número de cliente: ");
                                numCliente = scan.nextInt();

                                System.out.println("Introduza o código do livro a adquirir: ");
                                int codLivro = scan.nextInt();

                                double plivro = listaDeLivros.get(codLivro-1).getPreco();

                                total = listaDeClientes.get(numCliente-1).getTotal()+plivro;
                                listaDeClientes.get(numCliente-1).setTotal(total);

                                System.out.println("Aquisição registada!");

                                Menus.esperartecla();

                                break;

                            case 2:

                                System.out.println("Introduza o número de cliente: ");
                                numCliente = scan.nextInt();

                                System.out.println("Introduza o valor do material adquirido: ");
                                double valor = scan.nextDouble();

                                total = listaDeClientes.get(numCliente-1).getTotal()+valor;
                                listaDeClientes.get(numCliente-1).setTotal(total);

                                System.out.println("Aquisição registada!");

                                Menus.esperartecla();

                                break;

                            case 3:

                                System.out.println("Introduza o número de cliente: ");
                                numCliente = scan.nextInt();

                                System.out.println("Pagamento com utilização do voucher? (S/N) ");
                                String escolha = scan.next();

                                if(escolha.equalsIgnoreCase("S")){
                                    double resultado = (listaDeClientes.get(numCliente-1).getTotal())-(listaDeClientes.get(numCliente-1).getPlafond());
                                    if(resultado>0){
                                        System.out.println("O valor a pagar depois de abatido o voucher é: "+ resultado);
                                        total = 0;
                                        listaDeClientes.get(numCliente-1).setTotal(total);
                                    }else {
                                        double plafond = (resultado * -1);
                                        System.out.println("Pagamento efetuado. Resta ainda " + plafond + " de saldo");
                                        listaDeClientes.get(numCliente-1).setPlafond(plafond);
                                    }
                                }
                                if(escolha.equalsIgnoreCase("N")){
                                    System.out.println("O valor a pagar é: "+listaDeClientes.get(numCliente-1).getTotal());
                                    total = 0;
                                    listaDeClientes.get(numCliente-1).setTotal(total);
                                }

                                Menus.esperartecla();

                                break;

                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    }while (opcaor != 0) ;
                    break;

            }
        }while (opcaop != 0) ;
    }
}

