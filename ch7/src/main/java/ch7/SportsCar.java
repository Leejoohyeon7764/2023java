package ch7;

public class SportsCar extends car{

   double turbo = 2;

   //double speed = 1;

   

   public SportsCar() {

      super(1, 2);

   }

   

   public void Setspeed(double speed) {

      this.speed = speed * turbo;

   }

   

   void SetTurboFactor(double turboFactor) {

      this.turbo = turboFactor;

   }



}