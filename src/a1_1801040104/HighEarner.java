package a1_1801040104;

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
public class HighEarner extends Customer implements Comparable<Object> {
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

