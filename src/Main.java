import java.util.Scanner;
public class Main

{
    public static void main(String[] args) {


        int stops;
        String newLine = System.lineSeparator();
        System.out.println("Podaj liczbe przystanków");
        Scanner input = new Scanner(System.in);
        String liczbaprzystankow = input.nextLine();

        String lp1 = liczbaprzystankow;
        String lp2 = liczbaprzystankow;
        trasa przystanki = new trasa ();
        boolean czytoliczba;
        czytoliczba= trasa.isInt(lp1);
        boolean czydodatnia=false;
        if (czytoliczba == true)
        {
            czydodatnia = trasa.isPlus(lp2);
        }


        if (czydodatnia==true && czytoliczba)
        {
            System.out.println("Twoja liczba przystanków to: " + liczbaprzystankow);
            int lstops = Integer.parseInt(liczbaprzystankow);

            inBus bus1 []= new inBus[lstops];
            inBus bus2 = new inBus();
            int zmianapasażerow;
            for (int i = 0; i<lstops; i++)
            {
                System.out.println("Podaj liczbe pasażerów na przystanku");
                zmianapasażerow = Integer.parseInt(input.nextLine());
                bus2.wbusie(zmianapasażerow);
                bus1 [i]=bus2;

            }
            for (int k=0; k<lstops; k++)
            {
                System.out.println("Numer przystanku: " + (k+1) + "Liczba pasażerów: " + bus1[k].getstan() );
            }
        }
        else
        {
            System.out.println("Błędna liczba przystanków.");
        }
    }
}



