class Chick implements Animal 
{     
  private String myType;
  private String mySound;
  public Chick(String type, String sound)
  {
    myType=type;
    mySound=sound;
  }
  public Chick()
  {
    myType="unknown";
    mySound="unkown";
  }
  public String getSound()
  {
    if(Math.random()<.5)
      return mySound;
     else return " cheep";
  }
  public String getType()
  {
    return myType;
  }
}