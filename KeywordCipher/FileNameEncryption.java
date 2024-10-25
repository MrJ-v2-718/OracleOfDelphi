//****************************************************************************
//  Name: MrJ
//  Date: 10/25/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The purpose of this program is to encrypt file/folder names
//  on a computer as an added measure of security.
//****************************************************************************


import java.io.File;

public class FileNameEncryption implements Encryptable {

    /* ---------------------------------------------------------------------------
     *	Class Data:
     *
     *  fullDirectory:   Formatted output which represents the directory structure
     *	directorList[ ]: Array of File objects for the directory structure
     *  isEncrypted:     Indicates whether or not the fullDirectory is encrypted
     * --------------------------------------------------------------------------*/

    private String fullDirectory = "";
    private File directoryList[];
    private boolean isEncrypted;

    /* ---------------------------------------------------------------------------
     *	Array for holding the standard alphabet
     * --------------------------------------------------------------------------*/
    final String[] alphabet = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z", "A", "B", "C", "G",
            "H", "J", "K", "M", "N", "P", "Q", "S", "T", "U",
            "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4",
            "5", "6", "7", "8", "9", "F", "I", "L", "E", "O",
            "D", "R", ":", "[", "]", ".", " ", "\n"};


    /* ---------------------------------------------------------------------------
     *	Array for holding the cipher alphabet
     * --------------------------------------------------------------------------*/
    final String[] cipherAlphabet = {
            "B", "A", "T", "9", "7", "a", "b", "c", "d", "e",
            "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y",
            "z", "C", "G", "H", "J", "K", "M", "N", "P", "Q",
            "S", "U", "V", "W", "X", "Y", "Z", "0", "1", "2",
            "3", "4", "5", "6", "8", "F", "I", "L", "E", "O",
            "D", "R", ":", "[", "]", ".", " ", "\n"};

    /* ---------------------------------------------------------------------------
     *	Class constructor
     *
     *	The directory is validated and then a File array is created if valid.
     *  The createFullDirectory method is called to create the formatted display
     *  of the directory.
     *
     *  Students are not permitted to change this constructor.
     *
     * --------------------------------------------------------------------------*/

    public FileNameEncryption(String path) {

        if (path != null && path != "") {
            File maindir = new File(path);

            if (maindir.exists() && maindir.isDirectory()) {
                directoryList = maindir.listFiles();
                fullDirectory = "";
                createFullDirectory(0);
                isEncrypted = false;
            }
        }
    }


    /* ---------------------------------------------------------------------------
     *	This is to be a RECURSIVE method
     *		Do NOT change the parameters or returned data type
     *
     *  NOTE: Recursion should not be used for files in the structure.
     *        Recursion is only used on the folders in the structure.
     *
     *  Parameters:
     *		directory: A File object which is an array of File objects (files and folders)
     *	    index:     An index for the array
     *
     *  Do not include repetition structures in the method.  Repetition is handled
     *  through recursion.
     * --------------------------------------------------------------------------*/

    private void createFullDirectory(int index) {
        /* ---------------------------------------------------------------------------
         *	First, a temporary string is established with the filename of the current
         *  directoryList index.
         * --------------------------------------------------------------------------*/
        String string = directoryList[index].getName();

        /* ---------------------------------------------------------------------------
         *	Second, an annotation for the file type is added.
         * --------------------------------------------------------------------------*/
        if (directoryList[index].isDirectory()) {
            string = "FOLDER: [" + string + "]";
        } else {
            string = "FILE:   " + string;
        }

        /* ---------------------------------------------------------------------------
         *	Now for the recursion. The base case is defined first, which is if the
         *  last element in the file array is being accessed. If not, the method
         *  calls itself on the next index. Once the base case is reached, all the
         *  method calls tumble down until the first call is reached. The collapse is
         *  kind of like dream state reverse tunneling in the movie Inception.
         * --------------------------------------------------------------------------*/
        if (index == directoryList.length - 1) {
            fullDirectory += (string + "\n");
        } else {
            fullDirectory += (string + "\n");
            createFullDirectory(index + 1);
        }
    }

    /* ---------------------------------------------------------------------------
     *	Accessors for fullDirectory and isEncrypted
     * --------------------------------------------------------------------------*/

    public String getFullDirectory() {
        return fullDirectory;
    }

    public boolean directoryIsEncrypted() {
        return isEncrypted;
    }

    /* ---------------------------------------------------------------------------
     *	encrypt method for fullDirectory
     * --------------------------------------------------------------------------*/

    public void encrypt() {
        String encryptedString = "";
        char c;

        for (int i = 0; i < fullDirectory.length(); i++) {
            c = fullDirectory.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j].equals(String.valueOf(c))) {
                    encryptedString += cipherAlphabet[j];
                }
            }
        }
        fullDirectory = encryptedString + "\n";
        isEncrypted = true;
    }

    /* ---------------------------------------------------------------------------
     *	decrypt method for fullDirectory
     * --------------------------------------------------------------------------*/

    public void decrypt() {
        String decryptedString = "";
        char c;

        for (int i = 0; i < fullDirectory.length(); i++) {
            c = fullDirectory.charAt(i);
            for (int j = 0; j < cipherAlphabet.length; j++) {
                if (cipherAlphabet[j].equals(String.valueOf(c))) {
                    decryptedString += alphabet[j];
                }
            }
        }
        fullDirectory = decryptedString + "\n";
        isEncrypted = false;
    }
}