public class trasa {



    public static boolean isInt(String lp)
    {
        if (lp == null)
        {
            return false;
        }
        try
        {
            int a = Integer.parseInt(lp);
        }
        catch ( NumberFormatException nfe)
        {
            return false;
        }

        return true;
    }

    public static boolean isPlus (String cd)
    {
        double dd = Double.parseDouble(cd);
        if (dd <= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
