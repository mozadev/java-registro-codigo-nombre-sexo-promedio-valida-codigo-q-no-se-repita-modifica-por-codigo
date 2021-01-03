
package prueba10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prueba10 {

   public static void main(String[] args) {
        int x,opc,cont=0,j,t;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes: "));
        String cade;
        String vec[]=new String[x];
        boolean band,car;
        int vec2[]=new int[x];
        String vec3[]=new String[x];
        int vec4[]=new int[x];
        int vec5[]=new int[x];
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("\t..:MENU:.."+
                    "\n1. Ingreso de datos, validando que el código no se repita"+
                    "\n2. Búsqueda de datos por código"+
                    "\n3. Modificación de datos por código"+
                    "\n4. Mostrar"+
                    "\n5. Salir"+
                    "\n\nDigite una opcion: "));
            switch(opc){
                case 1: 
                    for(int i=0;i<x;i++){
                       vec[i]=JOptionPane.showInputDialog((i+1)+". Digite un nombre: ");
                       car=true;
                       do{
                        car=true;
                        vec2[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Digite un código: "));
                        vec5[i]=vec2[i];
                        band=true;
                        j=0;
                        while((band!=false)&&(j<i)&&(i>0)){
                            if(vec2[i]==vec5[j]){
                                band=false;
                                car=false;
                                JOptionPane.showMessageDialog(null,"El código ingresado ya existe");
                            }
                            j++;
                        }
                                                
                       }while(car!=true);
                       vec3[i]=JOptionPane.showInputDialog((i+1)+". Digite un sexo: ");
                       vec4[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Digite un promedio"));
                    }  
                    break;
                case 2:
                    band=true;
                    cade="";
                    t=Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo: "));
                    for(int i=0;i<x;i++){
                        if(vec2[i]==t){
                            JOptionPane.showMessageDialog(null,"El codigo si esta registrado");
                            cade+=vec[i]+"     "+vec2[i]+"     "+vec3[i]+"     "+vec4[i]+"\n";
                            band=false;
                            JOptionPane.showMessageDialog(null,"NOMBRE      CODIGO       SEXO       PROMEDIO\n"+cade);
                        }
                    }
                    if(band==true){
                        JOptionPane.showMessageDialog(null,"El codigo no esta registrado");
                    }
                    break;
                case 3:
                    int d,n2,n4;
                    String n1,n3;
                    band=true;
                    cade="";
                    t=Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo: "));
                    for(int i=0;i<x;i++){
                        if(vec2[i]==t){
                            JOptionPane.showMessageDialog(null,"El codigo si esta registrado");
                            band=false;
                            do{
                                d=Integer.parseInt(JOptionPane.showInputDialog("\t..:DATOS A MODIFICAR:.."+
                                "\n1. Nombre"+
                                "\n2. Codigo"+
                                "\n3. Sexo"+
                                "\n4. Promedio"+
                                "\n5. Salir"+
                                "\n\nDigite una opcion: "));
                                if(d==1){
                                    n1=JOptionPane.showInputDialog("Digite el nuevo nombre: ");
                                    vec[i]=n1;
                                }
                                else if(d==2){
                                    n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo codigo: "));
                                    vec2[i]=n2;
                                }
                                else if(d==3){
                                    n3=JOptionPane.showInputDialog("Digite el nuevo sexo: ");
                                    vec3[i]=n3;
                                }
                                else if(d==4){
                                    n4=Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo promedio: "));
                                    vec4[i]=n4;
                                }
                            }while(d!=5);
                        }
                    }
                    if(band==true){
                        JOptionPane.showMessageDialog(null,"El codigo no esta registrado");
                    }
                    break;
                case 4:
                    cade="";
                    for(int i=0;i<x;i++){
                        cade+=vec[i]+"     "+vec2[i]+"     "+vec3[i]+"     "+vec4[i]+"\n";
                    } 
                    JOptionPane.showMessageDialog(null,"NOMBRE      CODIGO       SEXO       PROMEDIO\n"+cade);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"\tGRACIAS POR USAR EL MENÚ");break;
            }
        }while(opc!=5);
        
        
    }
    
}