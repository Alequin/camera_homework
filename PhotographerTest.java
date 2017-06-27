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
    digitalCamera = new DigitalCamera("EOS 5DS");
    analogCamera = new AnalogCamera("Alpha A7R II");
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

  @Test
  public void canAllCameraDetailsBePrinted(){
    String expected = "Analog Camera: Alpha A7R II\n" +
        "Digital Camera: EOS 5DS";
    photographer.addCamera(analogCamera);
    photographer.addCamera(digitalCamera);
    String result = photographer.getCameraCollectionDetails();
    assertEquals(expected, result);
  }
}
