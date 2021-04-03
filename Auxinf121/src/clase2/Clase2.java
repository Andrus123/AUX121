/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author andru
 */
public class Clase2 {
    
    //2) Verificar cuál es la fruta con más vitaminas
    public static void MaxV (Fruta f, Fruta f1, Fruta f2){
        int maxV = 0;
        String maxF = "";
        if(f.getNroVit()>f1.getNroVit()){
            maxV = f.getNroVit();
            maxF = f.getNombre();
        }
        else{
            maxV = f1.getNroVit();
            maxF = f1.getNombre();
        }
        if (f2.getNroVit()>maxV){
            maxV = f2.getNroVit();
            maxF = f2.getNombre();
        }
        System.out.println("\nLa fruta con más vitaminas es: " + maxF);
        System.out.println("Con un máximo de: " + maxV + " vitaminas");
    }            
    
    public static void main(String[] args){
        //1)Instanciar de 3 maneras diferentes 3 FRUTAS con al menos 3 vitaminas diferentes
        Fruta f = new Fruta("Naranja","citrico", 3);
        f.leer2();
        Fruta f1 = new Fruta("Lima","citrico");
        f1.leer1();
        Fruta f2 = new Fruta();
        f2.leer();
        f.mostrar();
        f1.mostrar();
        f2.mostrar();
        //2)
        MaxV(f,f1,f2);
        //3) Mostrar las vitaminas de la fruta x
        System.out.println("Nombre x: ");
        String x = Leer.dato();
        f.mostrarVitX(x);
        f1.mostrarVitX(x);
        f2.mostrarVitX(x);
        //4) Contar las futas citricas
        f.ContarCitricos(f2,f1);
    }
}
