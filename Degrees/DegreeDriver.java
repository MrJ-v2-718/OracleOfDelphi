//****************************************************************************
//  Name: MrJ
//  Date: 9/20/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The DegreeDriver class serves as the driver for the AA,
//  AS, and AAS classes. It will utilize the functionality of these classes
//  to instantiate and modify AA, AS, and AAS objects.
//****************************************************************************

public class DegreeDriver {

    public static void main(String[] args) {
        //***********************************************************************************
        //  Instantiation of AA, AS, and AAS Objects
        //***********************************************************************************
        AA AADegree1 = new AA();
        AA AADegree2 = new AA(12, 12, 21, 15);

        AS ASDegree1 = new AS();
        AS ASDegree2 = new AS(12,12,15,"Computer Science",21);

        AAS AASDegree1 = new AAS();
        AAS AASDegree2 = new AAS(12,12,15,"Programming",21);

        //***********************************************************************************
        //  Display of AA, AS, and AAS Objects
        //***********************************************************************************
        System.out.println("\n*********************Instantiated Degrees*********************");
        System.out.println("AADegree1:" + AADegree1 + "\n");
        System.out.println("AADegree2:" + AADegree2+ "\n");

        System.out.println("ASDegree1:" + ASDegree1+ "\n");
        System.out.println("ASDegree2:" + ASDegree2+ "\n");

        System.out.println("AASDegree1:" + AASDegree1+ "\n");
        System.out.println("AASDegree2:" + AASDegree2+ "\n");

        //***********************************************************************************
        // Utilizing Methods From AA, AS, and AAS Objects
        //***********************************************************************************
        System.out.println("*****************Utilizing Methods From Classes*****************");
        System.out.println("\nAADegree1 Before Change:" + AADegree1);
        AADegree1.addFLHours(9);
        System.out.println("\n*****************Added 9 Foreign Language Hours*****************");
        System.out.println("\nAADegree1 After Change:" + AADegree1 + "\n");

        System.out.println("\nAADegree2 Before Change:" + AADegree2);
        AADegree2.addAAHours(6);
        System.out.println("\n************************Added 6 AA Hours************************");
        System.out.println("\nAADegree2 After Change:" + AADegree2 + "\n");

        System.out.println("\nASDegree1 Before Change:" + ASDegree1);
        ASDegree1.addASHours(12);
        System.out.println("\n***********************Added 12 AS Hours************************");
        System.out.println("\nASDegree1 After Change:" + ASDegree1 + "\n");

        System.out.println("\nASDegree2 Before Change:" + ASDegree2);
        ASDegree2.addFocusHours(-525600);
        System.out.println("\n*******************Added -525,600 Focus Hours*******************");
        System.out.println("\nASDegree2 After Change:" + ASDegree2 + "\n");

        System.out.println("\nAASDegree1 Before Change:" + AASDegree1);
        AASDegree1.addCoreHours(12);
        System.out.println("\n********************Added 12 AAS Core Hours*********************");
        System.out.println("\nAASDegree1 After Change:" + AASDegree1 + "\n");

        System.out.println("\nAASDegree2 Before Change:" + AASDegree2);
        AASDegree2.addTrackHours(15);
        System.out.println("\n**********************Added 15 Track Hours**********************");
        System.out.println("\nAASDegree2 After Change:" + AASDegree2 + "\n");
    }
}
