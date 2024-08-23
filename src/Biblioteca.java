import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
public class Biblioteca {

    public ArrayList<ItemBibliografico> itens = new ArrayList<ItemBibliografico>();

    public void adicionarItem(ItemBibliografico item) {
        itens.add(item);
    }

    public ArrayList<ItemBibliografico> listarItens(){
        return itens;
    }
    public ItemBibliografico buscarPorCodigo(String codigo){

     ItemBibliografico libaryItem = null;
     for(int i = 0; i < itens.size(); i++){
          ItemBibliografico itemBibliografico = itens.get(i);
          if (itemBibliografico.getcodigo() == codigo){
              libaryItem = itemBibliografico;
          }
     }

     return libaryItem;
    }

    @Override
    public String toString() {
        String Biblioteca = new String();
        return "Biblioteca:" + Biblioteca + " itens , " +itens;
    }
}

