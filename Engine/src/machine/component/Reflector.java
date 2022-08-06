package machine.component;

import java.util.ArrayList;

public class Reflector {

    private int id;
    private ArrayList<Integer> mapping;


    /**
     * constructor for Reflector
     * @param id the unique id of the rotor
     * @param mapping a mapping that connects pairs of entries in the reflector
     */
    public Reflector(int id, ArrayList<Integer> mapping) {
        this.id = id;
        this.mapping = mapping;
    }


    /**
     *
     * @return the unique id of the rotor
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param inputIndex an index of one entry
     * @return the index of the matching entry
     */
    public int reflect(int inputIndex) {
        return mapping.get(inputIndex);
    }



    @Override
    public String toString() {
        return "Reflector{" +
                "id=" + id +
                '}';
    }
}