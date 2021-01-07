import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;

public class Programa
{
    public static void main (String[] args)
    {
        int[] masyvas = new int[50];
        String[] zodziuMasyvas = new String[50];
     //   FileWriter[] failuRasytuvai = new FileWriter[50];

    /*    KontraktoDarbuotojas testinisDarbuotojas = new KontraktoDarbuotojas("Vardenis", "Pavardenis", 1000, 16);
        System.out.println(testinisDarbuotojas.pilnasDarbuotojoIsvedimas());*/

        String failoNuoroda = "data.txt";
        File failas = new File(failoNuoroda);
        ArrayList<Darbuotojas> darbuotojai = new ArrayList<>();
        try
        {
            Scanner failoSkaitytuvas = new Scanner(failas);
            while (failoSkaitytuvas.hasNextLine())
            {
                String eilute = failoSkaitytuvas.nextLine();
                String[] isskaidytaEilute = eilute.split(",");
                List<String> darbuotojoDuomenys = Arrays.asList(isskaidytaEilute);
           /*     for (int i = 0; i < darbuotojoDuomenys.size(); i++)
                {
                    System.out.println(darbuotojoDuomenys.get(i));
                }*/

                if (darbuotojoDuomenys.get(darbuotojoDuomenys.size() - 1).equals("kontrakto"))
                {
                    double tempAlga = Double.parseDouble(darbuotojoDuomenys.get(2));
                    int tempStazas = Integer.parseInt(darbuotojoDuomenys.get(3));
                    Darbuotojas tempDarbuotojas = new KontraktoDarbuotojas(darbuotojoDuomenys.get(0), darbuotojoDuomenys.get(1), tempAlga, tempStazas);

                    darbuotojai.add(tempDarbuotojas);
                    // Susikursime kontraktiniodarbuotojo objekta
                }

                if (darbuotojoDuomenys.get(darbuotojoDuomenys.size() - 1).equals("agentura"))
                {
                    double tempAlga = Double.parseDouble(darbuotojoDuomenys.get(2));
                    Darbuotojas tempDarbuotojas = new AgenturosDarbuotojas(darbuotojoDuomenys.get(0), darbuotojoDuomenys.get(1), tempAlga);

                    darbuotojai.add(tempDarbuotojas);
                }

                System.out.println("---------------------");
            }
            for (int i = 0; i < darbuotojai.size(); i++)
            {
                System.out.println(darbuotojai.get(i).pilnasDarbuotojoIsvedimas());
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nera tokio failo");
            e.printStackTrace();
        }

        System.out.println("Visų darbuotojų suma: " + darbuotojuAlguSuma(darbuotojai));
        // Rasti darbuotoją, kuris uždirba daugiausiai ir išvesti jo vardą pavardę
        // Rasti kiek reikės išmokėti agentūros darbuotojams ir po to atskirai kiek išmokėti kontraktiniam darbuotojams
        Collections.sort(darbuotojai, Darbuotojas.pagalAlgaRikiuoti);

        for (int i = 0; i < darbuotojai.size(); i++)
        {
            System.out.println(darbuotojai.get(i).pilnasDarbuotojoIsvedimas());
        }

 /*       try
        {
            Scanner failoSkaitytuvas = new Scanner(failas);
            String eilute = "";
            System.out.println("ciklas");
            System.out.println(failoSkaitytuvas.hasNextLine());
            while (failoSkaitytuvas.hasNextLine())
            {
                String[] eilutesSkaiciai;
                List<String> eilutesSkaiciaiSarasas;
                List<Integer> konvertuotuSkaiciuSarasas = new ArrayList<>();
                eilute = failoSkaitytuvas.nextLine();
                eilutesSkaiciai = eilute.split(",");
                eilutesSkaiciaiSarasas = Arrays.asList(eilutesSkaiciai);
                for (int i = 0; i < eilutesSkaiciaiSarasas.size(); i++)
                {
                    int konvertuotasSkaicius = 0;
                    try
                    {
                        konvertuotasSkaicius = Integer.parseInt(eilutesSkaiciaiSarasas.get(i));
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Įvestas ne skaičius!!! Pataisykite tekstinį failą");
                        e.printStackTrace();
                    }

                    konvertuotuSkaiciuSarasas.add(konvertuotasSkaicius);
                    System.out.println("skaicius: " + konvertuotuSkaiciuSarasas.get(i));
                }
                System.out.println("Eilutės suma: " + sarasoSuma(konvertuotuSkaiciuSarasas));
            }
            failoSkaitytuvas.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nera tokio failo");
            e.printStackTrace();
        }*/

     //   Scanner ivedimas = new Scanner(System.in);
     /*   ArrayList<String> zodziuSarasas = new ArrayList<String>();
        ArrayList<Integer> skaiciuSarasas = new ArrayList<Integer>();
        ArrayList<Integer> ivestuSkaiciuSarasas = new ArrayList<Integer>();

        LinkedList<Integer> skaiciuLinkedSarasas = new LinkedList<Integer>();

        for (int i = 0; i < 60; i++)
        {
            skaiciuSarasas.add(i);
            skaiciuLinkedSarasas.add(i);
        }

     /*   for (int i = 0; i < 60; i++)
        {
            System.out.println(skaiciuLinkedSarasas.get(i));
        }*/
    /*    for (int i = 0; i < 20; i++)
        {
            skaiciuSarasas.remove(skaiciuSarasas.size() - 1);
        }

        System.out.println(skaiciuSarasas.toString());
        System.out.println(sarasoSuma(skaiciuSarasas));

        int ivedamasSkaicius = 0;
        while (ivedamasSkaicius >= 0)
        {
            ivedamasSkaicius = ivedimas.nextInt();
            if (ivedamasSkaicius >= 0)
            {
                ivestuSkaiciuSarasas.add(ivedamasSkaicius);
            }
        }

        System.out.println("Saraso suma: " + sarasoSuma(ivestuSkaiciuSarasas));
        System.out.println("Nesurikiuotas sarasas: " + ivestuSkaiciuSarasas.toString());
        Collections.sort(ivestuSkaiciuSarasas, Comparator.reverseOrder());
     //   ivestuSkaiciuSarasas.sort(Comparator.reverseOrder());
        System.out.println("Surikiuotas sarasas: " + ivestuSkaiciuSarasas.toString());*/
    }


    public static double darbuotojuAlguSuma(ArrayList<Darbuotojas> darbuotojai)
    {
        double suma = 0;
        for (int i = 0; i < darbuotojai.size(); i++)
        {
            suma += darbuotojai.get(i).algosSkaiciavimas();
        }
        return suma;
    }


    public static int sarasoSuma (ArrayList<Integer> sarasas)
    {
        int suma = 0;
        for (int i = 0; i < sarasas.size(); i++)
        {
            suma += sarasas.get(i);
        }
        return suma;
    }

    public static int sarasoSuma (List<Integer> sarasas)
    {
        int suma = 0;
        for (int i = 0; i < sarasas.size(); i++)
        {
            suma += sarasas.get(i);
        }
        return suma;
    }

    public static int sarasoSuma (LinkedList<Float> sarasas)
    {
        int suma = 0;
        for (int i = 0; i < sarasas.size(); i++)
        {
            suma += sarasas.get(i);
        }
        return suma;
    }




}


