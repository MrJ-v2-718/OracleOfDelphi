//****************************************************************************
//  Name: MrJ
//  Date: 10/18/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The Customer class implements the Encryptable interface and
//  contains the data members customerId, lastName, firstName, emailAddress,
//  userName, bankBalance, and password for each customer. It encrypts the
//  password with the instantiation of each Customer object.
//****************************************************************************


public class Customer implements Encryptable {
    private String customerId;
    private String lastName;
    private String firstName;
    private String emailAddress;
    private String userName;
    private float bankBalance;
    private static String password;

    //-----------------------------------------------------------------
    //  Array for holding the standard alphabet
    //-----------------------------------------------------------------
    private static final String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0",
            "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    //-----------------------------------------------------------------
    //  Array for holding the cipher alphabet
    //-----------------------------------------------------------------
    private static final String[] cipherAlphabet = {"M", "3", "T", "a", "m", "0", "R", "p", "H", "o", "5", "i", "S",
            "d", "f", "g", "h", "U", "V", "W", "X", "q", "r", "s", "t", "u", "L", "4", "N", "O", "P", "Q", "v",
            "w", "x", "1", "2", "e", "6", "7", "A", "B", "C", "8", "9", "b", "c", "y", "z", "D", "E", "F", "G",
            "I", "J", "K", "j", "k", "l", "n", "Y", "Z"};


    //-----------------------------------------------------------------
    //  Constructor: Takes the parameters customerId, lastName,
    //  firstName, emailAddress, userName, bankBalance, and password
    //-----------------------------------------------------------------
    public Customer(String customerId, String lastName, String firstName, String emailAddress,
                    String userName, float bankBalance, String password) {
        this.customerId = customerId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.userName = userName;
        this.bankBalance = bankBalance;
        this.password = password;
        encrypt();
    }

    //-----------------------------------------------------------------
    //  Encrypts the password that was instantiated in the constructor
    //-----------------------------------------------------------------
    public void encrypt() {
        String encryptedPassword = "";
        char c;

        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j].equals(String.valueOf(c))) {
                    encryptedPassword += cipherAlphabet[j];
                }
            }
        }

        password = encryptedPassword;
    }

    //-----------------------------------------------------------------
    //  Decrypts the password and returns the decrypted string
    //-----------------------------------------------------------------
    public String decrypt() {
        String decryptedPassword = "";
        char c;

        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            for (int j = 0; j < cipherAlphabet.length; j++) {
                if (cipherAlphabet[j].equals(String.valueOf(c))) {
                    decryptedPassword += alphabet[j];
                }
            }
        }

        return decryptedPassword;
    }

    //-----------------------------------------------------------------
    //  Secure accessors provided for the relevant information needed
    //  by the CustomerList driver. Mutators are not essential since
    //  the only constructor requires these data members as parameters
    //-----------------------------------------------------------------
    protected String getCustomerId() {
        return customerId;
    }

    protected String getLastName() {
        return lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getPassword() {
        return password;
    }

    //-----------------------------------------------------------------
    //  Returns data that is appropriate from a security standpoint
    //-----------------------------------------------------------------
    public String toString() {
        return "\nName: " + firstName + " " + lastName +
                "\nUsername: " + userName +
                "\nEmail: " + emailAddress +
                "\nBalance: " + bankBalance;
    }
}
