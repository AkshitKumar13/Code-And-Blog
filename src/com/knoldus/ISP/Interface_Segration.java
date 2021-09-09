package com.knoldus.ISP;


  interface Athlete {
    void compete();
}
    interface SwimmingAthlete extends Athlete {
      void swim();

}
    interface JumpingAthlete extends Athlete {
      void highJump();
      void longJump();

}


