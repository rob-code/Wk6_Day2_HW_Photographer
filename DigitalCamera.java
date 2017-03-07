class DigitalCamera implements Camera{

  public String printDetails(){
    return "Camera Type: " + typeOfCamera() + " " + "Lens: " + lensType() + " Shutter Speed : " + shutterSpeed();
  }

private String typeOfCamera(){
  return "digital";
}

private String lensType(){
  return "80 - 150mm";
}

private String shutterSpeed(){
  return "10 milli seconds";
}


}