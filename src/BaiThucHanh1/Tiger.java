package BaiThucHanh1;

import BaiThucHanh1.Edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: Graooooooo.......!!!!!";
    }
    @Override
    public String howToEat(){
        return "Could be fried";
    }
}
