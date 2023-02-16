import org.w3c.dom.ls.LSOutput;

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

        // ==========Pirma uzduotis=========================

        String myFirstName = "Zaneta";
        String mySecondName = "Bakanauskiene";
        int birthYear = 1975;
        int currentYear = 2023;
        int age = (currentYear - birthYear);
        System.out.println("Aš esu " + myFirstName + " " + mySecondName + ". Man yra " + age + " metai (-ų).");
        System.out.println("--------- 2 uzduotis-----------");
        // ===========Antra uzduotis==================================

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
                System.out.println("Padalinus gaunam " + (Math.round(rndomeX / rndomeY * 100) / 100.0));
            } else {
                System.out.println("Padalinus gaunam " + (Math.round(rndomeY / rndomeX * 100) / 100.0));
            }
        } else {
            System.out.println("Dalyba is nulio negalima");
        }


        System.out.println("--------- 3 uzduotis-----------");
        // ==========Trecia uzduotis=====================================================

        // Naudokite funkcija Math.random(). Sukurkite tris kintamuosius ir
        // naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 25.
        // Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.


        int a3 = 0;
        int b3 = 25;
        int varOne, varTwo, varThree;
        varOne = a3 + (int) Math.round(Math.random() * (b3 - a3 + 1));// '+ 1' del cutting int, kad generuotu 25
        varTwo = a3 + (int) Math.round(Math.random() * (b3 - a3 + 1));
        varThree = a3 + (int) Math.round(Math.random() * (b3 - a3 + 1));

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

        // ZB: dvieju krastiniu suma turi buti didesne nei trecios krastines ilgis.

        int trOne, trTwo, trThree;
        int aa = 1;
        int ab = 10;
        // kintamuju generavimas
        trOne = aa + (int) Math.round(Math.random() * (ab - aa + 1));
        trTwo = aa + (int) Math.round(Math.random() * (ab - aa + 1));
        trThree = aa + (int) Math.round(Math.random() * (ab - aa + 1));

        System.out.println("trOne = " + trOne + ", trTwo = " + trTwo + ", trThree = " + trThree);

        // tikrinam ar dvieju krastiniu suma didesne nei trecios

        if ((trOne + trTwo) <= trThree || (trOne + trThree) <= trTwo || (trTwo + trThree) <= trOne) {
            System.out.println("The triangle is not valid");
        } else {
            System.out.println("The triangle is valid");
        }
        // destytojas nerekomenduoja if funkcijos uzrasyti tokia ilga salyga, geriau skaidyti i atskirus if

        System.out.println("--------- 5 uzduotis-----------");

        // Penkta uzduotis

        // sukurti 4 kintamuosius su Math.random () su reiksmemis nuo 0 iki 2.
        // Suskaiciuoti kiek yra nuliu, vienetu ir dvejetu.

        int var1, var2, var3, var4;
        // kintamuju generavimas

        var1 = (int) (Math.random() * 3);
        var2 = (int) (Math.random() * 3);
        var3 = (int) (Math.random() * 3);
        var4 = (int) (Math.random() * 3);

        System.out.println("var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3 + " + var4 = " + var4);

        // skaiciuojam nulius, vienetus ir dvejetus
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        if (var1 == 0) {
            zeros++;
        }
        if (var2 == 0) {
            zeros++;
        }
        if (var3 == 0) {
            zeros++;
        }
        if (var4 == 0) {
            zeros++;
        }

        System.out.println("variables equal to zeros: " + zeros);

        if (var1 == 1) {
            ones++;
        }
        if (var2 == 1) {
            ones++;
        }
        if (var3 == 1) {
            ones++;
        }
        if (var4 == 1) {
            ones++;
        }
        System.out.println("variables equal to ones: " + ones);


        if (var1 == 2) {
            twos++;
        }
        if (var2 == 2) {
            twos++;
        }
        if (var3 == 2) {
            twos++;
        }
        if (var4 == 2) {
            twos++;
        }
        System.out.println("variables equal to twos: " + twos);

        System.out.println("--------- 6 uzduotis-----------");


        // Sesta uzduotis

        // atspausdinti 3 skaicius nuo -10 iki 10. Skaiciai mazesni uz 0 turi buti [] skliaustuose, nulis - (),
        // o didesni uz 0 {}.


        int a6 = -10;
        int b6 = 10;

        // generuojam tris kintamuosius

        int x6 = a6 + (int) Math.round(Math.random() * ((b6 - a6) + 1));
        int y6 = a6 + (int) Math.round(Math.random() * ((b6 - a6) + 1));
        int z6 = a6 + (int) Math.round(Math.random() * ((b6 - a6) + 1));


        System.out.println("x6 = " + x6 + ", y6 = " + y6 + ", z6 = " + z6);


        // tikrinam ar skaicius <0, >0 ar =0 ir spausdinam tinkamuose skliaustuose

        if (x6 < 0) {
            System.out.println("[ " + x6 + " ]");
        }
        if (x6 == 0) {
            System.out.println("( " + x6 + " )");
        }
        if (x6 > 0) {
            System.out.println("{ " + x6 + " }");
        }
        if (y6 < 0) {
            System.out.println("[ " + y6 + " ]");
        }
        if (y6 == 0) {
            System.out.println("( " + y6 + " )");
        }
        if (y6 > 0) {
            System.out.println("{ " + y6 + " }");
        }
        if (z6 < 0) {
            System.out.println("[ " + z6 + " ]");
        }
        if (z6 == 0) {
            System.out.println("( " + z6 + " )");
        }
        if (z6 > 0) {
            System.out.println("{ " + z6 + " }");
        }


        System.out.println("--------- 7 uzduotis-----------");
        // Septinta uzduotis


        // git config --global user.email "zzanule@gmail.com"
        // git config --global user.name "ZanetaB"


    }
}




