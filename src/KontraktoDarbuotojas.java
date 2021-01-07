public class KontraktoDarbuotojas extends Darbuotojas
{
    // Kintamieji tik sios klases
    private int stazasMenesiais;

    public KontraktoDarbuotojas()
    {
    }

    public KontraktoDarbuotojas(String vardas, String pavarde, double alga, int stazasMenesiais)
    {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.alga = alga;
        this.stazasMenesiais = stazasMenesiais;
    }

    // Metodai
    public double algosSkaiciavimas()
    {
        double skaiciuojamaAlga = 0;
        if (this.stazasMenesiais > 12)
        {
           // skaiciuojamaAlga = this.alga + (this.alga * 0.2);
           //   skaiciuojamaAlga = this.alga * 1.2;
              skaiciuojamaAlga = this.alga * 1.2;
        }
        else
        {
            skaiciuojamaAlga = this.alga;
        }
        return skaiciuojamaAlga;
    }



    public int getStazasMenesiais()
    {
        return stazasMenesiais;
    }

    public void setStazasMenesiais(int stazasMenesiais)
    {
        this.stazasMenesiais = stazasMenesiais;
    }
}
