#include <iostream>
using namespace std;

int getStatusCode(double temperature)
{
    if (temperature < 0)
    {
        return -1;
    }
    else if (temperature <= 29)
    {
        return 0;
    }
    else if (temperature <= 44)
    {
        return 1;
    }
    else if (temperature <= 59)
    {
        return 2;
    }
    else
    {
        return 3;
    }
}

void showStatus(int code)
{
    switch (code)
    {
        case -1:
            cout << "Status : SENSOR_ERROR" << endl;
            cout << "Action : Check sensor connection" << endl;
            break;

        case 0:
            cout << "Status : NORMAL" << endl;
            cout << "Action : System operating normally" << endl;
            break;

        case 1:
            cout << "Status : WARNING" << endl;
            cout << "Action : Supervisor alerted" << endl;
            break;

        case 2:
            cout << "Status : CRITICAL" << endl;
            cout << "Action : Cooling system activated" << endl;
            break;

        default:
            cout << "Status : SHUTDOWN" << endl;
            cout << "Action : Emergency shutdown started" << endl;
            break;
    }
}

int main()
{
    double temperature;

    cout << "Enter temperature reading: ";
    cin >> temperature;

    double fahrenheit = (temperature * 9 / 5) + 32;

    cout << "Temperature : "
         << temperature << " C  "
         << fahrenheit << " F" << endl;

    int status = getStatusCode(temperature);

    showStatus(status);

    (temperature>25)?cout<< "Reading: Above Average" : cout<< "Reading: Below Average" << endl;

    return 0;
}
