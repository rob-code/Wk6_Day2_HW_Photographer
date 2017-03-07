import java.util.*;

public class Photographer{

  private ArrayList<Camera> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
  }

  public int numberOfCameras(){
    return cameras.size();
  }

public void addCamera(Camera camera){
    cameras.add(camera);
}

public void removeCamera(){
    cameras.remove(numberOfCameras()-1);
}

public void printCameraList(){
  String details = "";
  for (Camera camera : cameras){
    details = camera.printDetails();
    System.out.println(details);
  }
}




}
