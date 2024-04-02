public class StringBuild {
    public static void main(String[] args) {
        String Name="PankajMC";
        String Name1="PankajMC";
        System.out.println("Name:"+Name);
        System.out.println(Name==Name1);
        String NewName=new String("SambitMC");
        System.out.println("Name:"+NewName);
        String NewName1=new String("SambitMC");
        System.out.println(NewName1==NewName);
        StringBuffer sb=new StringBuffer("Hello StringBuffer");
        System.out.println(sb);
        sb.append(" welcome bro");
        System.out.println(sb.toString());
    }
}


