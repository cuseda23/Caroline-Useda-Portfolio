import java.awt.*;

public class Questions {
    private String[][] q = new String[6][10];
    private String[][] a = new String[6][10];

    public Questions() {
        //stores questions and answers in two arrays
        //setting values for art questions
        q[0][0] = "What important piece of art was stolen and kept under a bed until it was returned to the Louvre Museum?\n " +
                "a. Death of the Virgin\n " +
                "b. The Coronation of Napoleon\n " +
                "c. Mona Lisa\n " +
                "d. St. John the Baptist\n ";
        a[0][0] = "c";//Mona Lisa
        q[0][1] = "Question: Who wrote the novel Dracula?\n " +
                "a. Mary Shelley \n " +
                "b. Bram Stoker\n " +
                "c. Victor Hugo\n " +
                "d. William Shakespeare\n ";
        a[0][1] = "b";//Bram Stoker
        q[0][2] = "Question: Where did medieval theatre originate?\n " +
                "a. Churches\n " +
                "b. Hostels\n " +
                "c. Courts\n " +
                "d. Palaces\n ";
        a[0][2] = "a"; //Churches
        q[0][3] = "Question: How many letters are in the English Alphabet?\n " +
                "a. 22\n " +
                "b. 23\n " +
                "c. 25\n " +
                "d. 26\n ";
        a[0][3] = "d"; //26
        q[0][4] = "Question: In what novel is Holden Caulfield the main character?\n " +
                "a. Macbeth\n " +
                "b. Brave new world\n " +
                "c. The Catcher in the Rye\n " +
                "d. The Help\n ";
        a[0][4] = "c"; //The Catcher in the Rye
        q[0][5] = "Question: Which of these is a three-stringed musical instrument?\n " +
                "a. Violin\n " +
                "b. Balalaika\n " +
                "c. Guzheng\n " +
                "d. Mandolin\n ";
        a[0][5] = "b";// Balalaika
        q[0][6] = "Question: Who is Apollo’s twin?\n " +
                "a. Athena\n " +
                "b. Aphrodite\n " +
                "c. Artemis\n " +
                "d. Achilles\n ";
        a[0][6] = "c"; //Artemis
        q[0][7] = "Question: What kinds of plants did Monet paint?\n " +
                "a. Cacti\n " +
                "b. Marigolds\n " +
                "c. Hibiscus\n " +
                "d. Water lilies\n ";
        a[0][7] = "d";//water lilies
        q[0][8] = "Question: What singer is considered the ‘Queen of Soul’?\n " +
                "a. Aretha Franklin\n " +
                "b. Jennifer Hudson\n " +
                "c. Whitney Houston\n " +
                "d. Loretta Lynn\n ";
        a[0][8] = "a";//aretha franklin
        q[0][9] = "Question: Which of the following is not one of the Seven Wonders of the Ancient World?\n " +
                "a. Taj Mahal\n" +
                "b. The Colosseum in Rome\n " +
                "c. Great Wall of China\n " +
                "d. Christ the Redeemer\n ";
        a[0][9] = "a"; //colosseum in rome
        //questions for entertainment
        q[1][0] = "Question: The 2014 film Maleficent is based on which story?\n " +
                "a. Snow White\n " +
                "b. Sleeping Beauty\n " +
                "c. Beauty and the Beast\n " +
                "d. Cinderella\n ";
        a[1][0] = "b"; //sleeping beauty
        q[1][1] = "Question: In the title of the Beatles album, to which club do Sergeant Pepper’s band members belong?\n " +
                "a. Fight Club\n " +
                "b. New World\n " +
                "c. Lonely Hearts\n " +
                "d. Anti-war\n ";
        a[1][1] = "c";//lonely hearts
        q[1][2] = "Question: Who played Frodo Baggins in Lord Of The Rings?\n " +
                "a. Elijah Wood\n " +
                "b. Chris Hemsworth\n " +
                "c. Peter Jackson\n " +
                "d. Billy Boyd\n ";
        a[1][2] = "a";//elijah wood
        q[1][3] = "Question: Which of the following is not part of the drums?\n " +
                "a. Shell\n " +
                "b. Head\n " +
                "c. Rim\n " +
                "d. Platelet\n ";
        a[1][3] = "d";//platelet
        q[1][4] = "Question: Which stars name is an anagram of a European country?\n " +
                "a. Angelina Jolie\n " +
                "b. Jennifer Aniston \n " +
                "c. Meg Ryan\n " +
                "d. Jennifer Lawrence\n ";
        a[1][4] = "c";//meg ryan
        q[1][5] = "Question: What city does the family in Family Guy live in?\n " +
                "a. Anchorage\n " +
                "b. Quahog\n " +
                "c. Ontario\n " +
                "d. Buffalo\n ";
        a[1][5] = "b";//quahog
        q[1][6] = "Question: What breed was Lassie?\n " +
                "a. Collie\n " +
                "b. Boston Terrier\n " +
                "c. Beagle\n " +
                "d. Golden Retriever \n ";
        a[1][6] = "a";//Collie
        q[1][7] = " Question: In what Disney movie could you listen to the song ‘A Whole New World’?\n " +
                "a. Princess and a Frog\n " +
                "b. Aladdin\n " +
                "c. The Little Mermaid\n " +
                "d. Rapunzel\n ";
        a[1][7] = "b";//aladdin
        q[1][8] = "Question: Where is the band ABBA from?\n " +
                "a. Norway\n " +
                "b. England\n " +
                "c. Sweden\n " +
                "d. Luxembourg \n ";
        a[1][8] = "c";//sweden
        q[1][9] = "Question: In what Indiana Jones movie is revealed that he has a son?\n " +
                "a. The last Crusade\n " +
                "b. Raiders of the Lost Ark\n " +
                "c. The Temple of Doom\n " +
                "d. The Kingdom of Crystal Skull\n ";
        a[1][9] = "d";//crystal skull
        //questions for science
        q[2][0] = "Question: What animal has the highest blood pressure?\n " +
                "a. Giraffe\n " +
                "b. Tiger\n " +
                "c. Bear\n " +
                "d. Elephant\n ";
        a[2][0] = "a";//giraffe
        q[2][1] = " Question: What does a glaucoma provoke if its not treated?\n " +
                "a. Loss of hearing\n " +
                "b. Death\n " +
                "c. Blindness\n " +
                "d. Fragile bones\n ";
        a[2][1] = "c";//blindness
        q[2][2] = " Question: What is the building block of matter?\n " +
                "a. Proton\n " +
                "b. Atom\n " +
                "c. Neutron\n " +
                "d. Krypton \n ";
        a[2][2] = "b";//atom
        q[2][3] = "Question: What can not be done as we swallow?\n " +
                "a. Sneezing\n " +
                "b. Snoring\n " +
                "c. Eating\n " +
                "d. Breathing\n ";
        a[2][3] = "d";//breathing
        q[2][4] = "Question: What’s the name of the chronic mood disorder that alternates periods of hypomanic symptoms with periods of mild depression?\n " +
                "a. Bipolar disorder\n " +
                "b. Multiple personality disorder\n " +
                "c. Cyclothymia\n " +
                "d. PTSD\n ";
        a[2][4] = "c";//cyclo
        q[2][5] = "Question: What is the square root of 169?\n " +
                "a. 16\n " +
                "b. 11\n " +
                "c. 13\n " +
                "d. 14\n ";
        a[2][5] = "c";//13
        q[2][6] = "Question: Only two species are poisonous the Mexican beaded and the Gila monster, which is also the largest one in the US. What is it?\n " +
                "a. Tiger\n " +
                "b. Lizard\n " +
                "c. Crocodile\n " +
                "d. Snake\n ";
        a[2][6] = "b";//lizard
        q[2][7] = "Question: When are young elephants considered to be adults?\n " +
                "a. 8-10 years old\n" +
                "b. 10-12 years old\n" +
                "c. 12-15 years old\n " +
                "d. 15-17 years old\n ";
        a[2][7] = "c";//12-15
        q[2][8] = "Question: Which of these is a theory about the creation of the universe?\n " +
                "a. Big Bang\n " +
                "b. Theory of evolution\n " +
                "c. Atomic theory\n " +
                "d. Quantum theory\n ";
        a[2][8] = "a";//big bang
        q[2][9] = "Question: Which of these birds has the fastest flap of wings?\n " +
                "a. Blue Jay\n " +
                "b.Robin\n " +
                "c. Cardinal\n " +
                "d. Hummingbird\n ";
        a[2][9] = "d";//hummingbird
        //questions for sports
        q[3][0] = "Question: What Olympic medal does not exist?\n " +
                "a. Gold medal\n " +
                "b. Silver Medal\n " +
                "c. Copper medal\n " +
                "d. Bronze medal\n ";
        a[3][0] = "c";//copper
        q[3][1] = "Question: How many players per team are there in court in handball?\n " +
                "a. 5 players\n " +
                "b. 7 players\n " +
                "c. 8 players\n " +
                "d. 10 players\n ";
        a[3][1] = "b";//7
        q[3][2] = "Question: What city are the Blue Jays from?\n " +
                "a. Toronto\n " +
                "b. Buffalo\n " +
                "c. Miami\n " +
                "d. Atlanta\n ";
        a[3][2] = "a";//toronto
        q[3][3] = "Question: How many squares are there in a chess board?\n " +
                "a. 50 squares\n " +
                "b. 55 squares\n " +
                "c. 60 squares\n " +
                "d. 64 squares\n ";
        a[3][3] = "d";//64
        q[3][4] = " Question: How long is a basketball game in the NBA?\n " +
                "a. 30 minutes long\n " +
                "b. 40 minutes long\n " +
                "c. 48 minutes long\n " +
                "d. 50 minutes long\n ";
        a[3][4] = "c";//48
        q[3][5] = "Question: Which team did Alex Ferguson manage?\n " +
                "a. Manchester United\n " +
                "b. Real Madrid\n " +
                "c. Liverpool\n " +
                "d. France\n ";
        a[3][5] = "a";//manchester
        q[3][6] = "Question: The tiger Hodori was the mascot of which Olympic Games?\n " +
                "a. Athens 04 Olympic Games\n " +
                "b. Seoul 88 Olympic Games\n " +
                "c. Atlanta 96 Olympic Games\n " +
                "d. Barcelona 92 Olympic Games\n ";
        a[3][6] = "b";//seoul
        q[3][7] = "Question: When did the FIFA World Cup take place in the USA?\n " +
                "a. 1994\n " +
                "b. 1996\n " +
                "c. 1998\n " +
                "d. 2000\n ";
        a[3][7] = "a";//1994
        q[3][8] = "Question: What country won EuroBasket 2011?\n " +
                "a. France\n " +
                "b. USA\n " +
                "c. England\n " +
                "d. Spain\n ";
        a[3][8] = "d";//spain
        q[3][9] = "Question: What country has won the most Davis Cups?\n " +
                "a. Ireland\n " +
                "b. Portugal\n " +
                "c. United States\n " +
                "d. Spain\n ";
        a[3][9] = "c";//US
        //questions for geography
        q[4][0] = "Question: Where is the Capoeira dance from?\n " +
                "a. Greece\n " +
                "b. Brazil\n " +
                "c. Italy\n " +
                "d. Spain\n ";
        a[4][0] = "b";//brazil
        q[4][1] = "Question: Monrovia is the capital of what country?\n " +
                "a. Czechoslovakia\n " +
                "b. Croatia\n " +
                "c. Liberia\n " +
                "d. Chad\n ";
        a[4][1] = "c";//liberia
        q[4][2] = "Question: Where is whisky from?\n " +
                "a. Germany\n " +
                "b. Italy\n " +
                "c. Russia\n " +
                "d. Ireland\n ";
        a[4][2] = "d";//ireland
        q[4][3] = "Question: Yerevan is the capital of what country?\n " +
                "a. Sudan\n " +
                "b. Turkey\n " +
                "c. Armenia\n " +
                "d. Croatia\n ";
        a[4][3] = "c";//armenia
        q[4][4] = "Question: How many countries border with Egypt?\n " +
                "a. 3\n " +
                "b. 4\n " +
                "c. 5\n " +
                "d. 6\n ";
        a[4][4] = "b";//4
        q[4][5] = "Question: Which is the only country who borders with Portugal?\n " +
                "a. England\n " +
                "b. Italy\n " +
                "c. France\n " +
                "d. Spain\n ";
        a[4][5] = "d";//spain
        q[4][6] = "Question: What’s the most populated city in Scotland?\n " +
                "a. Glasgow\n " +
                "b. Dundee\n " +
                "c. Edinburgh \n " +
                "d. Aberdeen\n ";
        a[4][6] = "a";//glasgow
        q[4][7] = "Question: Where are hamburgers originally from?\n " +
                "a. USA\n " +
                "b. England\n " +
                "c. Germany \n " +
                "d. Turkey\n ";
        a[4][7] = "c";//turkey
        q[4][8] = "Question: How many countries are in the United Kingdom?\n " +
                "a. 3\n " +
                "b. 4\n " +
                "c. 5\n " +
                "d. 6\n ";
        a[4][8] = "b";//4
        q[4][9] = "Question: Where is Honduras located?\n " +
                "a. Central America\n " +
                "b. South America\n " +
                "c. Africa\n " +
                "d. North America\n ";
        a[4][9] = "a";//central america
        //questions for history
        q[5][0] = "Question: When did World War 2 End?\n " +
                "a. 1943\n " +
                "b. 1944\n " +
                "c. 1945\n " +
                "d. 1946\n ";
        a[5][0] = "c";//1945
        q[5][1] = "Question: How many sacraments are in the Catholic Church?\n " +
                "a. 5 sacraments\n " +
                "b. 7 sacraments\n " +
                "c. 8 sacraments\n " +
                "d. 10 sacraments\n ";
        a[5][1] = "b";//7
        q[5][2] = "Question: What year did the My Lai massacre take place?\n" +
                "a. 1968\n " +
                "b. 1970\n " +
                "c. 1972\n " +
                "d. 1973\n ";
        a[5][2] = "a";//1968
        q[5][3] = "Question: When did men first travel to space?\n " +
                "a. 1959\n " +
                "b. 1960\n " +
                "c. 1961\n " +
                "d. 1965\n ";
        a[5][3] = "c";//1961
        q[5][4] = "Question: What year did the Berlin wall fall?\n " +
                "a. 1985\n " +
                "b. 1987\n " +
                "c. 1984\n " +
                "d. 1989\n ";
        a[5][4] = "d";//1989
        q[5][5] = "Question: What was Sally Ride the first American woman to do?\n " +
                "a. Vote\n" +
                "b. Serve in government\n " +
                "c. Go into outer space\n " +
                "d. Go to law school\n ";
        a[5][5] = "c";//outer space
        q[5][6] = "Question: How many popes from the House of Borgia have there been?\n " +
                "a. 3\n " +
                "b. 4\n " +
                "c. 5\n " +
                "d. 6\n ";
        a[5][6] = "a";//3
        q[5][7] = "Question: Henry VIII created his own church so he could divorce which wife?\n " +
                "a. Anne Boleyn \n " +
                "b. Catherine of Aragon\n " +
                "c. Jane Seymour\n " +
                "d. Anne of Cleves\n ";
        a[5][7] = "b";//aragon
        q[5][8] = "Question: Who is the historical inspiration for the character Dracula?\n " +
                "a. Genghis Khan\n " +
                "b. Vlad the Impaler\n " +
                "c. Grigori Rasputin\n " +
                "d. Jack the Ripper\n ";
        a[5][8] = "b";//vlad
        q[5][9] = "Question: Which of the following was an ally of the Russian Empire during the First World War?\n " +
                "a. Ottoman Empire\n " +
                "b. Austria-Hungary\n " +
                "c. France\n " +
                "d. Germany\n ";
        a[5][9] = "c";//france
    }
    public boolean isSpace(String character){
        //checks if there is a space in the question, used to make sure doesn't run off screen while
        //not splitting up words
            char current = character.charAt(56);
            if (current == ' ') {
                return true;
            } else {
                return false;
            }
        }

