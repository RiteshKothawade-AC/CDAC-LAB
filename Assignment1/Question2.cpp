#include <iostream>
using namespace std;

int displayReadings(double readings[], int size)
{
    int skipped = 0;

    cout << "Valid Readings : ";

    for (int i = 0; i < size; i++)
    {
        if (readings[i] < 0)
        {
            skipped++;
            continue;
        }

        cout << readings[i] << " ";
    }

    cout << endl;

    return skipped;
}

void findCritical(double readings[], int size)
{
    for (int i = 0; i < size; i++)
    {
        if (readings[i] >= 45)
        {
            cout << "First Critical Reading : Index "
                 << i << " -> "
                 << readings[i] << " C" << endl;
            break;
        }
    }
}

void calculateStatistics(double readings[], int size)
{
    double minimum = readings[0];
    double maximum = readings[0];
    double total = 0;
    int count = 0;

    for (int i = 0; i < size; i++)
    {
        if (readings[i] >= 0)
        {
            if (readings[i] < minimum)
            {
                minimum = readings[i];
            }

            if (readings[i] > maximum)
            {
                maximum = readings[i];
            }

            total += readings[i];
            count++;
        }
    }

    double average = total / count;

    cout << "Minimum : " << minimum << " C"
         << "\tMaximum : " << maximum << " C"
         << "\tAverage : " << average << " C"
         << endl;
}

void countStatus(double readings[], int size)
{
    int normal = 0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;

    for (int i = 0; i < size; i++)
    {
        if (readings[i] >= 0 && readings[i] <= 29)
        {
            normal++;
        }
        else if (readings[i] <= 44)
        {
            warning++;
        }
        else if (readings[i] <= 59)
        {
            critical++;
        }
        else if (readings[i] >= 60)
        {
            shutdown++;
        }
    }

    cout << "Normal : " << normal
         << "\tWarning : " << warning
         << "\tCritical : " << critical
         << "\tShutdown : " << shutdown
         << endl;
}

int main()
{
    int size;

    cout << "Enter number of readings : ";
    cin >> size;

    double readings[size];

    cout << "Enter readings : ";

    for (int i = 0; i < size; i++)
    {
        cin >> readings[i];
    }

    int skippedCount = displayReadings(readings, size);

    cout << "Skipped Errors : " << skippedCount << endl;

    findCritical(readings, size);

    calculateStatistics(readings, size);

    countStatus(readings, size);

    return 0;
}