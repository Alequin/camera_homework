import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PhotographerTest{

  private Photographer photographer;
  private Camera camera;

  @Before
  public void setup(){
    photographer = new Photographer();
    camera = new Camera();
  }
}
