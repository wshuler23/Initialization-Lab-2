package Shuler.Willie.InitializationLab2;


/**
 * Created by willieshuler on 9/11/16.
 */
public class ThingContainer {

    ColorfulThing[] colorfulThings;


    public ThingContainer(int sizeofArray) {


        colorfulThings = new ColorfulThing[sizeofArray];

    }

    public void add(ColorfulThing addCT) {

        for (int i = 0; i < colorfulThings.length; i++) {

            if (colorfulThings[i] == null) {

                colorfulThings[i] = addCT;

                return;
            }
        }
        System.out.println("Array is full.");
    }

    public ColorfulThing[] getColorfulThings() {
        return colorfulThings;
    }

    public void setColorfulThings(ColorfulThing[] colorfulThings) {
        this.colorfulThings = colorfulThings;
    }

    public void printThings() {

        for (int i = 0; i < colorfulThings.length; i++) {

            if (colorfulThings[i] != null){

            System.out.println(colorfulThings[i].getColor());
        }
        }
        System.out.println("\n");
    }

    public ColorfulThing pop() {
        int i;
        ColorfulThing temp = colorfulThings[colorfulThings.length - 1]; //why redundant


        for (i = colorfulThings.length - 1; i >= 0; i--) {

            if (colorfulThings[i] != null) {

                temp = colorfulThings[i];
                colorfulThings[i] = null;
                return temp;
            }
        }
        return null;
    }
//Remove the first element of that color from the array and return it
    public void remove(){




    }
}