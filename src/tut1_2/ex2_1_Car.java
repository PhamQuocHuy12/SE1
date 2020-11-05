package tut1_2;

import utils.AttrRef;
import utils.DomainConstraint;

/**
 * @overview Car is a sub-class of Vehicle representing an automobile, motor
 *           car, or car is a wheeled motor vehicle used for transporting
 *           passengers, which also carries its own engine or motor.
 * @abstract_properties
 *    P_Vehicle /\ 
 *    max(weight)=2000 /\
 *    max(seatingCapacity)=7
 * @author dmle
 */
public class ex2_1_Car extends ex2_1_Vehicle {

  private static final double MAX_WEIGHT = 2000;
  private static final double MAX_SEATCAP = 7;
  private static final double MIN_WEIGHT = 1000;
  private static final double MIN_LENGTH = 1.5;
  private static final double MAX_LENGTH = 3.5;

  // constructor methods
  /**
   * @effects <pre>
   *            if n, d, h, l, w, c are valid
   *              initialise this as Car:<n,d,h,l,w,c>
   *            else
   *              print error message
   *          </pre>
   */
  public ex2_1_Car(@AttrRef("name") String n, 
      @AttrRef("width") double d, @AttrRef("height") double h, @AttrRef("length") double l, 
      @AttrRef("weight") double w, @AttrRef("seatingCapacity") int c, @AttrRef("registrationNumber") String r) {
    super(n, d, h, l, w, c, r);
  }

//  @Override
//  public String toString() {
//    return "Car(" + getName() + ")";
//  }
  
  /**
   * @effects <pre>
   *   if r is valid 
   *     return true 
   *   else 
   *     return false</pre> 
   */
  @Override
  protected boolean validateRegistrationNumber(String r) {
    if (r.length() <= 0 || r.length() > 6)
      return false;
    else 
      return true;
  }
  

  /**
   * @effects <pre>
   *            if w is valid 
   *              return true 
   *            else 
   *              return false</pre>
   */
  @Override
  @DomainConstraint(type="Double",min=MAX_WEIGHT, max = MIN_WEIGHT, optional=false)
  protected boolean validateWeight(double w) {
    if (!(super.validateWeight(w)))
      return false;

    if (w > MAX_WEIGHT || w < MIN_WEIGHT)
      return false;
    else
      return true;
  }
  
  /**
   * @effects <pre>
   *   if l is valid 
   *     return true 
   *   else 
   *     return false</pre> 
   */
  @Override
  @DomainConstraint(type="Double",min=MIN_WEIGHT,max = MAX_WEIGHT, optional=false)
  protected boolean validateDimension(double l) {
    // not needed: super.validateDimension(w);
    
    if (l < MIN_LENGTH || l > MAX_LENGTH) 
      return false;
    else // means: w >= MIN_LENGTH -> w > 0
      return true;
  }


  /**
   * @effects <pre>
   *            if c is valid 
   *              return true 
   *            else 
   *              return false</pre>
   */
  @Override
  @DomainConstraint(type="Integer",min=MAX_SEATCAP,optional=false)
  protected boolean validateSeatingCapacity(int c) {
    if (!(super.validateSeatingCapacity(c)))
      return false;

    if (c > MAX_SEATCAP)
      return false;
    else
      return true;
  }
}
