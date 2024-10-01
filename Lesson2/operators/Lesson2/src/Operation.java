public class Operation {
    public static void main(String[] args) {
        int x1;   //popoxakannerin arjeq karox enq talmiayn ays tareraknerov
        int $x;
        int _x = 9; //orinak
        System.out.println(_x);   //sa veraervuma amenaskzbin,isk baramijum ardenkarox enq grel tver
        int a45 = 92;
        System.out.println(a45);
        //popoxakanneri graget grelu dzev@
        String firstName = "Hayk";  //aysinqn poqratarov sksum enq,heto amen hajord bar grum enq mecatarov kam _ tarberakv
        String first_name = "Hayk";
        System.out.println(first_name);

        //Tvabanakan gorcoxutyunner
        //gumarum
        int a = 4; //karox enq naev grel mi toxov`int a = 4; b = 3;
        int b = 3;
        int c = a + b;
        System.out.println(c);  //nuyn kerp hanman gorcoxutyunna
        System.out.println(a * b); //bazmapatkum
        int x = 7, y = 5;
        System.out.println(x / y); //bajanum nshanakum e veradardznel bajanman qanord@` 7/5=1
        System.out.println(x % y); // knshanaki vercnel ajanumic mnacord@ 7%5=2 ,aysinqn amoxj tveri / u %-neri depqum piti stananq amboxj tver

        double t = 7, p = 5;
        System.out.println(t / p); // double tveridepqum kgna sovorakan bajanum

        //++ ev -- gorcoxutyunner@ gorcum en amoxj tveri hamar
        x = 5;
        x++;//nuynn e, te x=x+1,aysinqnn ++ nshanakum e tvin tal 1 arjeq
        System.out.println(x);
        ++x;
        System.out.println(x);

        x = 4;
        System.out.println(x++); //gorcoxutyan mej ete kardanq dzaxic aj, kkardacvi tpir x-i arjeq@,heto nor 1-ov ayn avelacru,hajord qaylov,ete tpenq x-i arjeq@,nor 1-ov kavelana
        System.out.println(x);
        System.out.println(++x); //esparagayum ete kardanq dzaxic aj,apa kkardacvi nax arjeq@ avelacnel 1-ov, heto tpel

        x = 3;
        y = 4;
        c = x++ - --y; // sa kkardacvi c = 3-3(aysinqn 4-1)=0
        //x=4(aysinqn3+1),y=3(4-1)
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("c = " + c); // aysinqn ete ++-@ kam --@ arjeqic heto e,nax petq e tpelarjeq@,heto gumarel kam hanel,hakarak depqum,nax petq e hanel kam gumarel, nor tpel arjeq@

        System.out.println("----------------");
        x = 7;
        y = 8;
        c = ++x + y--; // c=8+8=16, x=8,y=7
        System.out.println(x++); // nax ktpi x=8,heto x=9(8+1)
        System.out.println(c); //16
        System.out.println(x);//9
        System.out.println(--y);//nax y=7-1=6,heto print 6
        System.out.println(y);//6


        boolean bb = x == 12;
        System.out.println(bb); //bolean popoxakan@ klini true ete x=12, hakarak depqum klini false,mer orinakum klini false,qani vor x=9
        System.out.println(x != 45); //!=-havasar chi, aysinqn qani vor mer mot x havasar chi 45, aysinqn 9a, apa ktpi true
        System.out.println(x > 4);
        System.out.println(x <= 44);// sranq bolor@ boolean artahaytutyunner en

        x = 4;
        System.out.println(x % 2 == 0); //aysinqn tpel true kam false,ete x-@ zuyg e, mer depqum zuyg e,qani vor 4-@ aranc mnacord bajanvum e 2-i,aysinqn klini true

        //&&-ev,||-kam,notlogical operators-ner@ ashxatum en boolean popoxakanneri het,orinak inchpes asenq,vor x-@ lini mianish tiv
        System.out.println(x >= 1 && x <= 9); //&&-ev gorcoxutyun@ kta true, er olor koxmer@ true en,ete koxmeric mek@ exav false,apa gorcoxutyun@// klini false
        boolean mianish = x >= 1 && x <= 9; //nuyn greladzevn e

        //||-kam gorcoxutyan depqum gorcoxutyun@ true e,ete koxmeric tekuz mek@ true e,ev false e, ete bolor koxmern el false en
        boolean vv = x < 0 || x > 100;

        //Not
        vv = true;  //kamayakan boolean popoxakani dimac, ete dnenq !-not nshan@, inq@ arjeq@ kshrji, aysinqn ete false e, kdarna true, ete true e kdarna false
        System.out.println(!vv);

        //bitayin  gorcoxutyunner
        System.out.println(5 & 8); //evi depqum 5-i ev 8-i mnacordner@ bazmapatkum enq
        System.out.println(5 | 8); // kami depqum gumarum enq
        System.out.println(17 & 24);

        //^-iqsor gorcoxutyun` ete biter@ nuynn en,nranc arjeq@ kta 0,hakarak depqum talis e 1
        System.out.println(5 ^ 8); //stacvum e bitayin gorcoxutyunneri depqum tver@ petqe veracel 1-eri ev 0-neri, heto stanal tver

        //veragrman gorcoxutyunner
        x = 5;
        x = x + 2; //sa veragrman gorcoxutyun e, vor@ kareli naev grel hetevyal kerp` x += 2,sa karch greladzeva
        System.out.println(x);
        x = 17;
        x = x & 9; // nuynn e te
        x &= 9;
        System.out.println(x);
        //ALT+CTRL+L xaxtvac  text@ dasavorum e
    }
}
