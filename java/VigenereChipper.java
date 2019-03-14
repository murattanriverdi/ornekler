 /*
 ******************************************** VİEGNERE ŞİFRELEME ******************************************************************
Bu şifreleme Fransız kriptograf Blaise de Vigenere'e atfedilen bir yöntemdir. Bunun gibi birden fazla şifreleme alfabesi kullanan şifreler, çoklu alfabeli (Polyalphabetic) şifreleme yöntemi olarak adlandırılır. Bu tür yöntemler frekans analizi gibi deşifre tekniklerine karşı dirençli olmakla birlikte Vigenere şifresi uzun yıllar boyu Le Chiffre Undechiffrable (kırılamaz şifre) olarak anılmıştır. Yaklaşık 200 sene sonra, 1854 yılında İngiliz kriptograf Charles Babbage tarafından kırılmıştır. Vigenere şifrelemesinin Sezar şifrelemeden en büyük farkı çoklu alfabe kullanarak şifrelemenin yapılmasıdır. Arkasında yatan mantık ise Sezar şifrelemeyle aynıdır: Belirli bir anahtara göre şifrelenmek istenen kelimedeki harfleri kaydırmak. Peki nedir bu çoklu alfabe muhabbeti? Öncelikle kelimemizi şifrelemek için herhangi bir uzunlukta anahtar kelime seçiyoruz. Ve artık elimizde şifrelemek için anahtardaki farklı harf sayısı kadar alfabe var. Seçilen anahtara göre her harf kelime içindeki sırasına göre anahtar kelimedeki harfle başlayan yeni bir alfabe oluşturularak sırayla kaydırma yapılır. 

 Kısacası Metin ve Anahtar Kelimelerin harflerinin index değerler toplanarak bulunan indexi yeni harf olarak belirliyoruz.

*/


import javax.swing.*;

public class  VigenereChipper{
    static final String alfabe ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {

        while(true){
           String secim= JOptionPane.showInputDialog("Metin Şifrelemek İçin \"1\" \n" +
                   "Şifreli Metini Çözmek İçin \"2\" \n" +
                   "Çıkmak İçin  \"0\" \n" +
                   "Seçiminiz: ");
            if(secim.equals("1")){
                String text=JOptionPane.showInputDialog("Şifrelemek İstediğiniz Metni Giriniz (Boşluk Karekterini Kullanmayınız):");
                String key=JOptionPane.showInputDialog("Metin Şifrelemek İçin Anahtar Kelimeyi Giriniz(Boşluk Karekterini Kullanmayınız):");
                JOptionPane.showMessageDialog(null,"Şifrelenmiş Metin= "+encrypt(text,key));
            }
            else if (secim.equals("2")){
                String text=JOptionPane.showInputDialog("Çözmek İstediğiniz Metni Giriniz (Boşluk Karekterini Kullanmayınız):");
                String key=JOptionPane.showInputDialog("Metni Çözmek İçin Anahtar Kelimeyi Giriniz (Boşluk Karekterini Kullanmayınız):");
                JOptionPane.showMessageDialog(null,"Çözülmüş Metin= "+decrypt(text,key));
            }
            else if(secim.equals("0")){
                break;
            }
            else{
                JOptionPane.showMessageDialog(null,"Hatalı Tuşlama Girdiniz! Tekrar Tuşlama Yapınız");
            }
        }

    }


        //Büyük harf yapma metodu
    public static String toUpperString(String text)
    {
        return text.toUpperCase();

    }



    public static String encrypt(String originalText, String key)
    {
                //Kelimleri Büyük Harf Yapmak için
        originalText=toUpperString(originalText);
        key=toUpperString(key);
         StringBuilder sifreliMetin = new StringBuilder();


        int j=0;

        for (int i = 0; i < originalText.length(); i++) {

                    //Anahtar kelime metinden daha kısaysa metine eşitlenene kadar tekrar etmesi
            if ((key.length())== j) {
                j=0;
            }
                int toplam=((alfabe.indexOf(originalText.charAt(i))) +  (alfabe.indexOf(key.charAt(j))))+1;
                j++;

                        //Alfabe 26 harften oluştuğundan toplamlar 26dan fazla olursa mod işlemini uygulayıp kalana göre işlem yapıyoruz.
            if (toplam>=26){
                    toplam%=26;
                }
                sifreliMetin.append(alfabe.charAt(toplam));




        }
        return sifreliMetin.toString();

    }


    public static String decrypt(String encryptedText, String key )
    {
                //Kelimleri Büyük Harf Yapmak için
        encryptedText=toUpperString(encryptedText);
        key=toUpperString(key);

        StringBuilder cozulmusMetin=new StringBuilder();

        int j=0;
        for (int i = 0; i < encryptedText.length(); i++) {

                    //Anahtar kelime metinden daha kısaysa metine eşitlenene kadar tekrar etmesi
            if ((key.length())== j) {
                j=0;
            }

                    //
            int cikar=((alfabe.indexOf(encryptedText.charAt(i))) -  (alfabe.indexOf(key.charAt(j))));
            j++;

                    //Alfabe 26 harften oluştuğundan toplamlar 26dan fazla olursa mod işlemini uygulayıp kalana göre işlem yapıyoruz.
            if (cikar<=0){
                cikar+=26;
            }
            cozulmusMetin.append(alfabe.charAt(cikar-1));
        }
        return  cozulmusMetin.toString();

    }






}

