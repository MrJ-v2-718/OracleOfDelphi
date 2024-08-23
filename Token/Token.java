//************************************************************************
//	Token -- Represents a Token for the Homeless
//
//  Student Name: MrJ
//  Date: 8/23/2024
//  Description of class: This class is used to instantiate Token objects
//  for use with tracking a user's quadrant, providing funds to their user
//  account, and for providing essential alerts.
//	Known issues with code: There are no errors that I have discovered thus far.
//
//************************************************************************

public class Token {

    //***********************************************************************************
    //  Instance variables
    //      ID        firstName    lastName
    //	    quadrant  balance      alerts
    //
    //  STUDENTS:  DO NOT ADD INSTANCE DATA ITEMS.  DECLARE LOCAL VARIABLES WITHIN
    //             METHODS, IF ADDITIONAL VARIABLES ARE NEEDED.
    //***********************************************************************************

    private String ID = "";
    private String firstName = "", lastName = "";
    private int quadrant = 0;
    private double balance = 0.0;
    private boolean alerts[] = {false, false, false};


    //***********************************************************************************
    //  Constructor
    //***********************************************************************************

    public Token(String ID, String firstName, String lastName, int quadrant) {
        //***********************************************************************************
        //  This constructor is called for every instantiated Token object.
        //  It first verifies the length of the ID is 5 characters. If it passes the
        //  verification, the ID is set to the string that is passed to the constructor.
        //  If it does not pass the verification, the ID is set to 99999.
        //  The first name, last name, and quadrant are then set using their corresponding
        //  mutator methods where proper verification of name length and quadrant takes place.
        //  Lastly, the zero balance alert is set to true while the weather and check-in alerts
        //  are set to false using their corresponding mutator methods.
        //***********************************************************************************
        if (ID.length() == 5 && isAllDigits(ID)) {
            this.ID = ID;
        } else {
            this.ID = "99999";
        }
        setFirstName(firstName);
        setLastName(lastName);
        setQuadrant(quadrant);
        this.balance = 0.0;
        setAlert(0);
        clearAlert(1);
        clearAlert(2);
    }


    //***********************************************************************************
    //  Accessors for ID, lastName, firstName, quadrant, balance, alerts
    //***********************************************************************************

    public String getID() {
        //***********************************************************************************
        //  Accessor method that returns the 5-digit ID number
        //***********************************************************************************
        return ID;
    }

    public String getLastName() {
        //***********************************************************************************
        //  Accessor method that returns the last name
        //***********************************************************************************
        return lastName;
    }

    public String getFirstName() {
        //***********************************************************************************
        //  Accessor method that returns the first name
        //***********************************************************************************
        return firstName;
    }

    public int getQuadrant() {
        //***********************************************************************************
        //  Accessor method that returns the quadrant
        //***********************************************************************************
        return quadrant;
    }

    public double getBalance() {
        //***********************************************************************************
        //  Accessor method that returns the balance
        //***********************************************************************************
        return balance;
    }

    public boolean getAlert(int singleAlert) {
        //***********************************************************************************
        //  Accessor method that returns the value for a single alert
        //***********************************************************************************
        return alerts[singleAlert];
    }

    //***********************************************************************************
    //  Mutators for lastName, firstName, and quadrant
    //***********************************************************************************

    public void setLastName(String lastName) {
        //***********************************************************************************
        //  Mutator method that sets the last name to the passed string if its length is greater
        //  than zero. If not, the last name is set to ""
        //***********************************************************************************
        if (lastName.length() > 0) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }

    public void setFirstName(String firstName) {
        //***********************************************************************************
        //  Mutator method that sets the first name to the passed string if its length is greater
        //  than zero. If not, the first name is set to ""
        //***********************************************************************************
        if (firstName.length() > 0) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }

    public void setQuadrant(int quadrant) {
        //***********************************************************************************
        //  Mutator method that sets the quadrant if it falls in the valid range. (1 - 15)
        //  If not, the quadrant is set to 0.
        //***********************************************************************************
        if (1 <= quadrant && quadrant <= 15) {
            this.quadrant = quadrant;
        } else {
            this.quadrant = 0;
        }
    }


    //***********************************************************************************
    //  Helping methods
    //***********************************************************************************
    public boolean addToBalance(double donation) {
        //***********************************************************************************
        //  Mutator method that adds to a user's balance if the amount is larger than zero.
        //  After the amount is added, the zero balance alert is set to false.
        //  If validation fails, the method returns false without updating balance.
        //***********************************************************************************
        if (donation > 0) {
            this.balance += donation;
            if (balance > 0) {
                clearAlert(0);
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean buyItem(double purchaseAmount) {
        //***********************************************************************************
        //  Mutator method that allows purchases to be made using the Token. If the purchase
        //  amount is greater than zero and the user currently has the amount required, then
        //  it passes validation and is subtracted from the balance. If the balance is zero
        //  after the transaction, the zero balance alert is set to true. If the purchase
        //  amount fails validation, the method returns false without updating the balance.
        //***********************************************************************************
        if (purchaseAmount > 0) {
            if (balance >= purchaseAmount) {
                this.balance -= purchaseAmount;
            }

            if (balance == 0) {
                setAlert(0);
            }
            return true;
        } else {
            return false;
        }
    }

    public void setAlert(int singleAlert) {
        //***********************************************************************************
        //  Mutator method that sets a single alert to true if it falls in the
        //  valid range. (0 - 2) There is additional validation for the zero balance
        //  alert, to ensure the balance is actually zero. If the alert fails either
        //  validation, it returns nothing and doesn't update the alerts array.
        //***********************************************************************************
        if (singleAlert >= 0 && singleAlert <= 2) {
            if (singleAlert == 0) {
                if (balance != 0) {
                    return;
                }
            }
            this.alerts[singleAlert] = true;
        }
    }

    public void clearAlert(int singleAlert) {
        //***********************************************************************************
        //  Mutator method that sets a single alert to false if it falls in the
        //  valid range. (0 - 2) There is additional validation for the zero balance
        //  alert, to ensure the balance is not zero. If the alert fails either
        //  validation, it returns nothing and doesn't update the alerts array.
        //***********************************************************************************
        if (singleAlert >= 0 && singleAlert <= 2) {
            if (singleAlert == 0) {
                if (balance == 0) {
                    return;
                }
            }
            this.alerts[singleAlert] = false;
        }
    }

    public boolean isAllDigits(String testString) {
        /*------------------------------------------------------------------------------
         *  isAllDigits() verifies that each character in a string is a numeric digit
         *
         *  The method returns a true value if all characters are digits and returns
         *  a false value if any of the characters is not a digit.
         * ----------------------------------------------------------------------------*/

        char[] testStringAsChar = testString.toCharArray();
        for (char c : testStringAsChar) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }


    //***********************************************************************************
    //  toString() Method returns a String (DOES NOT DISPLAY ANYTHING)
    //
    //  The string returned should contain all of the instance data items in a pleasing
    //  format.
    //***********************************************************************************

    public String toString() {
        //***********************************************************************************
        //  Method that returns a string of the instance data in a format that looks nice.
        //***********************************************************************************
        String phrase;

        phrase = "ID: " + ID + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Quadrant: " + quadrant + "\n" +
                "Balance: $" + balance + "\n" +
                "Zero Balance Alert: " + alerts[0] + "\n" +
                "Weather Alert: " + alerts[1] + "\n" +
                "Check-In Alert: " + alerts[2] + "\n";

        return phrase;
    }
}
