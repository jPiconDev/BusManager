package bus;

import java.util.List;

public class LineaBus {
    private int id;
    private int numParadas;
    private List<Parada> paradas;
    
    public int getId() { return id; }
    
    public int getNumParadas() { return numParadas; }
    
    public List<Parada> getParadas() { return paradas; }
    
}