    public int nextSpace(String character, int j){
        //same purpose as above, used to split if 3rd line is needed
        int i =j ;
            while(i<character.length()){
                if(character.charAt(i)!=' '){
                    i+=1;
                }
                else{
                    break;
                }
        }
            return i;
    }


    public void getQuestion(int c, int n) {
        //method that displays the question chosen to the user
            StdDraw.clear();
            //sets screen
            StdDraw.setPenColor(Color.magenta);
            StdDraw.filledRectangle(.5, .5, .5, .5);
            StdDraw.setPenColor(Color.black);
            String[] lines = q[c][n].split("\n");
            double x = .5;
            double y = .55;
            StdDraw.setPenColor(Color.white);
            StdDraw.filledRectangle(.5, .5, .4, .4);
            StdDraw.setPenColor(Color.black);
            StdDraw.rectangle(.5, .5, .4, .4);
            //determines when to put the question on a new line if it goes out of the box
        if(lines[0].length()>56){
            if( isSpace(lines[0])) {
                String firstpart = lines[0].substring(0, 56);
                String secondpart = lines[0].substring(56, lines[0].length());//string cutoff
                StdDraw.text(x,
                        y,
                        firstpart);
                StdDraw.text(x,
                        y - .05,
                        secondpart);
                StdDraw.setPenColor(Color.pink);
                StdDraw.text(x + .002,
                        y - .002,
                        firstpart);
                StdDraw.text(x + .002,
                        y - .002 - .05,
                        secondpart);
                y = .45;
            }
            else{
                String firstpart = lines[0].substring(0, nextSpace(lines[0],57));
                String secondpart = lines[0].substring(nextSpace(lines[0],57), lines[0].length());//string cutoff
                if(lines[0].length()>112){
                    String secondpart1= lines[0].substring(nextSpace(lines[0],57),nextSpace(lines[0],113));
                    String thirdpart= lines[0].substring(nextSpace(lines[0],113),lines[0].length());
                    StdDraw.text(x,
                            y,
                            firstpart);
                    StdDraw.text(x,
                            y - .05,
                            secondpart1);
                    StdDraw.text(x,
                            y - .1,
                            thirdpart);
                    StdDraw.setPenColor(Color.pink);
                    StdDraw.text(x + .002,
                            y - .002,
                            firstpart);
                    StdDraw.text(x + .002,
                            y - .002 - .05,
                            secondpart1);
                    StdDraw.text(x+.002,
                            y -.001- .1,
                            thirdpart);
                    y = .4;
                }
                else {
                    StdDraw.text(x,
                            y,
                            firstpart);
                    StdDraw.text(x,
                            y - .05,
                            secondpart);
                    StdDraw.setPenColor(Color.pink);
                    StdDraw.text(x + .002,
                            y - .002,
                            firstpart);
                    StdDraw.text(x + .002,
                            y - .002 - .05,
                            secondpart);
                    y = .45;
                }
            }
        }
        else{
            StdDraw.setPenColor(Color.black);
            StdDraw.text(x,
                    y ,
                    lines[0]);
            StdDraw.setPenColor(Color.pink);
            StdDraw.text(x +.002,
                    y -.002, //need to fix y, was i * .005 while in loop
                    lines[0]);
            y=.5;
        }
        //displays answers
            for (int i = 1; i < lines.length; i++) {
                //insert if statements
                StdDraw.setPenColor(Color.black);
                StdDraw.text(x,
                        y  - i *0.05,
                        lines[i]);
            }
            for (int i = 1; i < lines.length; i++) {
                StdDraw.setPenColor(Color.pink);
                StdDraw.text(x + .002,
                        y - .002 - i * 0.05,
                        lines[i]);
            }
            StdDraw.show();
            q[c][n] = null;
            //null to ensure question can't be picked again
    }

