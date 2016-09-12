package Shuler.Willie.InitializationLab2;

/**
 * Created by willieshuler on 9/11/16.
 */
public class InitializationLab2 {

    InitializationLab2 ilb2 = new InitializationLab2();


    public static void main(String[] args) {
        ThingContainer thingContainer1 = new ThingContainer(5);
        ThingContainer thingContainer2 = new ThingContainer(5);
        ThingContainer thingContainer3 = new ThingContainer(8);

        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.BLACK);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing3 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing colorfulThing4 = new ColorfulThing(ColorfulThing.Color.GREY);
        ColorfulThing colorfulThing5 = new ColorfulThing(ColorfulThing.Color.RED);

        thingContainer1.add(colorfulThing1);
        thingContainer1.add(colorfulThing2);
        thingContainer1.add(colorfulThing3);
        thingContainer1.add(colorfulThing4);
        thingContainer1.add(colorfulThing5);

        thingContainer2.add(colorfulThing1);
        thingContainer2.add(colorfulThing2);
        thingContainer2.add(colorfulThing3);
        thingContainer2.add(colorfulThing4);
        thingContainer2.add(colorfulThing5);

        thingContainer3.add(colorfulThing1);
        thingContainer3.add(colorfulThing2);
        thingContainer3.add(colorfulThing3);
        thingContainer3.add(colorfulThing4);
        thingContainer3.add(colorfulThing5);



        thingContainer1.printThings();
//        thingContainer2.printThings();
//        thingContainer3.printThings();

        thingContainer1.pop();
        thingContainer1.printThings();


    }
}
