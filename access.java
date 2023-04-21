import java.net.URL;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class access {
    public static URL url;
    public static Scanner sc;
    public static StringBuffer sb;
    public static String str1="Therangebetweenthehighandlowpricesoverthepastday</div></span><divclass=\"P6K39c\">$";
    public static double cp=0,lcp=0,lop=0,pp=0;
    public static ArrayList<Double> price=new ArrayList<Double>();
    public static void grant(){
        Gui ob=new Gui();
        try{
            url = new URL("https://www.google.com/finance/quote/KO:NYSE?hl=en");
             sc=new Scanner(url.openStream());
            StringBuffer sb=new StringBuffer();
            while(sc.hasNext()){
                sb.append(sc.next());
            }
            try{
                lop=Double.parseDouble(sb.substring(sb.indexOf(str1)+str1.length(),sb.indexOf(str1)+str1.length()+5));
                ob.label5.setText(Double.toString(lop));    
            }catch(Exception e){
                e.printStackTrace();}
                try{
                lcp=Double.parseDouble(sb.substring(sb.indexOf(str1)+str1.length()+7,sb.indexOf(str1)+str1.length()+12));
                ob.label7.setText(Double.toString(lcp));
            }catch(Exception e){
                e.printStackTrace();}
                try{
                cp=Double.parseDouble(sb.substring(sb.indexOf("data-last-price=")+17,sb.indexOf("data-last-price=")+22));
                ob.label3.setText(Double.toString(cp));}catch(Exception e){
                    e.printStackTrace();
                }
           }catch(Exception e){
            System.out.println("Error");
        }
        }
        public static void store(){
            for(int i=0;i<50;i++){
                double d=cp+Math.random()*100;
                DecimalFormat df=new DecimalFormat("##.###");
                String str=df.format(d);
                d=Double.parseDouble(str);
                price.add(d);
            }
    }
}
