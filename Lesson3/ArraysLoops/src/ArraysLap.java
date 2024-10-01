import javax.swing.*;

public class ArraysLap {
    public static void main(String[] args) {
        System.out.println("Print numbers from 1 to 15");  //tpel 1-15 tver@ irar koxq
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " "); //karox enq naev enter@ \n-ov tal,// System.out.println(i); es depqum tver@ kgrer irar takic
        }
        System.out.println("\nPrint even numbers from -10 to 20"); //tpel -10-ic 20-@ bolor zuyg tver@
        for (int i = -10; i <= 20; i++) {  //karox enq naev grel hetevyal kerp aranc,es paragayum arandznacnum e2-i bajanvox, aysinqn zuyg tver@
            if (i % 2 == 0)
                System.out.print(i + " "); // ka naev aveli chisht greladzev,i++-i poxaren grel i+2
        }
        System.out.println();
        for (int i = -10; i <= 20; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nPrint * simbols using given number"); //tpel simvol *elnelov trvac arjeqic
        int n = 5;  //aysinqn arajin toxum lini 1 hat, erkrordum 2 hat, 3-rdum 3 hat, 4-rdum 4 hat astxanish
        for (int i = 1; i <= n; i++) { //for-@ apahovum e, vor 4 angam for-i miji arajadranq@ kkatarvi
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // sakayn mer arajadranqn  ayl er,dra hamar vercnenq ayl cikl
                // noric chstacanq mer arajadranq@
            }
            System.out.println();     //asinqn hanecinq println-i ln-@ u arecinq enter + System.out.println();
            // asinqn for (int i = 1; i <= n; i++)  cikl@ apahovum e, te qani tox petq e unenanq, isk for (int j = 1; j <= i; j++) cikl@, te amen toxum qani astxanish petq eunenanq
            // n-ic kaxvac mer arjeqner@ poxvum en
            //hima katarenq arajadranq@ hakarak dasavorutyamb` 5-ic 1
        }
        System.out.println("\n\nPrint * simbols using given number in reverse mode");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {

            }
            System.out.print("*");

        }
        System.out.println("\n\nPrint * simbols using given number in reverse mode");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\nCreate an array with number 1-11"); //sarqel zangvac, vortex kan 1-11 tver@
        //1-in patasxan@ karox e linel int[] array = {1,2,3,4,5,6,7,8,9.10,11}; estex ardutyun karajanar mec tveri depqum,erkar grelu arumov
        int[] array = new int[11]; //erb es tarerakova haytararvum, nshanakuma ir mej lriv zroner en,inch petqa anel
        //array[0] = 1;
        //array[1] = 2;
        //array[2] = 3 ev ayln, es depqum mez petq e hashvich vor mi hat indeqsner@ apahovi` 0,1,2-@, myus mas@` 1,2,3, apahovelu hamar popoxakan enq vercnum ev arjeq talis
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = k;
            k++;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\n Create an array with even numbers from -10 to 10"); // sarqel zangvac, vori mej klinen -10-ic 10 zuyg tver@
        // nax haskananq -10ic 10 qani zuyg  tiv ka,qani vor 1-10 ka5, -1-ic -10 eli hing zuyg tiv, dranc el gumarac 0-n, kstacvi 11 zuyg tiv
        int[] array2 = new int[11];
        //array2[0]=-10;
        //array2[1]=-8;
        //array2[2]=-6;
        //array2[verjin]=10;
        for (int i = 0, j = -10; i < array2.length; i++, j += 2) {
            array2[i] = j;
        }
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nGiven an array. print odd elements");// tpelkent tver@
        int[] array3 = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};// nax petq eamentvi vrayov ancnel u chshtel kent e, te voch, mezpetq e cikl,vor@
        // arajinic minchev verjin element@ hertov kgna
        for (int a : array3) {
            if (a % 2 != 0)
                System.out.print(a + " "); //es depqummenq kunenanq bolor elementner@ tpac,sakayn mez petq en miayn kent tver@, dra hamar menq nax petq e tanq verevi hraman@
        }
        System.out.println("\n\nGiven an array. print odd elements from -10 to 5"); //hima tpenq ayn tver@, voronq gtnvum en -10ic 10mijakayqum
        for (int a : array3) {
            if (a >= -10 && a <= 5)
                System.out.print(a + " ");
        }
        System.out.println("\n\nGiven an array. print elements which can be devided 3 or 4"); //tpel ayn elementner@ voronq bajanvumen3-i kam 4-i
        for (int a : array3) {
            if (a % 3 == 0 || a % 4 == 0)
                System.out.print(a + " ");
        }
        System.out.println("\n\ngiven an array. print count of even elements");// tpel qanihat zuyg element ka,
        int countofEvens = 0;
        for (int a : array3) {
            if (a % 2 == 0)
                countofEvens++;
        }
        System.out.print("Count of even elements is" + countofEvens);
        array3 = new int[]{4, 1, 9, -4, 3};
        System.out.println("\n\nGiven an array. print sum of elements"); //elementner@ gumarum enq
        int sum = array3[0];
        for (int i = 1; i < array3.length; i++) {
            sum = sum + array3[i];
        }
        System.out.println(sum);

        System.out.println("\n\ngiven an array. print sum of positive elements"); //gumarenq en elementner@,voronq drakan en,nax sum-i arjeq@ nax tanq 0,ev heto pttvenq arrayi mej
        sum = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > 0)
                sum += array3[i];
        }
        System.out.print(sum + " ");

        System.out.println("\n\ngiven an array. print multiplication of positive elements"); //bazmapatkenq
        int m = 1;
        for (int i = 0; i < array3.length; i++) {
            m = m * array3[i];
        }
        System.out.println(m);


        System.out.println("\nFind maximal element from array"); // gtnenq max arjeq@
        int max = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > max)
                max = array3[i];
        }
        System.out.println(max);

        System.out.println("\nFind minimal element from array"); // gtnenq min arjeq@
        int min = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < min)
                min = array3[i];
        }
        System.out.println(min);

        System.out.println("\nFind element which is alone");
        array = new int[]{4, 2, 1, 9, 2, 1, 4};
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i];
        }
        System.out.println(result);


        array = new int[]{4, 1, -9, 2, 1, 445, 0, -748, 12, 1,};

        int x = 4, y = 3;// vonc anenq, vor x-i ev y-i arjeqneri texer@ poxven
        int z = x;//vorpisi x-i arjeq@ chkori, ayn pahum enq z-i mej u y-in x talu poxaren, talis enq z
        x = y;
        y = z;
        System.out.println("x =" + x + " y = " + y);  // es depqum menq korcnum enq x-i arjeq@


        System.out.println("\nSort array in asc."); //dasavoel @st achman kargi
        for (int a : array) {
            System.out.print(a + " ");

        }

        boolean qaniDerIfMtnume = true;

        int countOfFors = 0;//hashvum enq for-eri qanak@
        while (qaniDerIfMtnume) {  ////////qani der nerqonshyal gprcoxutyunnern ara,karox enq naev array. lenght-1 hanel countOfFors,kstananq nuyn@
            qaniDerIfMtnume = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int zz = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = zz;
                    qaniDerIfMtnume = true;
                }
            }
            countOfFors++;
        }

        System.out.println();
            for (int a : array) {
                System.out.print(a + " "); //  mez petq e haskanal,te qani angam ashxatacnenq (163 tox)
            }
        }
    }














