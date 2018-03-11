package Human;

import Animal.Air.Bird;
import Animal.Dog;


public class Trainer {
    public void teach(Dog dog) {
        dog.name = "Pet";
        dog.bark();
    }

    public void feed(Bird bird){

    }

    public void play(Dog dog) {
        dog.wagTail();

    }

}
