import java.util.Scanner;

public class Calificaciones {
String nombre = "";
int[] calif = new int[5];
float promedio;
char nota;
public float promedioCal(){
    float promedio=0;
    int suma=0;

    for (int i = 0; i<calif.length; i++) {
        suma+=calif[i];
    }

    promedio = (suma/calif.length);

    return promedio;
}

public char calificacion(float pPromedio) {
    char nota =' ';
    if (pPromedio <= 50){
        nota = 'F';
    }
    if (pPromedio >= 51 && pPromedio <= 60){
        nota = 'E';
    }
    if (pPromedio >= 61 && pPromedio <= 70){
        nota = 'D';
    }
    if (pPromedio >= 71 && pPromedio <= 80){
        nota = 'C';
    }
    if (pPromedio >= 81 && pPromedio <= 90){
        nota = 'B';
    }
    if (pPromedio >= 91 && pPromedio <= 100){
        nota = 'A';
    }
    if (pPromedio >= 101){
        System.out.println("El rango no es el pertmido");
    }

    return nota;
}

public void imprime(String pNombre, float pPromedio,char pNota){
    System.out.println("Nombre del estudiante: " + pNombre);
    System.out.println("Calificacion 1: " + calif[0]);
    System.out.println("Calificacion 2: " + calif[1]);
    System.out.println("Calificacion 3: " + calif[2]);
    System.out.println("Calificacion 4: " + calif[3]);
    System.out.println("Calificacion 5: " + calif[4]);
    System.out.println("Promedio: " + promedioCal());
    System.out.println("Calificacion: " + calificacion(promedioCal()));

}

public void setNombre(String pNombre){
    nombre = pNombre;
}

public void setCalificaciones(){
    Scanner s = new Scanner(System.in);

    System.out.print("Calificacion 1: ");
    calif[0]=s.nextInt();

    System.out.print("Calificacion 2: ");
    calif[1]=s.nextInt();

    System.out.print("Calificacion 3: ");
    calif[2]=s.nextInt();

    System.out.print("Calificacion 4: ");
    calif[3]=s.nextInt();

    System.out.print("Calificacion 5: ");
    calif[4]=s.nextInt();

}
}
