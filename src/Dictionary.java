import java.util.*;

/**
 * Created by yablanch on 22/04/2016.
 */
public class Dictionary {
    private String name;
    //private Map<String,String> listMot = new HashMap<>();
    private Map<String,List<String>> listMot = new HashMap<>();
    private List<String> listTrad;

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

    /*public List getTranslation(String word){
        return listMot.get(word);
    }
*/
    public String getMultipleTranslation(String word){
        String res = "";
        for(int i=0; i<listMot.get(word).size(); i++) {
            res = res + listMot.get(word).get(i) + ",";
        }
        return res;
    }


    public void addTranslation(String fr, String trad){
        List<String> listTrad;
        if(listMot.get(fr) != null) {
            //listTrad = getTranslationArray(fr);
            if(listMot.get(fr)!=null){
                listTrad = listMot.get(fr);
            }
            else{
                listTrad = null;
            }

            listTrad.add(trad);
        }
        else {
            listTrad = new ArrayList();
            listTrad.add(trad);
            listMot.put(fr,listTrad);
        }
    }

    public String getInverseTranslation(String en){
        String fr ="";
        Iterator iterator = listMot.keySet().iterator();
        if(listMot != null) {

            while (iterator.hasNext()){
                fr = (String)iterator.next();
                for (String value : listMot.get(fr)) {
                    if(value.equals(en)){
                        break;
                    }
                }
            }
        }
        return fr;
    }

}
