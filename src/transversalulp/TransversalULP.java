/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transversalulp;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import transversalulp.accesoadatos.AlumnoData;
import transversalulp.accesoadatos.Conexion;
import transversalulp.entidades.Alumno;

/**
 *
 * @author Seba
 */
public class TransversalULP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      //  Connection con= Conexion.getConnection();   
          
      
      
      //AGREGAR WACHOS
          Alumno a1= new Alumno(12351777, "paredes", "sandra", LocalDate.of(1996,7,21), true);
          Alumno a2= new Alumno(66651777, "gomez", "sandra", LocalDate.of(1997,3,6), true);
          AlumnoData alumnoData= new AlumnoData();
//          alumnoData.guardarAlumno(a1);
//          alumnoData.guardarAlumno(a2);


      //  MODIFICAR WACHOS
      
      
//      Alumno sebAlumno=new Alumno(1,32751482, "castro", "sebas", LocalDate.of(1987,7,1), true);
//      AlumnoData alumnoData= new AlumnoData();
      //alumnoData.modificarAlumno(sebAlumno);;
      
      
            //  matar WACHOS
 
     // alumnoData.borradoLogicoAlumno(1);
     
     
            //  mostrar WACHOS por ID
            
     Alumno alumnoEncontrado=alumnoData.buscarAlumnoPorId(1);
     
        System.out.println("DATOS ALUMNO ENCONTRADO ");
        System.err.println("    ");
        System.out.println("DNI"+ alumnoEncontrado.getDni());
        System.out.println("Nombre: "+ alumnoEncontrado.getNombre());
        System.out.println("Apellido: "+ alumnoEncontrado.getApellido());
     
     
      
      
    }
    }
    

