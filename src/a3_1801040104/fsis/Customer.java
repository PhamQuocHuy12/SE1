package a3_1801040104.fsis;

import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.AttrRef;
import utils.DOpt;
import utils.OptType;

/**
 * 
 * @author Huy
 * @overview Customer is a person who purchase products
 * @attributes id Integer name String phoneNumber String address String
 * @objects A typical Customer is c = <a, b, c, d>, where id(a), name(b),
 *          phoneNumber(c), address(d)
 * @abstract_properties mutable(id) = false /\ optional(id)= false /\min(id)=1
 *                      /\max(id)=10^9 mutable(name) = true /\ optional(name) =
 *                      false /\length(name)=50 mutable(phoneNumber) = true /\
 *                      optional(phoneNumber)= true /\length(phoneNumber)=10
 *                      mutable(address) = true /\ optional(address) = false /\
 *                      length(address)=100
 */

public class Customer implements Comparable<Object>, Document {
	@DomainConstraint(type = "Integer", mutable = false, optional = false, min = 1, max = 10 ^ 9)
	protected int id;
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 50)
	protected String name;
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 10)
	protected String phoneNumber;
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 100)
	protected String address;

	// Constants
	private static final int MIN_ID = 1;
	private static final int MAX_ID = 1000000000;
	private static final int LENGTH_NAME = 50;
	private static final int LENGTH_PHONENUMBER = 10;
	private static final int LENGTH_ADDRESS = 100;

	// Constructor methods
	/**
	 * @effects if id, name, phoneNumber, address are valid initialize this as <id,
	 *          name, phoneNumber, address> else throw NotPossibleException
	 */
	public Customer(@AttrRef("id") int id, @AttrRef("name") String name, @AttrRef("phoneNumber") String phoneNumber,
			@AttrRef("address") String address) throws NotPossibleException {
		if (validateId(id)) {
			this.id = id;
		} else {
			throw new NotPossibleException("Customer<init>: invalid id: " + id);
		}
		if (validateName(name)) {
			this.name = name;
		} else {
			throw new NotPossibleException("Customer<init>: invalid name: " + name);
		}
		if (validatePhoneNumber(phoneNumber)) {
			this.phoneNumber = phoneNumber;
		} else {
			throw new NotPossibleException("Customer<init>: invalid phoneNumber: " + phoneNumber);
		}
		if (validateAddress(address)) {
			this.address = address;
		} else {
			throw new NotPossibleException("Customer<init>: invalid address: " + address);
		}
	}

	/**
	 * @effects
	 * 
	 *          <pre>
	 *            if name is valid
	 *              set this.name = name
	 *            else
	 *              throws NotPossibleException
	 *          </pre>
	 */
	@DOpt(type = OptType.Mutator)
	@AttrRef("name")
	public void setName(String name) throws NotPossibleException {
		if (validateName(name))
			this.name = name;
		else
			throw new NotPossibleException("Customer.setName: invalid name: " + name);
	}

	/**
	 * @effects
	 * 
	 *          <pre>
	 *            if phoneNumber is valid
	 *              set this.phoneNumber = phoneNumber
	 *            else
	 *              throws NotPossibleException
	 *          </pre>
	 */
	@DOpt(type = OptType.Mutator)
	@AttrRef("phoneNumber")
	public void setPhoneNumber(String phoneNumber) throws NotPossibleException {
		if (validatePhoneNumber(phoneNumber))
			this.phoneNumber = phoneNumber;
		else
			throw new NotPossibleException("Customer.setPhoneNumber: invalid phoneNumber: " + phoneNumber);
	}

	/**
	 * @effects
	 * 
	 *          <pre>
	 *            if address is valid
	 *              set this.address = address
	 *            else
	 *              throws NotPossibleException
	 *          </pre>
	 */
	@DOpt(type = OptType.Mutator)
	@AttrRef("address")
	public void setAddress(String address) throws NotPossibleException {
		if (validateAddress(address))
			this.address = address;
		else
			throw new NotPossibleException("Customer.setAddress: invalid address: " + phoneNumber);
	}

	/**
	 * @effects return id
	 */
	@DOpt(type = OptType.Observer)
	@AttrRef("id")
	public int getId() {
		return id;
	}

	/**
	 * @effects return name
	 */
	@DOpt(type = OptType.Observer)
	@AttrRef("name")
	public String getName() {
		return name;
	}

	/**
	 * @effects return phoneNumber
	 */
	@DOpt(type = OptType.Observer)
	@AttrRef("phoneNumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @effects return address
	 */
	@DOpt(type = OptType.Observer)
	@AttrRef("address")
	public String getAddress() {
		return address;
	}

	/**
	 * @effects if id is valid return true else return false
	 */
	protected boolean validateId(int id) {
		return (id >= MIN_ID && id <= MAX_ID);
	}

	/**
	 * @effects if name is valid return true else return false
	 */
	private boolean validateName(String name) {
		return (name != null && name.length() <= LENGTH_NAME);
	}

	/**
	 * @effects if phoneNUmber is valid return true else return false
	 */
	private boolean validatePhoneNumber(String phoneNumber) {
		return (phoneNumber != null && phoneNumber.length() <= LENGTH_PHONENUMBER);
	}

	/**
	 * @effects if address is valid return true else return false
	 */
	private boolean validateAddress(String address) {
		return (address != null && address.length() <= LENGTH_ADDRESS);
	}

	@Override
	public String toString() {
		return "CUSTOMER:<" + id + "," + name + "," + phoneNumber + "," + address + ">";
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
		return String.format("<html><head><title>Customer:%d-%s</title></head><body>%d %s %s %s</body></html>",
				id, name, id, name, phoneNumber, address);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Customer))
			return false;

		int ID = ((Customer) o).id;
		return ID == id;
	}

	/**
	 * @effects
	 * 
	 *          <pre>
	 *   if this satisfies abstract properties
	 *     return true 
	 *   else
	 *     return false
	 *          </pre>
	 */
	public boolean repOK() {
		return validateId(id) && validatePhoneNumber(phoneNumber) && validateName(name) && validateAddress(address);
	}

	@Override
	public int compareTo(Object o) {
		Comparable that = (Comparable) o;
		String thatName = ((Customer) that).getName();
		if (this.getName().compareTo(thatName) < 0) {
			return -1;
		} else if (this.getName().compareTo(thatName) > 0)
			return 1;
		else
			return 0;
	}
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
