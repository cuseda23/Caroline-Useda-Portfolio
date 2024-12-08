import java.awt.*;

// Final project for COSC 111: Introduction to Computer Science
// Project is an interactive trivia game

public class Project{
    public static void main(String[] args) {
        //sets start screen
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(0, 1);
        StdDraw.setPenColor(Color.magenta);
        StdDraw.filledRectangle(.5,.5,.5,.5);
        StdDraw.setPenColor(Color.white);
        StdDraw.filledRectangle(.5,.5,.4,.4);
        StdDraw.setPenColor(Color.black);
        Font font;
        font = new Font("Arial", Font.BOLD, 14) ;
        StdDraw.setFont(font);
        String player = args[0];
        StdDraw.text(.5,.55,"TRIVIA CRACK");
        StdDraw.text(.5,.35, "PRESS SPACEBAR TO START");
        StdDraw.text(.25,.915,"Player name: "+ player);
        StdDraw.rectangle(.5,.5,.4,.4);
        StdDraw.setPenColor(Color.pink);
        StdDraw.text(.502,.348, "PRESS SPACEBAR TO START");
        StdDraw.text(.502,.548, "TRIVIA CRACK");
        StdDraw.text(.252,.913,"Player name: "+ player);
        StdDraw.show();
        //displays rules when spacebar is pressed
        while(true) {
            if (StdDraw.isKeyPressed(java.awt.event.KeyEvent.VK_SPACE)) {
                displayRules();
                break;
            }
        }
        StdDraw.show();

        //main loop that runs game
        Questions qs = new Questions();
        int points =0;
        for (int j = 0; j < 500 && points <10; j++) {
                //spin wheel and select category, then clear screen
                int c = spinWheel();
                //display result of spin
            if(c==0){
                StdDraw.text(.5,.25, "ART");
                StdDraw.show();
            }
            if(c==1){
                StdDraw.text(.5,.25, "ENTERTAINMENT");
                StdDraw.show();
            }
            if(c==2){
                StdDraw.text(.5,.25, "SCIENCE");
                StdDraw.show();
            }
            if(c==3){
                StdDraw.text(.5,.25, "SPORTS");
                StdDraw.show();
            }
            if(c==4){
                StdDraw.text(.5,.25, "GEOGRAPHY");
                StdDraw.show();
            }
            if(c==5){
                StdDraw.text(.5,.25, "HISTORY");
                StdDraw.show();
            }
            StdDraw.pause(2000);
            //selects random question
                int n = (int) (Math.random() * 10);//random q from category selected
                //make it so same # cant be picked twice
            while(qs.wasAsked(c,n)) {
                n = (int) (Math.random() * 10);
            }
                qs.getQuestion(c, n);
            //registers answer when key is pressed, and then checks to see if answer is correct
                while(true) {
                    if (StdDraw.isKeyPressed(java.awt.event.KeyEvent.VK_A)) {
                        String guess = "a";
                        boolean correct = qs.checkAnswer(c, n, guess);
                        if (correct){
                            points++;
                        }
                        break;
                    }
                    if (StdDraw.isKeyPressed(java.awt.event.KeyEvent.VK_B)) {
                        String guess = "b";
                        boolean correct = qs.checkAnswer(c, n, guess);
                        if (correct){
                            points++;
                        }
                        break;
                    }
                    if (StdDraw.isKeyPressed(java.awt.event.KeyEvent.VK_C)) {
                        String guess = "c";
                        boolean correct = qs.checkAnswer(c, n, guess);
                        if (correct){
                            points++;
                        }
                        break;
                    }
                    if (StdDraw.isKeyPressed(java.awt.event.KeyEvent.VK_D)) {
                        String guess = "d";
                        boolean correct = qs.checkAnswer(c, n, guess);
                        if (correct){
                            points++;
                        }
                        break;
                    }
                }
                //show number of points
                StdDraw.setPenColor(Color.black);
            StdDraw.text(.8,.915, "Points:"+ points );
            StdDraw.setPenColor(Color.pink);
            StdDraw.text(.802,.913, "Points:"+ points );
            StdDraw.show();
            }
        //display screen when Game is over
        StdDraw.clear();
        StdDraw.setPenColor(Color.magenta);
        StdDraw.filledRectangle(.5,.5,.5,.5);
        StdDraw.setPenColor(Color.white);
        StdDraw.filledRectangle(.5,.5,.4,.4);
        StdDraw.setPenColor(Color.black);
        StdDraw.rectangle(.5,.5,.4,.4);
        StdDraw.text(.5,.55, "GAME OVER!");
        StdDraw.text(.5,.35,"YOU WON!");
        StdDraw.setPenColor(Color.pink);
        StdDraw.text(.502,.548,"GAME OVER!");
        StdDraw.text(.502,.348,"YOU WON!");
        StdDraw.setPenColor(Color.black);
        StdDraw.text(.8,.915, "Points:"+ points );
        StdDraw.setPenColor(Color.pink);
        StdDraw.text(.802,.913, "Points:"+ points );
        StdDraw.show();
        }

