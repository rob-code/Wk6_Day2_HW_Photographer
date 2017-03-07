class AnalogueCamera implements Camera{

  public String printDetails(){
    return "Camera Type: " + typeOfCamera() + " " + "Lens: " + lensType() + " Shutter Speed : " + shutterSpeed();
  }

  private String typeOfCamera(){
    return "analogue";
  }

  private String lensType(){
    return "120 - 400mm";
  }

  private String shutterSpeed(){
    return "250 micro seconds";
  }



}