package bus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusManager {
    private List<LineaBus> lineas;

    public BusManager(){
        this.lineas = new ArrayList<>();
    }
    
    public void datosLinea(int id) {
        LineaBus linea = lineas.get(id-1);

        System.out.println("\n-------------------------------------\n");
        System.out.println("Datos de la línea:\n");
        System.out.println("ID: " + linea.getId());
        System.out.println("Número de paradas: " + linea.getNumParadas());
        System.out.println("Paradas: " + linea.getParadas().toString());
        System.out.println("\n-------------------------------------");
    }

    public void listaLineas() {
        System.out.println("\nMostrar líneas de bus >\n");
        System.out.println("\n-------------------------------------");
        System.out.printf("%-9s%-18s", "Linea ID:", "Número de paradas:");
        System.out.println("-------------------------------------\n");
            for (LineaBus linea : lineas) {
                System.out.printf("%-9s%-18s", linea.getId(), linea.getNumParadas());
            }
        System.out.println("\n\n-------------------------------------");
    }

    public void clear() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public void showMenu() {
        String menu= "\n\t=========================================\n";
                menu+= "\t|                                       |\n";
                menu+= "\t|    <------> BusManager <------>       |\n";
                menu+= "\t|                                       |\n";
                menu+= "\t=========================================\n";
                menu+= "\t|                                       |\n";
                menu+= "\t|   1 -> Listar líneas de autobús:      |\n";
                menu+= "\t|   2 -> Mostrar línea:                 |\n";
                menu+= "\t|   3 -> Fin.                           |\n";
                menu+= "\t|                                       |\n";
                menu+= "\t=========================================\n\n";
                menu+= "Escoja una opción > ";
        System.out.print(menu);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        final int listarLineas = 1;
        final int mostrarLinea = 2;
        final int fin = 3;

        BusManager bus = new BusManager();
        int entrada = 0;

        while(entrada != fin) {
            bus.clear();
            bus.showMenu();
            entrada = cin.nextInt();
            cin.nextLine();

            switch (entrada) {
                case listarLineas:
                    bus.listaLineas();
                    break;
                
                case mostrarLinea:
                    bus.clear();
                    System.out.println("\nMostrar info línea de bus >\n");
                    System.out.println("\nIntroduzca la ID de la línea de bus: ");
                    int id = cin.nextInt();
                    cin.nextLine();
                    bus.datosLinea(id);
                    break;
                
                case fin:
                    return;
                
                default:
                    break;
            }
        }
    }
}
