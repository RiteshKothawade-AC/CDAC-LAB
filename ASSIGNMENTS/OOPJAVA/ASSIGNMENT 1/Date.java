public class Date {

    private int day;
    private int month;
    private int year;

    public void setDate(int dd, int mm, int yyyy) {

        year = yyyy;

        if(mm < 1 || mm > 12) {
            month = 1;
        }
        else {
            month = mm;
        }

        if(month == 1 || month == 3 || month == 5 || month == 7 ||
           month == 8 || month == 10 || month == 12) {

            if(dd < 1 || dd > 31) {
                day = 1;
            }
            else {
                day = dd;
            }
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11) {

            if(dd < 1 || dd > 30) {
                day = 1;
            }
            else {
                day = dd;
            }
        }
        else if(month == 2) {

            if(year % 4 == 0) {

                if(dd < 1 || dd > 29) {
                    day = 1;
                }
                else {
                    day = dd;
                }
            }
            else {

                if(dd < 1 || dd > 28) {
                    day = 1;
                }
                else {
                    day = dd;
                }
            }
        }
    }

    public void setDays(int ad)
    {
        day = day + ad;

        while(true)
        {
            int daysInMonth = 31;

            if(month == 4 || month == 6 || month == 9 || month == 11)
            {
                daysInMonth = 30;
            }
            else if(month == 2)
            {
                if(year % 4 == 0)
                {
                    daysInMonth = 29;
                }
                else
                {
                    daysInMonth = 28;
                }
            }

            if(day <= daysInMonth)
            {
                break;
            }

            day = day - daysInMonth;
            month++;

            if(month > 12)
            {
                month = 1;
                year++;
            }
        }
    }
    public void setMonth(int admm) {

        int totalMonths = month + admm;

        if(totalMonths > 12) {

            month = totalMonths - 12;
            year++;
        }
        else {
            month = totalMonths;
        }
    }

    public void setYear(int adyyyy) {

        year = year + adyyyy;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}