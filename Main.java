import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
    //All Images
    PImage PokeBall;

    //All vars
    //Hp Bars
    int HpBar1, HpBar2;
    //Speed For Text and Rect
    int speedFightText, speedFightRec;

    //speed for Hp bar
    int speedHpBar1;
    int speedHpBar2;

    //Am Stuff
    int fightTextXValue, fightRectXValue, fightTextYValue, fightRectYValue;


    String StartingText;


    //PokeBall Am

    int pokeBallSpeedX, pokeBallSpeedY, pokeBallX, pokeBallY;

    public void settings(){
        size(600,600);
    }
    public void setup(){



        PokeBall = loadImage("PokeBall.png");

        HpBar1 = 100;
        HpBar2 = 100;
        speedFightRec = 2;
        speedFightText = 2;

        //Text Am
        fightTextXValue = 650;
        fightTextYValue = 500;
        //TextRect Am
        fightRectXValue = 650;
        fightRectYValue = 450;

        StartingText = "A Wild Pokemon has appeared";

        //PokeBall x and y
        pokeBallSpeedX = 3;
        pokeBallSpeedY = 5;
        pokeBallX = -10;
        pokeBallY = 606;


    }
    public void draw(){


        background(180);
        PokeBall.resize(60,60);
        textSize(20);
        text(StartingText, 150, 500);

        //PokeBall stuff

        image(PokeBall, pokeBallX, pokeBallY);

        pokeBallX = pokeBallX + pokeBallSpeedX;
        pokeBallY = pokeBallY - pokeBallSpeedY;

        //PokeBall Am
        if (pokeBallX >= 350){
            background(180);
            pokeBallSpeedX = 0;
            pokeBallSpeedY = 0;

        }
        if (pokeBallY <= 250){
            background(180);
            pokeBallSpeedY = 0;
            pokeBallSpeedX = 0;
        }


        //FightRect Stuff
        fill(180);
        rect(fightRectXValue, fightRectYValue, 200, 60);

        //Fight Text Stuff
        textSize(55);
        fill(0);
        text("Fight", fightTextXValue,fightTextYValue);

        fightRectXValue = fightTextXValue - speedFightRec;
        fightTextXValue = fightTextXValue - speedFightText;

        //Am of the Fight Button
        if (fightTextXValue <= 450){
            speedFightText = 0;
        }
        if (fightTextXValue <= 450){
            speedFightRec = 0;
            StartingText = " ";
        }




        //HP1 Stuff

        textSize(25);
        text("HP: "+HpBar1, 450, 560);



    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
