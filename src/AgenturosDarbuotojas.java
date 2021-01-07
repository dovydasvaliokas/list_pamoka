public class AgenturosDarbuotojas extends Darbuotojas
{

    public AgenturosDarbuotojas()
    {
    }

    public AgenturosDarbuotojas(String vardas, String pavarde, double alga)
    {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.alga = alga;
    }

    // Metodai
    public double algosSkaiciavimas()
    {
        return this.alga;
    }
}
