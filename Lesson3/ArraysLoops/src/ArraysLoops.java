public class ArraysLoops {
    public static void main(String[] args) {
        int b = 4;
        int b1 = 56;
        int b2 = 48; // ev ayln, vorpisi ayspes chtvarkenq,javayum kaespisi hraman
        int[] a = new int[6]; //ayseinqn menq hishoxutyan mej unenq int-i hamar 5 tex
        System.out.println(a[0]); //kardacvum ee a-i 0 index,ete menq hishoxutyunic vercnum enq tiruyt zangvaci hamar,inq@ tiruti mej exac sax elementneri tex@ grum e default arjeqner@, vor@ inti depqum 0,aysinqn klini 5 hat 0,booleani hamar falsen e, ayd patcharov asxatacneluc ktpi 0
        // ete nshel enq index@ 5,tvuma vor verjin element@ klini 5-@, ayc qani vor inqexner@ sksvum en 0-ic, apa verjin element@ klini 4 indexov element@
        a[0] = 4;
        a[1] = 7; //qani vor a[2] arjeq chenq tvel,ayn kmna 0
        a[3] = -7;
        a[4] = 1;
        a[5] = 1;
        System.out.println(a[0] + a[4]); //4+1
        System.out.println(a.length);// cuyc e talis,te tvyal array@ qani chapani e,merdepqum 5 chapania
        //elnelov es gaxaparic haskananq vonc tpenq array-i arajin u verjin elementneri gumar@`ankax zangvaci erkarutyunic
        //indeqn el= e erkarutyun-1
        System.out.println(a[0] + a[a.length - 1]); //stacanq 6, qani vor a[0]-n 4a,isk erkarutyun@ 6,inchic-1,linum e 5, isk 5 indexov elementin arjeq chenq tvel,mnacela 0,aysinqn exav 4+0
        // arjeq tvecinq stacanq 5` 4+1

        //hima haskananq vonc array sarqeluc  elementner@ miangamic lcnenq
        //ete elementneri arjeqner@ haytni en, karox enq miangamic grel
        int[] array = {4, 1, -8, 0, 3, 4, 6}; // heteyal greladzevi poxaren
        //int[] array = mew int[7]
        //array[0] = 4;
        //array[2] = 1;
        //....;
        //array[6] = 6;
        System.out.println(array[0]);//nshanakum etpir arajin element@
        System.out.println(array[array.length - 1]); //verjin element@

        //isk ete naxapes arjeqnerin chenq tirapetum,es paragayumhaytararelu dzev@ sa e
        int[] number;
        number = new int[]{5, 4, 7, 8};

        //if gorcoxutyun,ent. unenq element ankax ir arjeqic,asenq ete x-@ zuyga, tpir orinak barev,pakagcum petq e lini boolean nshanner
        int x = 4;
        if (x > 0) {
            System.out.println("Barev"); //ent cankanum enq eli inch-vor ban tpi, ete ashaxatacnenq 2-n el kberi
            System.out.println("Java");  //ete x-@ bacasakan e, or. -4,kberi miayn Java
        }
        //()-eri depqum if-@ verabervum e miayn mekin`arajinin,ete cankanum enq 2in el verabervi, apa erkusn el nerarum enq dzevavor pakagcerimej
        // es paragayum acasakan arjeqi depqum voch mekn el chi haskana

        int e = -4;
        if (e > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non Positiv");  //aysinqn ete x>0,apa tur positive, hakarak depqum non positiv

            int d;
            if (x > 0) {
                d = 1;
            } else {
                d = 0; // sa karox enq grel naev hetevyal kerp` ?:
                d = (x > 0) ? 1 : 0; //arcakani u 2 keti mejtexum petq e lini arjeq
                //aysinqn,ete x>0 arjeq@ petq e lini 1,hakarak depqum 0
                System.out.println(d);

                x = 0;
                if (x > 0) {
                    System.out.println("Positiv");
                } else {
                    if (x < 0)
                        System.out.println("Negativ");
                    else
                        System.out.println("Zero");
                    x = 2;
                    System.out.println("---------------");

                    switch (x) {
                        case 2:
                            System.out.println("One");
                            break;
                        case 1:
                            System.out.println("two");
                            break;
                        case 3:
                            System.out.println("three");
                            break;
                        default:
                            System.out.println("Bigger"); //switch-@ pntrum gtnum e chisht case-@, break-@ sahmanapakum e voronman gorcoxutyun@, aysinqn voronum@ katarvum e minchev break sahman@
//switch-ov karox enq stugel byte, short,char ev int primitiv tiper@,java 8-ic naev string
                            String y = "aa";
                            switch (y) {
                                case "a":
                                    System.out.println("");
                                    //cikler
                                    System.out.println("-------------");
                                    int counter = 1;
                                    while (counter < 11) {
                                        System.out.println(counter++ + " "); //aysinqn tpume 1-10 tver@

                                        // do while cikl, ent cankanum


                                    }
                            }
                    }
                }


            }


        }


    }
}

