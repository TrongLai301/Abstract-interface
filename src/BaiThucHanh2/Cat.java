package BaiThucHanh2;

import BaiThucHanh1.Animal;
import BaiThucHanh1.Edible.Edible;

public class Cat extends Animal implements Edible {
    @Override
    public String howToEat(){
        return "Could't eat, they are friends";
    }
    @Override
    public String makeSound(){
        return "Cat: meow...meow..!!!";
    }
}
