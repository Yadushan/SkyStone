  rightDrive = hardware
  
  waitForStart();
  
  drive(motorPower(0.4),1000);
  drive(motorPower(0.2),300);
  drive(motorPower(-0.3),100);

}
  public double motorPower(double speed) {
  double power = 1*speed;
  return power;
}
  public void drive(double power, double time) {
  leftDrive.setPower(.power);
  rightDrive.setPOwer(.power);
  sleep(time);
  }
}
