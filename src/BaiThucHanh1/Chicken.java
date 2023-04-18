package BaiThucHanh1;

import BaiThucHanh1.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chip chip...!";
    }
    @Override
    public String howToEat(){
        return "could be boil";
    }
}
