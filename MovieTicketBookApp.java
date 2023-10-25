package multiThreading;

import java.util.Scanner;

class seat{
    int total_seats=100;
    synchronized void bookingSeat(int seats) {

        if(total_seats>=seats) {

            String name=Thread.currentThread().getName();

            System.out.println(name+" Congratulations Your booking successfully done");

            total_seats=total_seats-seats;

            System.out.println("Remaining seats are: "+total_seats);

        }else {

            System.out.println("Sorry seats are not available");

        }
    }
}
public class MovieTicketBookApp extends Thread {
    Scanner sc=new Scanner(System.in);
    static seat st;
    int seats;
    @Override
    public void run() {

        st.bookingSeat(seats);

    }
    public static void main(String[] args) throws InterruptedException {
        String head="*** Movie Ticket Booking Application ***";
        char []h=head.toCharArray();
        for (int i=0;i<h.length;i++)
        {
            Thread.sleep(100);
            System.out.print(h[i]);
        }

        st=new seat();
        Scanner sc=new Scanner(System.in);

        String srr="\nEnter your name: ";
        char[]  ch=srr.toCharArray();

        for(int i=0;i<=ch.length-1;i++) {
            Thread.sleep(50);
            System.out.print(ch[i]);
        }

        String name=sc.next();

        String movie="Enter Movie  name: ";
        char[]  mh=movie.toCharArray();

        for(int i=0;i<=mh.length-1;i++) {
            Thread.sleep(50);
            System.out.print(mh[i]);
        }
        String mv=sc.next();

        String srr1="Enter the number of seats you want: ";
        char[]  ch1=srr1.toCharArray();

        for(int i=0;i<=ch1.length-1;i++) {
            Thread.sleep(50);
            System.out.print(ch1[i]);
        }
        int s=sc.nextInt();

        String srr2="Wait we are confirming your seats from our side.......... ";
        char[]  ch2=srr2.toCharArray();

        for(int i=0;i<=ch2.length-1;i++) {
            Thread.sleep(50);
            System.out.print(ch2[i]);
        }
        System.out.println();

        MovieTicketBookApp t1=new MovieTicketBookApp();
        t1.seats=s;
        t1.setName(name);
        t1.start();
        t1.join();


        String thn="Enter your name: ";
        char[]  ct=thn.toCharArray();

        for(int i=0;i<=ct.length-1;i++) {
            Thread.sleep(50);
            System.out.print(ct[i]);
        }

        String name1=sc.next();

        String movie1="Enter Movie  name: ";
        char[]  mh1=movie1.toCharArray();

        for(int i=0;i<=mh1.length-1;i++) {
            Thread.sleep(50);
            System.out.print(mh1[i]);
        }
        String mv1=sc.next();


        String st1="Enter the number of seats you want: ";
        char[]  cs=st1.toCharArray();

        for(int i=0;i<=cs.length-1;i++) {
            Thread.sleep(50);
            System.out.print(cs[i]);
        }

        int s1=sc.nextInt();

        String sr2="Wait we are confirming your seats from our side.......... ";
        char[]  chh2=sr2.toCharArray();

        for(int i=0;i<=chh2.length-1;i++) {
            Thread.sleep(50);
            System.out.print(chh2[i]);
        }
        System.out.println();

        MovieTicketBookApp t2=new MovieTicketBookApp();
        t2.setName(name1);
        t2.seats=s1;
        t2.start();
    }
}
