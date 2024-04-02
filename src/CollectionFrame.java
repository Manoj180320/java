import java.util.*;
public class CollectionFrame {
    public static void main(String[] args) {
       ArrayList<String> list=new ArrayList<String>();
        list.add("Pankaj");
        list.add("Sambit");
        list.add("Soumya");
        list.remove("Pankaj");
        list.add(2,"Akash");
        System.out.println("ArrayList:"+list);
        list.set(2,"Yas");
        String sr= list.get(2);
        System.out.println(list.size());
        System.out.println(sr);
        Collections.sort(list);
        Iterator itr=list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("10");
        list2.add("30");
        list2.add("90");
        list2.add("20");
        list2.add("40");
        Collections.sort(list2);
        for (int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }
        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
    }

}
