package pt.lsts.dolphin.runtime;

import pt.lsts.dolphin.util.wgs84.WGS84;

public strictfp final class Position {
  
  /**
   * Degrees-to-radians conversion constant.
   */
  public static final double D2R = Math.PI / 180.0;
  
  /**
   * Radians-to-degrees conversion constant.
   */
  public static final double R2D = 180.0 / Math.PI;
  
  public final double lat, lon, hae;
  
  public static 
  Position fromDegrees(double lat, double lon, double hae) {
    return new Position(lat * D2R, lon * D2R, hae);
  }
  
  public Position(double lat, double lon) {
    this(lat, lon, 0);
  }
  
  public Position(double lat, double lon, double hae) {
    this.lat = lat;
    this.lon = lon;
    this.hae = hae;
  }
 
  public double distanceTo(Position other) {
    return WGS84.distanceTo(this, other);
  }
  
  public boolean near(Position p, double r) {
    return distanceTo(p) <= r;
  }
  
  @Override
  public String toString() {
    return String.format("(%.6f,%.6f,%.3f)", R2D * lat, R2D * lon, hae);
  }
}
