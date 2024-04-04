/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cars;

/**
 *
 * @author Estudiantes
 */
public class Cars{
  int modelYear;
  String modelName;
  int prize;

  //constructor
  public Cars(int year, String name, int initialPr){
    modelYear = year;
    modelName = name;
  }


  public int incremento(int p) {
    prize = prize + p;
    return prize;
  }

 public static void main(String[] args){
  Cars myCar = new Cars (1696, "Mustang",0);
  System.out.println(myCar.modelName + " " + myCar.modelYear + " " + myCar.prize);
  myCar.incremento(1000);
  System.out.println(myCar.modelName + " " + myCar.modelYear + " " + myCar.prize);
  myCar.incremento(1000);
  System.out.println(myCar.modelName + " " + myCar.modelYear + " " + myCar.prize);
  myCar.incremento(1000);
  System.out.println(myCar.modelName + " " + myCar.modelYear + " " + myCar.prize);
 }
