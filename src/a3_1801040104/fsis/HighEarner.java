package a3_1801040104.fsis;

import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.AttrRef;
import utils.DOpt;
import utils.OptType;
/**
 *  @overview HighEarner is customer that is of interest to the
 *   shop, while the latter represents wealthy customer whose income
 *   is above a given threshold
 *  @attributes
 *  	income float
 *  @abstract_properties
 *  	mutable(income) = true /\ optional(income)= false /\ min(income) = 10000000 /\
 *  	min(id) = 10000000
 */
public class HighEarner extends Customer {
	private static final int MIN_ID=10000000;

	@DomainConstraint(type="Float", mutable = true, optional= false, min = 10000000)
	private float income;
// Constructor methods
/**
 * @effects 
 * 	if a, b, c, d, income are valid
 * 		initialize this as HighEarner:<a,b,c,d,income>
 * 	else
 * 		throw NotPossibleException
 */
	public HighEarner(@AttrRef("id") int id,
			@AttrRef("name") String name,
			@AttrRef("phoneNumber") String phoneNumber,
			@AttrRef("address") String address,
			@AttrRef("income") float income)
			throws NotPossibleException{
		super(id, name, phoneNumber, address);
		if (validateIncome(income)) {
		      this.income = income;
		    } else {
		      throw new NotPossibleException("Customer<init>: invalid income: " + income);
		    }
	}
	 /**
	   * @effects <pre>
	   *            if income is valid
	   *              set this.income = income
	   *            else
	   *              throws NotPossibleException</pre>
	   */
	@DOpt(type=OptType.Mutator) @AttrRef("income")
	public void setIncome(float income) throws NotPossibleException {
	    if (validateIncome(income))
	      this.income = income;
	    else
	      throw new NotPossibleException("Customer.setIncome: invalid income: " + income);
	  }
	/**
	   * @effects return <tt>this.income</tt>
	   */
	public float getIncome() {
		return income;
	}
	/**
	   * @effects <pre>
	   *            if income is valid 
	   *              return true 
	   *            else 
	   *              return false</pre> 
	   */
	@DomainConstraint(type="Float",min=10000000)
	private boolean  validateIncome(float income) {
		if (income>=10000000) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
     * @effect
     *      return a text of a simple HTML document
     *      generated from the information of the current Customer
     *      e.g. Customer:<4, "John", "12345678", "Hanoi"> invoke toHtmlDoc()
     *      -> output:
     *      <html>
     *          <head><title>Customer:4-John</title></head>
     *          <body>
     *              4 John 12345678 Hanoi
     *          </body>
     *      </html>
     */
	@Override
	public String toHtmlDoc () {
		return String.format("<html><head><title>Customer:%d-%s</title></head><body>%d %s %s %s %f</body></html>",
				super.id, super.name, super.id, super.name, super.phoneNumber, super.address,income);
	}
	/**
	   * @effects <pre>
	   *            if id is valid 
	   *              return true 
	   *            else 
	   *              return false</pre> 
	   */
	@Override
	@DomainConstraint(type="Integer",min=MIN_ID)
	protected boolean validateId(int id) {
		if( id >= MIN_ID) {
			return true;
		} else {
			return false;
		}
	}
}