    public boolean wasAsked(int c, int n) {
        //method that returns whether or not question was asked before
        if (q[c][n] == null) {
            return true;
        } else {
            return false;
        }
    }


    public static void setSound(int hz) {
        //sets sound used when user gains a point
        int SAMPLING_RATE = 4410; //change later??
        double duration = 1.5;
        int n = (int) (SAMPLING_RATE * duration);
        double[] sound = new double[n + 1];
        for (int i = 0; i <= n; i++)
            sound[i] = Math.sin(2 * Math.PI * i * hz / SAMPLING_RATE);
        StdAudio.play(sound);
    }

    public boolean checkAnswer(int c, int n, String guess) {
        //method that checks whether or not an answer is correct
        StdDraw.clear();
        //sets screen
        StdDraw.setPenColor(Color.magenta);
        StdDraw.filledRectangle(.5, .5, .5, .5);
        StdDraw.setPenColor(Color.black);
        boolean isanswercorrect = true;
        //if answer is correct
        if (a[c][n] == guess) {
            StdDraw.setPenColor(Color.white);
            StdDraw.filledRectangle(.5, .5, .4, .4);
            StdDraw.setPenColor(Color.black);
            StdDraw.text(.5, .55, "Correct!");
            StdDraw.text(.5, .35, "HOLD DOWN MOUSE TO CONTINUE");
            StdDraw.rectangle(.5, .5, .4, .4);
            StdDraw.setPenColor(Color.pink);
            StdDraw.text(.502, .348, "HOLD DOWN MOUSE TO CONTINUE");
            StdDraw.text(.502, .548, "Correct!");
            setSound(432);
            return isanswercorrect = true;
            //if answer is incorrect
        } else {
            StdDraw.setPenColor(Color.white);
            StdDraw.filledRectangle(.5, .5, .4, .4);
            StdDraw.setPenColor(Color.black);
            StdDraw.text(.5, .55, "Incorrect.");
            StdDraw.text(.5, .35, "HOLD DOWN MOUSE TO CONTINUE");
            StdDraw.rectangle(.5, .5, .4, .4);
            StdDraw.setPenColor(Color.pink);
            StdDraw.text(.502, .348, "HOLD DOWN MOUSE TO CONTINUE");
            StdDraw.text(.502, .548, "Incorrect.");
            isanswercorrect = false;
            StdDraw.show();
            System.out.print(n);
            System.out.print(guess);
            return isanswercorrect;
        }
    }
    }



