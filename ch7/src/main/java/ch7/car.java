package ch7;

public class car {
	double speed = 1;

	   double position = 0;

	   

	   public car() {}

	   car(double speed, double position){

	      this.speed = speed;

	      this.position = position;

	}

	   

	   public void SetSpeed(double speed) {

	      this.speed = speed;

	   }

	   

	   public void Move () {

	      position += speed;

	   }

}
