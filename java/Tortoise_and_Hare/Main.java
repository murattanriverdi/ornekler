import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Arrays;

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



        if(kapSayi>=1 && kapSayi<=5){
            kareler[kaplumbaga1.getKonum()]="-";
            kaplumbaga1.ileriGit(3);
            kareler[kaplumbaga1.getKonum()]="K";

            for(int j=0;j<kareler.length;j++){
                System.out.print(kareler[j]+" ");
            }
            System.out.println();





        }
        else if(kapSayi==6 || kapSayi==7){
            kareler[kaplumbaga1.getKonum()]="-";
            kaplumbaga1.geriGit(6);
            kareler[kaplumbaga1.getKonum()]="K";
            for(int j=0;j<kareler.length;j++){
                System.out.print(kareler[j]+" ");
            }
            System.out.println();

        }
        else{
            kareler[kaplumbaga1.getKonum()]="-";
            kaplumbaga1.ileriGit(1);
            kareler[kaplumbaga1.getKonum()]="K";
            for(int j=0;j<kareler.length;j++){
                System.out.print(kareler[j]+" ");
            }
            System.out.println();

        }

        if(tavSayi==1 || tavSayi==2 ){

        }
        else if(tavSayi==3 || tavSayi==4){
            kareler[tavsan1.getKonum()]="-";
            tavsan1.ileriGit(9);
            kareler[tavsan1.getKonum()]="T";
            for(int j=0;j<kareler.length;j++){
                System.out.print(kareler[j]+" ");
            }
            System.out.println();

        }
        else if(tavSayi==5){
            kareler[tavsan1.getKonum()]="-";
            tavsan1.geriGit(5);
            kareler[tavsan1.getKonum()]="T";
            for(int j=0;j<kareler.length;j++){
                System.out.print(kareler[j]+" ");
            }
            System.out.println();


        }
        else if(tavSayi>=6 && tavSayi<=8){
            kareler[tavsan1.getKonum()]="-";
            tavsan1.ileriGit(1);
            kareler[tavsan1.getKonum()]="T";
            for(int j=0;j<kareler.length;j++){
                System.out.print(kareler[j]+" ");
            }
            System.out.println();

        }
        else{
            kareler[tavsan1.getKonum()]="-";
            tavsan1.geriGit(2);
            kareler[tavsan1.getKonum()]="T";
            for(int j=0;j<kareler.length;j++){
                System.out.print(kareler[j]+" ");
            }
            System.out.println();

        }


        if(tavsan1.getKonum()<69 && kaplumbaga1.getKonum()<69){
            kareler[tavsan1.getKonum()]="T";
            kareler[kaplumbaga1.getKonum()]="K";

        }
        else if(tavsan1.getKonum()==kaplumbaga1.getKonum()){

            kareler[tavsan1.getKonum()]="T/K";
        }
        else if(tavsan1.getKonum()==69 || kaplumbaga1.getKonum()==69){
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


        }

        for(int j=0;j<kareler.length;j++){
            System.out.print(kareler[j]+" ");
        }

        System.out.println("\n"+tavsan1.getKonum()+" tavşan");
        System.out.println(kaplumbaga1.getKonum()+" kaplumbağa");












    }

}
