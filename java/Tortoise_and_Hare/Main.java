        /*Tosbağa ve Tavşan Yarışı 
        70 kareden oluşan bir alanda yarış yapılmaktadır.İlk 70. alana ulaşan yarışı kazanır(dizi kullandığından 0-69 arası)
        
        Rastgele 1-10 arasında  üretilen 2 sayı var .
        Tavşan için;
        1 veya 2 gelirse => Uyku hiç hareket etme
        3 veya 4 gelirse => 9 kare ileri hareket et
        5 gelirse => 12 kare geri hareket et
        6-7-8 gelirse => 1 kare ileri hareket et
        9 veya 10 gelirse => 2 kare geri hareket et
        
        Tosbağa İçin;
        1-2-3-4-5 gelirse => 3 kare ileri hareket et
        6 veya 7 gelirse => 6 kare geri hareket et
        8-9-10 gelirse => 1 kare ileri hareket et.
                    
*/
import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
        Tortoise kaplumbaga1=new Tortoise("DonaTello","sürüngen");
        Hare tavsan1 =new Hare("Bugs Bunny","memeli");

        String[] kareler=new String[70];


        for (int i=0; i<kareler.length;i++){
            kareler[i]="-";
        }
        kareler[0]="T/K";

        SecureRandom rast=new SecureRandom();



        while(true){

            int kapSayi=rast.nextInt(10)+1;
            int tavSayi=rast.nextInt(10)+1;

            System.out.println("\n"+kapSayi+" kaplumbaga konum= "+kaplumbaga1.getKonum());
            System.out.println(tavSayi+"  tavşan konum= "+tavsan1.getKonum()+"\n");



             if(tavSayi==3 || tavSayi==4){
                kareler[tavsan1.getKonum()]="-";
                tavsan1.ileriGit(9);
                kareler[tavsan1.getKonum()]="T";


            }
            else if(tavSayi==5){
                kareler[tavsan1.getKonum()]="-";
                tavsan1.geriGit(5);
                kareler[tavsan1.getKonum()]="T";



            }
            else if(tavSayi>=6 && tavSayi<=8){
                kareler[tavsan1.getKonum()]="-";
                tavsan1.ileriGit(1);
                kareler[tavsan1.getKonum()]="T";


            }
            else{
                kareler[tavsan1.getKonum()]="-";
                tavsan1.geriGit(2);
                kareler[tavsan1.getKonum()]="T";


            }


            if(kapSayi>=1 && kapSayi<=5  ){
                kareler[kaplumbaga1.getKonum()]="-";
                kaplumbaga1.ileriGit(3);
                kareler[kaplumbaga1.getKonum()]="K";

            }
            else if(kapSayi==6 || kapSayi==7){
                kareler[kaplumbaga1.getKonum()]="-";
                kaplumbaga1.geriGit(6);
                kareler[kaplumbaga1.getKonum()]="K";

            }
            else{
                kareler[kaplumbaga1.getKonum()]="-";
                kaplumbaga1.ileriGit(1);
                kareler[kaplumbaga1.getKonum()]="K";

            }




            if(tavsan1.getKonum()<69 && kaplumbaga1.getKonum()<69){
                kareler[tavsan1.getKonum()]="T";
                kareler[kaplumbaga1.getKonum()]="K";

            }
            if(tavsan1.getKonum()==kaplumbaga1.getKonum()){
                kareler[tavsan1.getKonum()]="T/K";
            }
            for(int j=0;j<kareler.length;j++){
                System.out.print(kareler[j]+" ");
            }
            System.out.println();
            System.out.println(" kaplumbaga konum= "+kaplumbaga1.getKonum());
            System.out.println("  tavşan konum= "+tavsan1.getKonum());
            if(tavsan1.getKonum()==69 || kaplumbaga1.getKonum()==69){
                if(tavsan1.getKonum()==69){
                    System.out.println(" HARE   WINS!!! YAY!! ");

                    break;
                }
                else if(kaplumbaga1.getKonum()==69){
                    System.out.println(" TORTOISE  WINS!!! YAY!! ");
                    break;
                }
                else if(kaplumbaga1.getKonum()==69 && tavsan1.getKonum()==69){
                    System.out.printf("It’s a tie between %s and  %s", tavsan1.getAdi(),kaplumbaga1.getAdi());

                    break;
                }

            }

            System.out.println("******************************************************************************************************\n");

        }


    }

}
