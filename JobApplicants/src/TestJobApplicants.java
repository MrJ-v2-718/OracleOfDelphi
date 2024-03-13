import java.util.Scanner;

public class TestJobApplicants {
    public static void main(String[] args) {
        // Instantiate 3 JobApplicant objects
        JobApplicant firstApplicant = getData();
        JobApplicant secondApplicant = getData();
        JobApplicant thirdApplicant = getData();

        boolean qualified1 = isQualified(firstApplicant);
        boolean qualified2 = isQualified(secondApplicant);
        boolean qualified3 = isQualified(thirdApplicant);

        System.out.println();
        System.out.println("Applicants Name: " + firstApplicant.getName());
        System.out.println("Applicants Phone Number: " + firstApplicant.getPhone());
        System.out.println("Applicant Qualified: " + qualified1);
        if (qualified1 == true) {
            System.out.println(firstApplicant.getName() + " is qualified for an interview Phone: " +
                    firstApplicant.getPhone());
        } else {
            System.out.println(firstApplicant.getName() + " is not qualified for an interview at this time Phone: " + firstApplicant.getPhone());
        }
        System.out.println();

        System.out.println();
        System.out.println("Applicants Name: " + secondApplicant.getName());
        System.out.println("Applicants Phone Number: " + secondApplicant.getPhone());
        System.out.println("Applicant Qualified: " + qualified2);
        if (qualified2 == true) {
            System.out.println(secondApplicant.getName() + " is qualified for an interview Phone: " +
                    secondApplicant.getPhone());
        } else {
            System.out.println(secondApplicant.getName() + " is not qualified for an interview at this time Phone: " +
                    secondApplicant.getPhone());
        }
        System.out.println();

        System.out.println();
        System.out.println("Applicants Name: " + thirdApplicant.getName());
        System.out.println("Applicants Phone Number: " + thirdApplicant.getPhone());
        System.out.println("Applicant Qualified: " + qualified3);
        if (qualified3 == true) {
            System.out.println(thirdApplicant.getName() + " is qualified for an interview Phone: " +
                    thirdApplicant.getPhone());
        } else {
            System.out.println(thirdApplicant.getName() + " is not qualified for an interview at this time Phone: " +
                    thirdApplicant.getPhone());
        }
        System.out.println();
    }

    public static JobApplicant getData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Phone Number : ");
        String phoneNumber = input.nextLine();

        System.out.print("Are you proficient with word processing? (1 = y / 2 = n) ");
        int wordChoice = input.nextInt();
        boolean wordSend;
        if (wordChoice == 1) {
            wordSend = true;
        } else {
            wordSend = false;
        }

        System.out.print("Are you proficient with spreadsheets? (1 = y / 2 = n) ");
        int spreadChoice = input.nextInt();
        boolean spreadSend;
        if (spreadChoice == 1) {
            spreadSend = true;
        } else {
            spreadSend = false;
        }

        System.out.print("Are you proficient with databases? (1 = y / 2 = n) ");
        int dataChoice = input.nextInt();
        boolean dataSend;
        if (dataChoice == 1) {
            dataSend = true;
        } else {
            dataSend = false;
        }

        System.out.print("Are you proficient with graphics? (1 = y / 2 = n) ");
        int graphicChoice = input.nextInt();
        boolean graphSend;
        if (graphicChoice == 1) {
            graphSend = true;
        } else {
            graphSend = false;
        }

        return new JobApplicant(name, phoneNumber, wordSend, spreadSend, dataSend, graphSend);
    }

    public static boolean isQualified(JobApplicant applicant) {
        boolean isQual;
        int countQual = 0;
        boolean w = applicant.getHasWordSkill();
        boolean s = applicant.getHasSpreadsheetSkill();
        boolean d = applicant.getHasDatabaseSkill();
        boolean g = applicant.getHasGraphicsSkill();

        if (w == true) {
            countQual += 1;
        }
        if (s == true) {
            countQual += 1;
        }
        if (d == true) {
            countQual += 1;
        }
        if (g == true) {
            countQual += 1;
        }

        if (countQual >= 3) {
            isQual = true;
        } else {
            isQual = false;
        }

        return isQual;
    }
}