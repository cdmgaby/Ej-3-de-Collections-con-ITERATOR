
package Alserv;
import Alent.ALEnt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ALServ {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    private ArrayList<ALEnt>Alumnos;
    
//esto ponerlo siempre lo de inicializar el constructor vacio con la array
    public ALServ() {
        this.Alumnos =new ArrayList();   
    }
    
   public ALEnt CrearAlumno(){
       ALEnt m=new ALEnt();
       
       System.out.println("Ingrese nombre del alumno");
       m.setNombre(leer.next());
       System.out.println("Ingrese la 1° nota del alumno");
       Integer nota1=leer.nextInt();
       System.out.println("Ingrese la 2° nota del alumno");
       Integer nota2=leer.nextInt();
       System.out.println("Ingrese la 3° nota del alumno");
       Integer nota3=leer.nextInt();
       
       ArrayList<Integer>notas = new ArrayList();
       notas.add(nota1);
       notas.add(nota2);
       notas.add(nota3);
       m.setNotas(notas);
       return m;
     
   }
   
   public void AgregarAlumno(ALEnt m){
       Alumnos.add(m);
       
   }
   
   public void Recorrer(){
       System.out.println("La lista es");
       for(ALEnt aux:Alumnos){
           System.out.println(aux.toString());
       }
    }

     
 public void Notafinal(){
       
     System.out.println("Ingrese el nombre del alumno a calcular promedio");
     String nombre=leer.next();
      int suma=0;
     
     Iterator<ALEnt> it=Alumnos.iterator();
     while(it.hasNext()){
         ALEnt aux=it.next();
         String m=aux.getNombre();
        if(m.equalsIgnoreCase(nombre)){
            ArrayList<Integer> novo=aux.getNotas();
            for(int i=0;i<novo.size();i++){
                suma=suma+novo.get(i);
                
            }
            double promedio=suma/3;
            
            System.out.println("El promedio de este alumno es: "+promedio+"");
        }else{
         System.out.println("El alumno no se encuentra en la lista");
        }
    
   }
      
}
    
    
 public void PreguntaSiQuiero(){
     String cant="si";
     while(cant.equalsIgnoreCase("si")){
         ALEnt anew=CrearAlumno();
         AgregarAlumno(anew);
         System.out.println("Desea agregar otro alumno? ponga si o no");
         cant=leer.next();
     }
             
 }
         
    
    
  /*Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
