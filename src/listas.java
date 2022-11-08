import java.util.*;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

@SuppressWarnings("CollectionAddedToSelf")
public class listas {
  public static List<String> nombres = Arrays.asList("Oswaldo","Edwin","Carlos","Juan","Hugo","Pedro","Eusebio","Angel","Misael","Eduardo","ivan");


    public void sort(){

       interface  Alfabetico{
             static void ordenalfabetico(){   Collections.sort(nombres, CASE_INSENSITIVE_ORDER);

                 System.out.println( "regresando los nombres en orden alfabetico desde clase anonima: " +"\n "+ nombres);}
        }
      Alfabetico.ordenalfabetico();

     interface  longitud {
       static void orden(){
            Collections.sort(nombres,Comparator.comparing(String::length));
           System.out.println("-------------------------------------------------------");
       System.out.println("Regresando los nombres por longitud desde clase anonima"+"\n " +nombres); }

     } longitud.orden();
        System.out.println("-------------------------------------------------------");
     interface lam_alfabeto{

          static void lambalfb (){
              nombres.forEach(n -> nombres.get(0));
                Collections.sort(nombres,(n1,n2)->n1.compareToIgnoreCase(n2));
                System.out.println("lista con lambda en orden alfabetico"+"\n " + nombres);
          }
     }   lam_alfabeto.lambalfb();
     System.out.println("-------------------------------------------------------");
      interface  lam_longitud{
          static  void  lb_longtid(){
              nombres.forEach(n -> nombres.get(0));
              Collections.sort(nombres,(n1,n2)->Integer.compare(n1.length(),n2.length()));
              System.out.println("longitud nombres por lambda: "+"\n " + nombres);
          }
      } lam_longitud.lb_longtid();
        System.out.println("-------------------------------------------------------");
    interface regreso_longitud{
        static List<String> regreso (){
            nombres.forEach(n -> nombres.get(0));
            Collections.sort(nombres,(n1,n2)->Integer.compare(n1.length(),n2.length()));
        return nombres ; }
           }
    System.out.println("lista pordenada por longitud regresando los nombrs"+"\n "+ regreso_longitud.regreso());
        System.out.println("-------------------------------------------------------");
        interface regreso_alfabetico{
            static List<String> regreso (){
                nombres.forEach(n -> nombres.get(0));
                Collections.sort(nombres,(n1,n2)->n1.compareToIgnoreCase(n2));
                return nombres ; }

        }
        System.out.println("Regresando los nombres en orden alfabetico desde el metodo"+"\n "+regreso_alfabetico.regreso());
    }

}



