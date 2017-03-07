import java.util.*;
import java.util.HashMap;

public class Photographer{

  private ArrayList<Camera> cameras;
  HashMap<String, Integer>journal = new HashMap<String, Integer>();

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

  public void addJournalEntry(String date, Integer number){
    journal.put(date, number);
  }

  public void printJournalEntries(){
    System.out.println("Journal entries are :");

    for (String key : journal.keySet()) {
      System.out.println("Date : " + key + ", Number of Photographs : " + journal.get(key));
    }


  }


}
