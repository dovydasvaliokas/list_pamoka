import java.util.Comparator;

public abstract class Darbuotojas
{
    protected String vardas;
    protected String pavarde;
    protected double alga;
  //  int stazasMenesiais;

    public String pilnasVardas()
    {
        return this.vardas + this.pavarde;
    }

    public abstract double algosSkaiciavimas();

    public String getVardas()
    {
        return vardas;
    }

    public void setVardas(String vardas)
    {
        this.vardas = vardas;
    }

    public String getPavarde()
    {
        return pavarde;
    }

    public void setPavarde(String pavarde)
    {
        this.pavarde = pavarde;
    }

    public double getAlga()
    {
        return alga;
    }

    public void setAlga(double alga)
    {
        this.alga = alga;
    }

    public String pilnasDarbuotojoIsvedimas()
    {
        String pilnasVP = "";
        pilnasVP += pilnasVardas() + "\n";
        pilnasVP += algosSkaiciavimas() + "\n";
        return pilnasVP;
    }

    public static Comparator<Darbuotojas> pagalAlgaRikiuoti = new Comparator<Darbuotojas>()
    {
        @Override
        public int compare(Darbuotojas o1, Darbuotojas o2)
        {
            double alga1 = o1.algosSkaiciavimas();
            double alga2 = o2.algosSkaiciavimas();


            // Jei norime didejancia tvarka
            if (alga1 > alga2)
            {
                return 1;
            }
            if (alga2 > alga1)
            {
                return -1;
            }
            return 0;
        }
    };
}
