package pt.lsts.dolphin.util.wgs84;

/**
 * North-East-Down displacement coordinates.
 */
public strictfp final class NED {
  /** North displacement */
  public final double north;
  
  /** East displacement */
  public final double east;
  
  /** Down displacement */
  public final double down;

  /**
   * Constructor.
   * @param n North displacement.
   * @param e East displacement.
   * @param d Down displacement.
   */
  public NED(double n, double e, double d) {
    north = n;
    east = e;
    down = d;
  }
  
  @Override
  public String toString(){
    return String.format("NED(%f, %f, %f)", north, east, down);
  }
}


