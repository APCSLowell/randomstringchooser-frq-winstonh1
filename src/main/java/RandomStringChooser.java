import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> Xarray;
  public RandomStringChooser(String[]x){
    Xarray = new ArrayList<String>();
    for(int i =0; i < x.length; i++){
      Xarray.add(x[i]);
    }
  }
  public String getNext(){
    if(Xarray.size() == 0){
      return "NONE";
    }
    int index  = (int)(Math.random()*Xarray.size());
    String y = Xarray.get(index);
    Xarray.remove(index);
    return y;
  }
}
