import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yablanch on 22/04/2016.
 */
public class Dictionary {
    private String name;
    private Map<String,String> listMot = new HashMap<>();


    public Dictionary() {
    }

    public Dictionary(String name) {
        this.name = name;
    }

    public String getName() {
        return "Example";
    }

    public boolean isEmpty(){
        return listMot.size() == 0?true:false;
    }

    public String getTranslation(String word){
        return listMot.get(word);
    }

    public void addTranslation(String fr,String en){
        listMot.put(fr,en);
    }

}
