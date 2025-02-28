import java.time.Year;

public class Calculator {
    int userBirthDate;
    int oneYear = 365;
    int oneMonth = 30;
    int monthsInOneYear = 12;
    int year = Year.now().getValue();

    void algorith(int userBirthDate) {
        this.userBirthDate = userBirthDate;

        int userAge = year - userBirthDate;
        int livedMonths = userAge * monthsInOneYear;
        int livedDays = userAge * oneYear;

        System.out.println("Voce viveu " + userAge + " anos, " + livedMonths + " meses e " + livedDays + " dias");
    }
}
