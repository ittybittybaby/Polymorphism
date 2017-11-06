package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Falcon;
import io.zipcoder.pets.Dog;
import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    String catName = "Mr. Mittens";
    String dogName = "Dog Jr.";
    String falconName = "Falco";

    Cat kitty = new Cat(catName);
    Dog puppy = new Dog(dogName);
    Falcon peregrine = new Falcon(falconName);

    @Test
    public void getNameTest() {
        String expected = catName;

        String actual = kitty.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Dr, Chaos";

        puppy.setName(expected);

        String actual = puppy.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        peregrine.speak();
    }

}
