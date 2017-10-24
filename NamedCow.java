class NamedCow extends Cow
{
  private String myType;
  private String mySound;
  private String myName;
  public NamedCow(String name, String type, String sound)
    {
      myName="Elsie";
      myType=type;
      mySound=sound;
    }
  public NamedCow()
  {
    myName="Elsie";
    myType="unkown";
    mySound="unkown";
  }
  public String getName()
  {
    return "Elsie";
  }
  public String getSound()
  {
    return mySound;
  }
  public String getType()
  {
    return myType;
  }
}