    public static int spinWheel(){
        //method that spins wheel, selects category, and returns category
        StdDraw.clear();
        //activates wheel when mouse is no longer pressed
            while(!StdDraw.isMousePressed()){
                //do nothing
            }
            double []x = new double [6];
            x[0] = 0;
            x[1]=.2;
            x[2]=.4;
            x[3]=.6;
            x[4]=.8;
            x[5]=1;
            double vx = .05;
            while (true) {
                StdDraw.clear();
                x[0] += vx;
                if (x[0] > 1.2) {
                    x[0] = 0;
                }
                x[1] += vx;
                if (x[1] > 1.2) {
                    x[1] = 0;
                }
                x[2] += vx;
                if (x[2] > 1.2) {
                    x[2] = 0;
                }
                x[3] += vx;
                if (x[3] > 1.2) {
                    x[3] = 0;
                }
                x[4] += vx;
                if (x[4] > 1.2) {
                    x[4] = 0;
                }
                x[5] += vx;
                if (x[5] > 1.2) {
                    x[5] = 0;
                }
                StdDraw.setPenColor(Color.magenta);
                StdDraw.filledRectangle(.5,.5,.5,.5);
                StdDraw.setPenColor(Color.cyan);
                StdDraw.filledSquare(x[0], .5, .1);//1
                StdDraw.setPenColor(Color.black);
                StdDraw.square(x[0], .5, .1);
                StdDraw.setPenColor(Color.blue);
                StdDraw.filledSquare(x[1], .5, .1);//2
                StdDraw.setPenColor(Color.black);
                StdDraw.square(x[1], .5, .1);
                StdDraw.setPenColor(Color.green);
                StdDraw.filledSquare(x[2], .5, .1);//3
                StdDraw.setPenColor(Color.black);
                StdDraw.square(x[2], .5, .1);
                StdDraw.setPenColor(Color.red);
                StdDraw.filledSquare(x[3], .5, .1);//4
                StdDraw.setPenColor(Color.black);
                StdDraw.square(x[3], .5, .1);
                StdDraw.setPenColor(Color.orange);
                StdDraw.filledSquare(x[4], .5, .1);//5
                StdDraw.setPenColor(Color.black);
                StdDraw.square(x[4], .5, .1);
                StdDraw.setPenColor(Color.pink);
                StdDraw.filledSquare(x[5], .5, .1);//6
                StdDraw.setPenColor(Color.black);
                StdDraw.square(x[5], .5, .1);
                StdDraw.show();
                StdDraw.pause(20);
                if (StdDraw.isMousePressed() == false) {
                    break;
                }
            }
            //use array of x positions to determine which category (rectangle) is closest to middle
        int minindex =0;
            for(int i=1; i<6; i++){
                if(Math.abs(x[i]-0.5)<Math.abs(x[minindex]-0.5)){
                    minindex =i;
                }
            }
            return minindex;
            //returns category
        }
        public static void displayRules(){
        //method that draws rules screen
            StdDraw.clear();
            StdDraw.setPenColor(Color.magenta);
            StdDraw.filledRectangle(.5,.5,.5,.5);
            StdDraw.setPenColor(Color.black);
            StdDraw.rectangle(.5,.5,.4,.4);
            StdDraw.setPenColor(Color.white);
            StdDraw.filledRectangle(.5,.5,.4,.4);
            StdDraw.setPenColor(Color.black);
            StdDraw.text(.5, .75, "Rules");
            StdDraw.text(.5, .65, "1. Hold down the mouse to spin the wheel.");
            StdDraw.text(.5, .6, "You will land on a color corresponding to one of the 6");
            StdDraw.text(.5, .55,  "categories: Art, Entertainment, Science, Geography, or ");
            StdDraw.text(.5, .5, "History. You will then recieve a question");
            StdDraw.text(.5, .4, "2. Use your keyboard to pick a multiple choice answer.");
            StdDraw.text(.5, .35, "A correct answer is 1 point. You need 10 points to win.");
            StdDraw.text(.5, .23, "HOLD DOWN MOUSE TO START");
            StdDraw.setPenColor(Color.pink);
            StdDraw.text(.502, .748, "Rules");
            StdDraw.text(.502, .648, "1. Hold down the mouse to spin the wheel.");
            StdDraw.text(.502, .598, "You will land on a color corresponding to one of the 6");
            StdDraw.text(.502, .548,  "categories: Art, Entertainment, Science, Geography, or ");
            StdDraw.text(.502, .498, "History. You will then recieve a question");
            StdDraw.text(.502, .398, "2. Use your keyboard to pick a multiple choice answer.");
            StdDraw.text(.502, .348, "A correct answer is 1 point. You need 10 points to win.");
            StdDraw.text(.502, .228, "HOLD DOWN MOUSE TO START");
            StdDraw.show();
        }
    }


