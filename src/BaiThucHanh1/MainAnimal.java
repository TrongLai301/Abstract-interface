package BaiThucHanh1;

import BaiThucHanh1.Edible.Edible;

public class MainAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animalCheck: animals
             ) {
            System.out.println(animalCheck.makeSound());

            if(animalCheck instanceof Tiger){
                Edible edible= (Tiger) animalCheck ;
                System.out.println(edible.howToEat());
            }
            if(animalCheck instanceof Chicken){
                Edible edible= (Chicken) animalCheck ;
                System.out.println(edible.howToEat());
            }
        }

    }
}
