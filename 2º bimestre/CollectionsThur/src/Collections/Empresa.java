package Collections;

import java.util.ArrayList;
import java.util.List;

public class Empresa{
    List<Item> item = new ArrayList<Item>();

    public Empresa(List<Item> item) {
        this.item = item;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public void addItem(Item i){
        item.add(i);
    }

    public static void listarItens(){

    }

    public static void comercializarItem(Long item){

    }
}
