package app;

import model.EletronicToy;
import model.PlushToy;
import model.Toy;

public class Main {
    public static void main(String[] args) {
      Toy[] toys = new Toy[3];
      toys[0] = new Toy("T01", "Bo Xep Hinh", 200,10);
      toys[1] = new EletronicToy("E01", "RoBot Thong minh", 800,5,12);
      toys[2] = new PlushToy("P01", "Gau bong teddy", 300,8,"bong gon");
      for(Toy toy : toys){
          toy.printInfo();
          System.out.println(" ");
      }
    }
}