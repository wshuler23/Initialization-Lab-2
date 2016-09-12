package Shuler.Willie.InitializationLab2;

/**
 * Created by willieshuler on 9/11/16.
 */
public class ColorfulThing {

    public Color getColor() {
        return color;
    }

    public ColorfulThing(){

    }

    public void setColor(Color color) {
        this.color = color;
    }

    Color color;

    public ColorfulThing(Color color){

        this.color = color;
    }

    public enum Color {GREEN,RED,BLACK,BLUE,GREY}

}

