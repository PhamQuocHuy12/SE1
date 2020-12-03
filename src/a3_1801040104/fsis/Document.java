package a3_1801040104.fsis;
/**
 * 
 * @author Huy
 * @overview
 * An interface can reads objects as HTML 
 */
public interface Document {
	/**
     * @effect
     *      return a text of a simple HTML document
     *      generated from the state of the current object
     *      e.g. Customer:<4, "John", "12345678", "Hanoi"> invoke toHtmlDoc()
     *      -> output:
     *      <html>
     *          <head><title>Customer:4-John</title></head>
     *          <body>
     *              4 John 12345678 Hanoi
     *          </body>
     *      </html>
     */
    public String toHtmlDoc();
}
