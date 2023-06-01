/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradas;
import java.util.Scanner;

public class menu{

string paradasbus ="";
 private Scanner input= new Scanner(System.in);
    public void menu(){
        
System.out.println("--Bienvenido"
 + "por favor selecion su opcion--");
System.out.println(
    "Nuestro menu:  \n"
 + "1) consultar paradas buses \n"
 + "2) consultar horarios rutas \n"
 + "extemdido \n");
int selection = input.nextInt();

        switch (selection){
        case 1:
           consultarparadas();
        System.out.println("--1111111--");
        break;

        case 2:
            consultarhorario();
        System.out.println("-222222222--");
        break;
         }

    }   
void consultarparadas(){
        System.out.println("por favor introduzca"
 + "el numero de ruta:");

String ruta="";
Scanner entradaEscaner= new Scanner(System.in);

ruta=entradaEscaner.nextLine();

System.out.println("el numero de identidad"
 +"ques usted ha ingresado es : \""+ruta+"\"");

paradasbus1 lasparadas = new paradasbus1;

paradasbus =  paradasbus1.lasparadasdebus(ruta);
System.out.println("el recorrido que realiza la ruta es" +paradasbus);
{
    
}
  void consultarhorario(){

    System.out.println("El horario de las rutas G63 es de lunes a domingos no incluye feriados, El horario de las rutas b11 es de lunes a domingo, incluye feriados");
   