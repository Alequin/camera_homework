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

  public String getCameraCollectionDetails(){
    String output = "";
    int length = this.cameras.size();
    for(int j=0; j<length; j++){
      if(j < length-1){
        output += this.cameras.get(j).printDetails() + "\n";
      }else{
        output += this.cameras.get(j).printDetails();
      }
    }
    return output;
  }

}
