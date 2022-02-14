import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
       ArrayList<String> dList = new ArrayList<>();
        for (String token: tokens) {
            if (token.equals(openDel) || token.equals(closeDel))
            {
                dList.add(token);
            }
        }
        return dList;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
       int numOpen = 0;
       int numClose = 0;
        for (int i = 0; i < delimiters.size(); i++) {
            if (delimiters.get(i).equals(openDel))
            {
                numOpen++;
            }
            if (delimiters.get(i).equals(closeDel))
            {
                numClose++;
            }
            if (numOpen < numClose)
            {
                return false;
            }
        }
        return numOpen == numClose;
    }
}