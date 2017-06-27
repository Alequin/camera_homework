import java.util.ArrayList;

public class Photographer{

  private ArrayList<Printable> cameras;

  public Photographer(){
    cameras = new ArrayList<Printable>();
  }

  public int getCameraCount(){
    return cameras.size();
  }

  public void addCamera(Printable camera){
    cameras.add(camera);
  }

  public void removeCamera(){
    if(getCameraCount() > 0){
      cameras.remove(0);
    }
  }

}
