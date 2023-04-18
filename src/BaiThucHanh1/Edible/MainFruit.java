package BaiThucHanh1.Edible;

import BaiThucHanh1.Apple;
import BaiThucHanh1.Fruit;
import BaiThucHanh1.Orange;

public class MainFruit {
    public static void main(String[] args) {
        Fruit[] fruits= new Fruit[2];
        fruits[0]= new Apple();
        fruits[1]= new Orange();
        for (Fruit fruitCheck:
             fruits) {
            System.out.println(fruitCheck.howToEat());
        }
    }
}
