
//Palindrom sağdan sola okunuşu ile sağdan sola okunuşu aynı şekilde olan bir karakter dizisidir.


import javax.swing.*;

public class palindrom {

    public static void main(String[] args) {
        while(true){
            String text= JOptionPane.showInputDialog("Kelime Giriniz \n Çıkmak İçin Sıfıra Basınız");

            if(!text.equals("0")){
                palindromMu(text);
            }
            else{
                break;
            }
        }
    }
    public static  void  palindromMu(String kelime){
        int j=kelime.length()-1;
        boolean durum=true;
        for (int i=0; i<kelime.length();i++){

            if(kelime.charAt(i)!=kelime.charAt(j)){
                durum=false;
                break;
            }
            j-=1;
        }
        if(durum){
            JOptionPane.showMessageDialog(null,kelime +"= Palindromdur");
        }
        else{
            JOptionPane.showMessageDialog(null,kelime +"= Palindrom Değildir");
        }
    }
}

