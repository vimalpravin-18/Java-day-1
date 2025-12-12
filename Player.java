public class Player {

static String country="India";
int score = 90;//Non-static

public static void main(String args[])
{
Player rohit=new Player();
Player virat=new Player();
Player dhoni=new Player();

virat.score=46;
rohit.score=56;
dhoni.score=50;

rohit.bat();
virat.keep();
dhoni.bowl();

System.out.println(Player.country);
System.out.println(rohit.country);//using object reference
System.out.println(rohit.score);
System.out.println(dhoni.score);    


}
void keep()
{
    int wickets = 5;
    int runs = 40;
    int over = 4;
System.out.println("Bowled for "+over+" overs with "+runs +" runs"+ " and Got "+wickets+" "+score+" wickets");
}

void bat()
{
int score=20;//local variable
float strike_rate=78.5f;//local variable
System.out.println("batting with "+score+" "+strike_rate+" " +Player.country);// concatenate
}

void bowl()
{
System.out.println("Bowling");
}

}


// STUDENT MARKS UPDATING 

public class Player {
    static String collage = "ABC Collage";
    int marks;

    public static void main (String[] args) {
        Player student1 = new Player();
        Player student2 = new Player();
        Player student3 = new Player();

        student1.updateMarks(77);
        student2.updateMarks(66);
        student3.updateMarks(55);

    System.out.println(Player.collage);

        student1.displaymarks();
        student2.displaymarks();
        student3.displaymarks();

    }

    void displaymarks() {
        System.out.println("Marks:" + marks);
    }

    void updateMarks(int newMarks) {
        marks = newMarks;
    }
}