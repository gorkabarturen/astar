import java.util.List;


public abstract class Node implements Comparable {

  Node pathParent;
  float costFromStart;
  float estimatedCostToGoal;

  public float getCost() {
    return costFromStart + estimatedCostToGoal;
  }

  public int compareTo(Object other) {
    float thisValue = this.getCost();
    float otherValue = ((Node)other).getCost();

    float v = thisValue - otherValue;
    return (v>0)?1:(v<0)?-1:0; // sign function
  }

  public abstract float getCost(Node node);

  public abstract float getEstimatedCost(Node node);

  public abstract List getNeighbors();
}  