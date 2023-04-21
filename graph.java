import java.util.ArrayList;
import java.awt.Color;
import java.lang.Math;
import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.*;

public class graph extends Thread{

    public static access ob1=new access();
    public static Gui ob=new Gui();
    public static double cp=0;
    
    public static void plotpointd(int x,int y){
         for(int i=y;i<630;i++){
            ob.l2=new JLabel(".");
            ob.l2.setText(".");
            ob.c.add(ob.l2);
            ob.l2.setBounds(x,i,80,80);
            ob.l2.setFont(new Font("MV Boli",Font.BOLD,40));
            ob.l2.setForeground(Color.GREEN);
         }
    }

    public static void plotLine(){
        double max=Math.max(ob1.lop,ob1.lcp)+100;
        double difference=(Math.abs(ob1.lop-ob1.lcp)+100)/25;
        int y=40;
        for(int x=0;x<30;x++){
            String str=Double.toString(max);
            ob.label9=new JLabel(str);
            ob.c.add(ob.label9);
            ob.label9.setBounds(30,y,80,80);
            ob.label9.setFont(new Font("MV Boli",Font.BOLD,20));
            ob.label9.setForeground(Color.GREEN);
            max-=difference;
            y+=20;
        }
        y=40;
        int x=40;
        for(int i=0;i<125;i++){
            ob.label10=new JLabel(".");
            ob.c.add(ob.label10);
            ob.label10.setBounds(100,y,80,80);
            ob.label10.setForeground(Color.RED);
            ob.label10.setFont(new Font("MV Boli",Font.BOLD,60));
            ob.label11=new JLabel(".");
            ob.c.add(ob.label11);
            ob.label11.setBounds(60+x,640,80,80);
            ob.label11.setForeground(Color.BLUE);
            ob.label11.setFont(new Font("MV Boli",Font.BOLD,60));
            y+=5;
            x+=7;
        }
    }

    public static void plot(){
        int xy=120;
        plotLine();
        while(true){
            double d=ob1.cp+Math.random()*100;
            DecimalFormat df=new DecimalFormat("##.##");
            String str=df.format(d);
            d=Double.parseDouble(str);
            for(int x=0;x<49;x++){
                ob1.price.set(x,ob1.price.get(x+1));
            }
            ob1.price.remove(49);
            ob1.price.add(d);
            System.out.println(ob1.price);
            if(ob1.price.get(49)<Math.min(ob1.lop,ob1.lcp)+Math.abs((ob1.lop-ob1.lcp+100)/2 ) && cp==0){
                ob.label8.setText("Buying the stock");
                cp=d;
            }
            else if(ob1.price.get(49)>Math.min(ob1.lop,ob1.lcp)+Math.abs((ob1.lop-ob1.lcp+100)/2 ) && cp!=0){
                ob.label8.setText("Selling the stock");
                cp=0;
            }
            else{
                ob.label8.setText("Wait");
            }
            ob.label3.setText(Double.toString(d));
            ob.l1=new JLabel(".");
            ob.c.add(ob.l1);
            ob.l1.setBounds(xy,630-(int)(Math.abs(d-46.7)*5),80,80);
            plotpointd(xy,630-(int)(Math.abs(d-46.7)*5));
            xy+=8;
            ob.l1.setFont(new Font("MV Boli",Font.BOLD,40));
            ob.l1.setForeground(Color.GREEN);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}