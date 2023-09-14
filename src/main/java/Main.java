import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args)
    {
        Train unTrain;
        unTrain = new Train() ;
        unTrain.enMarche = true ;
        unTrain.demarrer();



        // Affichez la vitesse. A COMPLETER
        System.out.println(unTrain.getVitesse());
        // Faites passer la vitesse à 30. A COMPLETER
        unTrain.setVitesse(30);
        // Affichez la vitesse. A COMPLETER
        System.out.println(unTrain.getVitesse());



        // Faites passer la vitesse à 60. A COMPLETER
        unTrain.setVitesse(60);
        // Affichez la vitesse. A COMPLETER
        System.out.println(unTrain.getVitesse());



        // Faites passer la vitesse à 0. A COMPLETER
        unTrain.setVitesse(0);
        // Affichez la vitesse. A COMPLETER
        System.out.println(unTrain.getVitesse());

        unTrain.stopper();
        unTrain.enMarche = false;
    }


}
