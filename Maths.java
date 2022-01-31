import android.content.Context;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.ComponentCategory;
import java.lang.Math;

@DesignerComponent(version = 1,  description = "Use simple and Advanced Mathematics.",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,   iconName = "https://i.ibb.co/k6zsc6t/Ruthenium-Alpha-Logo.png")
@SimpleObject(external = true)
public class Maths extends AndroidNonvisibleComponent {
    private ComponentContainer container;
    /**
     * @param container container, component will be placed in
     */
    public Maths(ComponentContainer container) {
        super(container.$form());
        this.container = container;
    }
  
    @SimpleFunction(description = "Use Arithemetics. + for Adddition, - for Subtraction, * for Multiplication, / for Division.")
    public double Arithemetics(double x, String operator, double y) {
      if (operator == "+"){
        return x + y;
      } else if (operator == "-") {
        return x - y;
      } else if (operator == "*") {
        return x * y;
      } else if (operator == "/") {
        return x / y;
      } else {
        return 0;
      }
    }
  
    @SimpleFunction(description = "Returns the absolute value of num")
    public double Absolute(double num) {
      return Math.abs(num);
    }
  
    @SimpleFunction(description = "Returns the arccosine of num, in radians")
    public double ArccosineRad(double num) {
      return Math.acos(num);
    }
  
    @SimpleFunction(description = "Returns the arcsine of num, in radians")
    public double ArcsineRad(double num) {
      return Math.asin(num);
    }
  
    @SimpleFunction(description = "Returns the arctangent of num as a numeric value between -PI/2 and PI/2 radians")
    public double ArctangentRad(double num) {
      return Math.atan(num);
    }
  
    @SimpleFunction(description = "Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta)")
    public double AngleThetaRectanCoord(int x, int y) {
      return Math.atan2(y, x);
    }
  
    @SimpleFunction(description = "Returns the cube root of num")
    public double CubeRoot(double num) {
      return Math.cbrt(num);
    }
  
    @SimpleFunction(description = "Returns the value of num rounded up to its nearest integer")
    public double Ceil(double num) {
      return Math.ceil(num);
    }
  
    @SimpleFunction(description = "Returns the first floating point num with the sign of the second floating point y")
    public double CopySign(double x, double y) {
      return Math.copySign(x, y);
    }
  
    @SimpleFunction(description = "Returns the cosine of num (num is in radians)")
    public double Cosine(double num) {
      return Math.cos(num);
    }
  
    @SimpleFunction(description = "Returns the hyperbolic cosine of a double value")
    public double HyperbolicCosine(double num) {
      return Math.cosh(num);
    }
  
    @SimpleFunction(description = "Returns the value of num rounded down to its nearest integer")
    public double Floor(double num) {
      return Math.floor(num);
    }
  
    @SimpleFunction(description = "Returns sqrt(x^2 +y^2) without intermediate overflow or underflow")
    public int Hypot(int x, int y) {
      return (int) Math.hypot(x, y);
    }
  
    @SimpleFunction(description = "Returns the natural logarithm (base E) of num")
    public double Log(double num) {
      return Math.log(num);
    }
  
    @SimpleFunction(description = "Returns the log 10 of num")
    public double Log10(double num) {
      return Math.log10(num);
    }
  
    @SimpleFunction(description = "Returns the number with the highest value")
    public double Max(double x, double y) {
      return Math.max(x, y);
    }
  
    @SimpleFunction(description = "Returns the number with the lowest value")
    public double Min(double x, double y) {
      return Math.min(x, y);
    }
  
    @SimpleFunction(description = "Returns the value of x to the power of y")
    public double Power(int x, int y) {
      return Math.pow(x, y);
    }
  
    @SimpleFunction(description = "Returns a random number between 0 and 1")
    public double Random0to1() {
      return Math.random();
    }
  
    @SimpleFunction(description = "Returns the value of num rounded to its nearest integer")
    public int Round(double num) {
      return (int) Math.round(num);
    }
  
    @SimpleFunction(description = "Returns the sine of num (num is in radians)")
    public double Sine(double num) {
      return Math.sin(num);
    }
  
    @SimpleFunction(description = "Returns the square root of num")
    public double SquareRoot(double num) {
      return Math.sqrt(num);
    }
  
    @SimpleFunction(description = "Returns the tangent of an angle")
    public double Tangent(double num) {
      return Math.tan(num);
    }
  
    @SimpleFunction(description = "Returns the hyperbolic tangent of a double value")
    public double HyperbolicTangent(double num) {
      return Math.tanh(num);
    }
  
    @SimpleFunction(description = "Converts Radians to Degrees and vise versa. Rad - Radians, Deg - Degrees. If the from-to is not given properly it will return 0.")
    public double Convert(double num, String from, String to) {
      if (from == "Rad" && to == "Deg") {
        return Math.toDegrees(num);
      } else if (from == "Deg" && to == "Rad") {
        return Math.toRadians(num);
      } else {
        return 0;
      }
    }
  
}
