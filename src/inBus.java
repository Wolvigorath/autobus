public class inBus<lcp> {


    private int pasplus;

    private int passtan;

    public int wbusie (int pasplus)
    {
        this.pasplus = pasplus;

        this.passtan = passtan + pasplus;

        //System.out.println("Podaj liczbe pasażerów na przystanku: " + passtan);
        return passtan;

    }

    public  int getstan ()
    {
        return passtan;
    }
}