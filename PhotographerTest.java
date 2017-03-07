import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogueCamera analogueCamera;

  @Before
  public void before(){
    photographer = new Photographer();
    analogueCamera = new AnalogueCamera();
    digitalCamera = new DigitalCamera();
  }

  @Test
  public void getNumberOfCameras(){
    assertEquals(0, photographer.numberOfCameras()); 
  }

// @Test
// public void canAddCamera(){
// photographer.addCamera(camera)
// assertEquals(1, photographer.numberOfCameras());
// }


}


