package Sistema;

import ClasseAbstrata.Assistente;
import ClasseAbstrata.Coordenador;
import ClasseAbstrata.Desenvolvedor;

public class Sistema {

    private static String mensagemDefault(){
        return "Opção inválida, tente novamente...";
    }
    
    private static void menuPrincipal(){
        System.out.println("\nO QUE DESEJA FAZER?");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - REMOVER");
        System.out.println("3 - LISTAR");
        System.out.println("4 - BUSCAR");
        System.out.println("5 - LISTAR TODOS FUNCIONÁRIOS");
        System.out.println("0 - SAIR");
    }
    
    private static void menuFuncionarios(){
        System.out.println("\nSELECIONE O CARGO");
        System.out.println("1 - COORDENADOR");
        System.out.println("2 - DESENVOLVEDOR");
        System.out.println("3 - ASSISTENTE");
    }

    private static void cadastrarCoordenador(){
        System.out.println("\nCADASTRO DO COORDENADOR\n");
        
    }

    private static void cadastrarDesenvolvedor(){
        System.out.println("\nCADASTRO DE DESENVOLVEDOR\n");
       
    }

    private static void cadastrarAssistente(){
        System.out.println("\nCADASTRO DE ASSISTENTE\n");
      
    }

    private static void removerCoordenador(){
        if(Cadastro.getListaCoordenador().size() == 0){
            System.out.println("Não há coordenadores cadastrados!");
            return;
        }
        System.out.print("Matricula do coordenador: ");
        int mat = Console.lerInt();
        Coordenador c = Cadastro.buscarCoordenador(mat);
        if (c == null){
            System.out.println("Coordenador não encontrado");
            return;
        }
        Cadastro.removerCoordenador(mat);
        System.out.println("Coordenador removido com sucesso!");
    }

    private static void removerDesenvolvedor(){
        if(Cadastro.getListaDesenvolvedor().size() == 0){
            System.out.println("Não há desenvolvedores cadastrados!");
            return;
        }
        System.out.print("Matricula do desenvolvedor: ");
        int mat = Console.lerInt();
        Desenvolvedor d = Cadastro.buscarDesenvolvedor(mat);
        if (d == null){
            System.out.println("Desenvolvedor não encontrado");
            return;
        }
        Cadastro.removerDesenvolvedor(mat);
        System.out.println("Desenvolvedor removido com sucesso!");
    }

    private static void removerAssistente(){
        if(Cadastro.getListaAssistente().size() == 0){
            System.out.println("Não há assistentes cadastrados!");
            return;
        }
        System.out.print("Matricula do assistente: ");
        int mat = Console.lerInt();
        Assistente a = Cadastro.buscarAssistente(mat);
        if (a == null){
            System.out.println("Assistente não encontrado");
            return;
        }
        Cadastro.removerAssistente(mat);
        System.out.println("Assistente removido com sucesso!");
    }

    private static void listarCoordenador(){
        if(Cadastro.getListaCoordenador().size() == 0){
            System.out.println("Não há coordenadores cadastrados!");
            return;
        }
        System.out.println("\nLISTA DE COORDENADORES\n");
        for(Coordenador temp : Cadastro.getListaCoordenador()){
            System.out.println(temp);
        }
    }

    private static void listarDesenvolvedor(){
        if(Cadastro.getListaDesenvolvedor().size() == 0){
            System.out.println("Não há desenvolvedores cadastrados!");
            return;
        }
        System.out.println("\nLISTA DE DESENVOLVEDORES\n");
        for(Desenvolvedor temp : Cadastro.getListaDesenvolvedor()){
            System.out.println(temp);
        }
    }

    private static void listarAssistente(){
        if(Cadastro.getListaAssistente().size() == 0){
            System.out.println("Não há assistentes cadastrados!");
            return;
        }
        System.out.println("\nLISTA DE ASSISTENTES\n");
        for(Assistente temp : Cadastro.getListaAssistente()){
            System.out.println(temp);
        }
    }

    private static void buscarCoordenador(){
        if(Cadastro.getListaCoordenador().size() == 0){
            System.out.println("Não há coordenadores cadastrados!");
            return;
        }
        System.out.print("Matricula do coordenador: ");
        int mat = Console.lerInt();
        Coordenador c = Cadastro.buscarCoordenador(mat);
        if (c == null){
            System.out.println("Coordenador não encontrado");
            return;
        }
        System.out.println(c.toString());
        System.out.println(c.trabalhar());
        System.out.println(c.relatarProgresso());
    }

    private static void buscarDesenvolvedor(){
        if(Cadastro.getListaDesenvolvedor().size() == 0){
            System.out.println("Não há desenvolvedores cadastrados!");
            return;
        }
        System.out.print("Matricula do Desenvolvedor: ");
        int mat = Console.lerInt();
        Desenvolvedor d = Cadastro.buscarDesenvolvedor(mat);
        if (d == null){
            System.out.println("Desenvolvedor não encontrado");
            return;
        }
        System.out.println(d.toString());
        System.out.println(d.trabalhar());
        System.out.println(d.relatarProgresso());
    }

    private static void buscarAssistente(){
        if(Cadastro.getListaAssistente().size() == 0){
            System.out.println("Não há assistentes cadastrados!");
            return;
        }
        System.out.print("Matricula do Assistente: ");
        int mat = Console.lerInt();
        Assistente a = Cadastro.buscarAssistente(mat);
        if (a == null){
            System.out.println("Assistente não encontrado");
            return;
        }
        System.out.println(a.toString());
        System.out.println(a.trabalhar());
        System.out.println(a.relatarProgresso());
    }

    public static void executar(){
        
        int op;
        int op2;

        do {
            menuPrincipal();
            op = Console.lerInt();
            switch (op) {
                case 1:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            cadastrarCoordenador();
                            break;
                        
                        case 2:
                            cadastrarDesenvolvedor();
                            break;

                        case 3:
                            cadastrarAssistente();
                            break;
                    
                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 2:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            removerCoordenador();
                            break;
                        
                        case 2:
                            removerDesenvolvedor();
                            break;

                        case 3:
                            removerAssistente();
                            break;
                    
                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 3:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            listarCoordenador();
                            break;
                        
                        case 2:
                            listarDesenvolvedor();
                            break;

                        case 3:
                            listarAssistente();
                            break;
                    
                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 4:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            buscarCoordenador();
                            break;
                        
                        case 2:
                            buscarDesenvolvedor();
                            break;

                        case 3:
                            buscarAssistente();
                            break;
                    
                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 5:
                    listarCoordenador();
                    listarDesenvolvedor();
                    listarAssistente();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println(mensagemDefault());
                    break;
            }
                
        } while (op != 0);
    }
}
