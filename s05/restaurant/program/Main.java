package s05.restaurant.program;

import s05.restaurant.clase.Masa;
import s05.restaurant.clase.Restaurant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = Restaurant.getInstance();
        Restaurant restaurant2 = Restaurant.getInstance();

        if(restaurant1 == restaurant2)
            System.out.println("Obj sunt identince");
        else
            System.out.println("Obj nu-s indentice");


        restaurant1.addMasa(new Masa(1,2,true,true));
        restaurant1.addMasa(new Masa(2,4,true,true));
        restaurant1.addMasa(new Masa(3,5,true,true));
        restaurant1.addMasa(new Masa(4,8,true,true));
        restaurant2.addMasa(new Masa(5,3,false,true));
        restaurant2.addMasa(new Masa(6,3,false,false));
        restaurant2.addMasa(new Masa(7,3,false,false));


        System.out.println(restaurant1);
        System.out.println(restaurant1.getMasaLibera(3,true));
    }
}