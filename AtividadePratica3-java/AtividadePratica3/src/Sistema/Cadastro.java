package Sistema;

import ClasseAbstrata.Assistente;
import ClasseAbstrata.Coordenador;
import ClasseAbstrata.Desenvolvedor;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    
    private static List<Coordenador> listaCoordenador = new ArrayList<>();
    private static List<Desenvolvedor> listaDesenvolvedor = new ArrayList<>();
    private static List<Assistente> listaAssistente= new ArrayList<>();

    public static void cadastrarDesenvolvedor(Desenvolvedor desenvolvedor){
        listaDesenvolvedor.add(desenvolvedor);
    }

    public static void cadastrarCoordenador(Coordenador coordenador){
        listaCoordenador.add(coordenador);
    }

    public static void cadastrarAssistente(Assistente assistente){
        listaAssistente.add(assistente);
    }

    public static boolean removerDesenvolvedor(int matricula){
         for (Desenvolvedor temp : listaDesenvolvedor) {
            if(temp.getMatricula() == matricula) {
                listaDesenvolvedor.remove(temp);
                return true;
            }
        }
        return false;
    }
    public static boolean removerCoordenador(int matricula){
        for (Coordenador temp : listaCoordenador) {
           if(temp.getMatricula() == matricula) {
               listaCoordenador.remove(temp);
             return true;
           }
       }
       return false;
   }

   public static boolean removerAssistente(int matricula){
    for (Assistente temp : listaAssistente) {
       if(temp.getMatricula() == matricula) {
           listaAssistente.remove(temp);
           return true;
       }
   }
   return false;
}

    public static List<Assistente> getListaAssistente() {
        return listaAssistente;
    }

    public static List<Desenvolvedor> getListaDesenvolvedor() {
        return listaDesenvolvedor;
    }

    public static List<Coordenador> getListaCoordenador() { 
        return listaCoordenador;
    }

    public static Assistente buscarAssistente(int matricula){
        for (Assistente temp : listaAssistente) {
            if (temp.getMatricula() == matricula){
                return temp;
            }
        }
        return null;
    }

    public static Desenvolvedor buscarDesenvolvedor(int matricula){
        for (Desenvolvedor temp : listaDesenvolvedor) {
            if (temp.getMatricula() == matricula){
                return temp;
            }
        }
        return null;
    }

    public static Coordenador buscarCoordenador(int matricula){
        for (Coordenador temp : listaCoordenador) {
            if (temp.getMatricula() == matricula){
                return temp;
            }
        }
        return null;
    }
}
