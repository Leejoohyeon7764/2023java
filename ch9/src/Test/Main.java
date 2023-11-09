package Test;

import Test.A.C;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      // TODO Auto-generated method stub
            A a = new A();
            A.B b = a.new B();
            A.C c = new A.C();
            c.field1 = 10;
            c.field2 = 20;


   }

}