class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    Tree tree2 = new Tree("Maple", "broadleaf", true, "red");
    tree1.print();
    tree2.print();
    tree1.setName("Spruce");
    tree1.setType("Confier");
    tree1.print();

  }

}
class Tree 
{
  String treeName;
  String treeType;
  boolean leavesFall;
  String leafColor;

  Tree()
  {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String setName, String setType, boolean setFall, String setColor)
  {
    treeName = setName;
    treeType = setType;
    leavesFall = setFall;
    leafColor = setColor;
  }

  void setName(String theName) 
  {    
    treeName = theName;  
  } 
  void setType(String theType) 
  {    
    treeType = theType;  
  }
  void setFall(boolean theFall) 
  {    
    leavesFall = theFall;  
  } 
  void setColor(String theColor) 
  {    
    leafColor = theColor;  
  }

  void print()
  {
    System.out.print("This is a " + this.treeName + " tree.  ");
    System.out.print("It is a " + this.treeType + "and its leaves are currently " + this.leafColor + ".  ");
    if (leavesFall == true)
    {
      System.out.println("It does lose its leaves for the winter.");
    }
    else
    {
      System.out.println("It does not lose its leaves for the winter.");
    }
  }
}
