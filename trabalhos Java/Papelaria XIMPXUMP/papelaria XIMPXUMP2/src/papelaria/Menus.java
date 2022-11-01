package papelaria;

import java.util.Scanner;

    public class Menus {

        static Scanner scan = new Scanner(System.in);

        public static void menuprincipal() {
            System.out.println("       -------------------------------------------------------------------");
            System.out.println("                M E N U   P R I N C I P A L");
            System.out.println("                    1 - REGISTAR CLIENTE");
            System.out.println("                    2 - REGISTAR LIVROS");
            System.out.println("                    3 - REGISTAR COMPRAS");
            System.out.println("                    0 - SAIR");
            System.out.println("       -------------------------------------------------------------------");
        }

        public static void menuclientes() {
            System.out.println("       -------------------------------------------------------------------");
            System.out.println("                M E N U   C L I E N T E S");
            System.out.println("                    1 - CRIAR CLIENTE");
            System.out.println("                    2 - ELIMINAR CLIENTE");
            System.out.println("                    3 - LISTAR CLIENTES");
            System.out.println("                    0 - VOLTAR AO MENU ANTERIOR");
            System.out.println("       -------------------------------------------------------------------");
        }

        public static void menulivros() {
            System.out.println("       -------------------------------------------------------------------");
            System.out.println("                  M E N U   L I V R O S");
            System.out.println("                    1 - CRIAR LIVRO");
            System.out.println("                    2 - ELIMINAR LIVRO");
            System.out.println("                    3 - LISTAR LIVROS");
            System.out.println("                    0 - VOLTAR AO MENU ANTERIOR");
            System.out.println("       -------------------------------------------------------------------");
        }
        public static void menucompras() {
            System.out.println("       -------------------------------------------------------------------");
            System.out.println("                  M E N U   C O M P R A S");
            System.out.println("                    1 - COMPRA DE LIVRO");
            System.out.println("                    2 - COMPRA DE MATERIAL");
            System.out.println("                    3 - PAGAMENTO");
            System.out.println("                    0 - VOLTAR AO MENU ANTERIOR");
            System.out.println("       -------------------------------------------------------------------");
        }

        public static void limparConsola(){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }

        public static void esperartecla(){

            System.out.print("Clique enter para continuar...");
            scan.nextLine();
        }
    }

