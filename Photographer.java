import java.util.ArrayList;
import java.util.HashMap;

public class Photographer{

  private ArrayList<Printable> cameras;
  private HashMap<String, Photo> journal;

  public Photographer(){
    cameras = new ArrayList<Printable>();
    journal = new HashMap<String, Photo>();
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

  public void takePhoto(String photoName, Photo photo){
    this.journal.put(photoName, photo);
  }

  public int getPhotosTakenCount(){
    return this.journal.values().size();
  }

}
