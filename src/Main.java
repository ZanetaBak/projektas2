import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // susikurti kintamaji su miesto kuriame gyvenate pavadinimu bei jį atspausdinti konsolėje
        String miestas = "Vilnius";
        System.out.println(miestas);

        // susikurti kintamajį int tipo, ir jame išsaugoti dabartinius metus (2023) ir atspausdinti.
        int metai = 2023;
        System.out.println(metai);

        // sugeneruoti sveikajį atsitiktinį skaičių nuo 0 iki 50 intervale bei jį atspausdinti
        int min = 0;
        int max = 50;
        int result = min + (int) Math.round(Math.random() * (max - min));
        System.out.println(result);

        // sugeneruoti sveikajį atsitiktinį skaičių nuo 20 iki 70 intervale bei jį atspausdinti
        int mn = 20;
        int mx = 70;
        int rsult = mn + (int) Math.round(Math.random() * (mx - mn));
        System.out.println(rsult);

        System.out.println("--------- 1 uzduotis-----------");

        // Pirma uzduotis

        String myFirstName = "Zaneta";
        String mySecondName = "Bakanauskiene";
        int birthYear = 1975;
        int currentYear = 2023;
        int age = (currentYear - birthYear);
        System.out.println("Aš esu " + myFirstName + " " + mySecondName + ". Man yra " + age + " metai (-ų).");
        System.out.println("--------- 2 uzduotis-----------");
        // Antra uzduotis

        //Sukurkite du kintamuosius ir naudodamiesi funkcija Math.random()
        // jiems priskirkite atsitiktines reikšmes nuo 0 iki 4. Didesnę reikšmę padalinkite iš mažesnės.
        // Atspausdinkite rezultatą jį suapvalinę iki 2 skaičių po kablelio.

        int a = 0;
        int b = 4;

        double rndomeX, rndomeY;
        rndomeX = a + (double) Math.round(Math.random() * (b - a));
        rndomeY = a + (double) Math.round(Math.random() * (b - a));

        System.out.println("rndomeX yra " + rndomeX + ", o rndomeY yra  " + rndomeY);

        if (rndomeX > 0 && rndomeY != 0) {
            if (rndomeX > rndomeY) {
                System.out.println("Padalinus gaunam " + Math.round(rndomeY / rndomeX * 100) / 100.0);
            } else {
                System.out.println("Padalinus gaunam " + Math.round(rndomeX / rndomeY * 100) / 100.0);
            }
        } else {
            System.out.println("Dalyba is nulio negalima");
        }


        System.out.println("--------- 3 uzduotis-----------");
        // Trecia uzduotis

        // Naudokite funkcija Math.random(). Sukurkite tris kintamuosius ir
        // naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 25.
        // Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.


        int e = 0;
        int f = 25;
        int varOne, varTwo, varThree;
        varOne = e + (int) Math.round(Math.random() * (f - e));
        varTwo = e + (int) Math.round(Math.random() * (f - e));
        varThree = e + (int) Math.round(Math.random() * (f - e));

        System.out.println("varOne yra " + varOne + ",  varTwo yra  " + varTwo + " ,o varThree yra " + varThree);

        // tikrinti varTwo
        if ((varOne < varTwo && varTwo < varThree || varThree < varTwo && varTwo < varOne)) {
            System.out.println("Vidurinė reikšmė: " + varTwo);
        }
        // tikrinti varOne
        else if ((varTwo < varOne && varOne < varThree || varThree < varOne && varOne < varTwo)) {
            System.out.println("Vidurinė reikšmė: " + varOne);
        } else {
            System.out.println("Vidurinė reikšmė: " + varThree);
        }
        System.out.println("--------- 4 uzduotis-----------");

        // Ketvirta uzduotis

        // a, b ir c krastiniu ilgiai (naudoti Int). naudoti Math.random (nuo 1 iki 10). Programa turi nustatyti
        // ar galima sudaryti trikampi ir atsakyma atspausdinti.

        // ZB: krastiniu ilgiai tik teigiami skaiciai ir dvieju krastiniu suma turi buti didesne
        // nei trecios krastines ilgis. Atsakymas - taip, trikampi sudaryti galima arba - ne

        int trOne, trTwo, trThree;
        int aa = 1;
        int ab = 10;
        // kintamuju generavimas
        trOne = aa + (int) Math.round(Math.random() * (ab - aa));
        trTwo = aa + (int) Math.round(Math.random() * (ab - aa));
        trThree = aa + (int) Math.round(Math.random() * (ab - aa));

        System.out.println("trOne = " + trOne + ", trTwo = " + trTwo + ", trThree = " + trThree);

        boolean trikampisGeras = true;

        // tikrinam ar krastines ilgis yra teigiamas skaicius - ar reikia tikrinti jeigu skaiciai nuo 0 iki 10?

        if (trOne <= 0 || trTwo <= 0 || trThree <= 0) {
            trikampisGeras = false;

            System.out.println("The triangle is not valid");
        }
        // tikrinam ar dvieju krastiniu suma didesne nei trecios

        else if ((trOne + trTwo) <= trThree || (trOne + trThree) <= trTwo || (trTwo + trThree) <= trOne) {
            trikampisGeras = false;
            System.out.println("The triangle is not valid");
        } else {
            System.out.println("The triangle is valid");
        }
        System.out.println("--------- 5 uzduotis-----------");

        // Penkta uzduotis

        // sukurti 4 kintamuosius su Math.random () su reiksmemis nuo 0 iki 2.
        // Suskaiciuoti kiek yra nuliu, vienetu ir dvejetu


        int var1, var2, var3, var4;
        int aaa = 0;
        int aab = 2;

        // kintamuju generavimas
        var1 = aaa + (int) Math.round(Math.random() * (aab - aaa));
        var2 = aaa + (int) Math.round(Math.random() * (aab - aaa));
        var3 = aaa + (int) Math.round(Math.random() * (aab - aaa));
        var4 = aaa + (int) Math.round(Math.random() * (aab - aaa));

        System.out.println("var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3 + ", var4 = " + var4);


        // int count0, count1, count2;
        //count0 = 0;

        // for (count0 = 0; var1 = 0 || var2 = 0 || var3 = 0 || var4 = 0; count0++) {

        // System.out.println("Nulių = " + count0);
    }
    // nezinau kaip suskaiciuoti :(


    // Sesta uzduotis

    // atspausdinti 3 skaicius nuo -10 iki 10. Skaiciai mazesni uz 0 turi buti [] skliaustuose, nulis - (),
    // o didesni uz 0 {}.


    int a6 = -10;
    int b6 = 10;

    int x6 = a6 + (int) Math.round(Math.random() * ((b6 - a6) + 1));
    int y6 = a6 + (int) Math.round(Math.random() * ((b6 - a6) + 1));
    int z6 = a6 + (int) Math.round(Math.random() * ((b6 - a6) + 1));

    // nezinau ka toliau daryti
    //  if (x6 < 0 || y6 < 0 || z6 < 0) {

    //  System.out.println("[ " + x6 + y6 + z6 + " ]");
    //}
    //    else if (x6 = 0 || y6 = 0 || z6 = 0) {
    //{
    //System.out.println("(" + x6 + y6 + z6")");
    //}
    // else{
    //   System.out.println("{" + x6 + y6 + z6"}");
    //}

    // nebaigtas


    // Septinta uzduotis

    git config --global user.email "zzanule@gmail.com"
    git config --global user.name "ZanetaB"

}
//}




