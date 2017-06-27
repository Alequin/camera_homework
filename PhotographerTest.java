import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PhotographerTest{

  private Photographer photographer;
  private DigitalCamera digitalCamera;
  private AnalogCamera analogCamera;

  @Before
  public void setup(){
    photographer = new Photographer();
    camera = new Camera();
  }

  @Test
  public void canAddCameraToPhotographer(){
    photographer.addCamera(digitalCamera);
    assertEquals(1, photographer.getCameraCount());
  }

  @Test
  public void canRemoveCameraFromPhotographer(){
    photographer.addCamera(analogCamera);
    photographer.removeCamera();
    assertEquals(0, photographer.getCameraCount());
  }
}
