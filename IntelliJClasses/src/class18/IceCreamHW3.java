package class18;

public class IceCreamHW3 {
    /*
    Write a program  that will have 4 different access levels of constructors
    and create 3 objects of this class: 1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result
     */

    String flavor;
    String color;
    String texture;

    public IceCreamHW3(String flavorOfIC,String colorOfIC,String textureOfIC){
        flavor=flavorOfIC;
        color=colorOfIC;
        texture=textureOfIC;
    }

   public IceCreamHW3(String flavorOfIC, String colorOfIC){
        flavor=flavorOfIC;
        color=colorOfIC;
        texture="n/a";
    }

   public IceCreamHW3(String flavorOfIC){
        flavor=flavorOfIC;
        color="unknown";
        texture="n/a";
    }

    public IceCreamHW3(){
        flavor="unknown";
        color="unknown";
        texture="unknown";
    }

    public static void main(String[] args) {
        IceCreamHW3 icecream1=new IceCreamHW3();

    }


}
