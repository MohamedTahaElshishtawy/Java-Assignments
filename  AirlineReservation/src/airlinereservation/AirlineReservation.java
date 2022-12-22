package airlinereservation;
import java.util.*;

class describe {

    String from;
    String to;
    int arrival;
    int depart;
    int capacity;

    public describe() {
        System.out.println("Travling From : ");
        Scanner s2 = new Scanner(System.in);
        String temp2 = s2.nextLine();
        from = temp2;
        System.out.println("Arrivaing To : ");
        String temp3 = s2.nextLine();
        to = temp3;
        Random rand = new Random(); 
        int upperbound = 25;
        int int_random = rand.nextInt(upperbound);
        arrival = int_random;
        int int_random2 = rand.nextInt(upperbound);
        depart = int_random2;
        int int_random3 = rand.nextInt(500);
        capacity = int_random3;

    }

}

class schedule extends describe {

    String date;

    public schedule() {
        System.out.println("Select the time You want to travel : ");
        Scanner s = new Scanner(System.in);
        String temp1 = s.nextLine();
        date = temp1;

    }

}

class person {

    String name;
    String adress;

    public person() {
        System.out.println("What is your name? ");
        Scanner s = new Scanner(System.in);
        String temp1 = s.nextLine();
        name = temp1;
        System.out.println("What is your addres? ");
        String temp2 = s.nextLine();
        adress = temp2;

    }

}

class passenger extends person {

    String num;

    public passenger() {

        Random rand = new Random();
        int upperbound = 32;
        int int_random = rand.nextInt(upperbound);
        String edit = new String();
        edit = name + int_random;
        num = edit;

    }

}

public class AirlineReservation extends schedule {

    
    public static void main(String[] args) {      
        passenger obj2 = new passenger();
        AirlineReservation obj = new AirlineReservation();
        System.out.println("\nReservation Is OK \n");
        System.out.println("You Are Travelling From : " + obj.from + "   To : " + obj.to);
        System.out.println("Department Time is : " + obj.depart);
        System.out.println("Arrival Time is : " + obj.arrival);
        System.out.println("Capacity is : " + obj.capacity);
        System.out.println("The Date You Choose : " + obj.date);
        System.out.println("Your Passenger Id is : " + obj2.num);
        System.out.println("\nHappy Travel");

    }

}
