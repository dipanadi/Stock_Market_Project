public class Main {
    public static void main(String str[]){
        Gui g=new Gui();
        g.frame(0,40);
        access a=new access();
        a.grant();
        a.store();
        graph gp=new graph();
        gp.plot();
    }
}
