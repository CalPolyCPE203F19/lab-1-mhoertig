class Point {

   private double x;
   private double y;

   public Point(double x, double y)
   {
      this.x = x;
      this.y = y;
   }
   
   public double getX()
   {
      return x;
   }

   public double getY()
   {
      return y;
   }

   public double getRadius()
   {
      return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
   }

   public double getAngle()
   {
      return Math.atan(y/x);
   }

   public Point rotate90()
   {
      if (x > 0 && y > 0)
      {
         return new Point(-x, y);
      }
      else if (y > 0 || x > 0)
      {
         return new Point(x, -y);
      }
      else
      {
         return new Point(-x, y);
      }
   }
}
