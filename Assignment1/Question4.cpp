#include <iostream>
#include <cstdlib>
using namespace std;

int main(int argc, char* argv[])
{
    if (argc < 4)
    {
        cout << "Error : Missing command line arguments." << endl;
        return 1;
    }

    int warningLimit = stoi(argv[1]);
    int criticalLimit = stoi(argv[2]);
    int totalReadings = stoi(argv[3]);

    if (warningLimit >= criticalLimit)
    {
        cout << "Error : Warning threshold must be smaller than Critical threshold." << endl;
        return 1;
    }

    if (totalReadings < 1 || totalReadings > 500)
    {
        cout << "Error : Readings count must be between 1 and 500." << endl;
        return 1;
    }

    cout << "Configuration" << endl;
    cout << "Warning = " << warningLimit << " C" << endl;
    cout << "Critical = " << criticalLimit << " C" << endl;
    cout << "Readings = " << totalReadings << endl;

    int normal = 0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;

    for (int i = 0; i < totalReadings; i++)
    {
        int value = rand() % 70;

        if (value <= 29)
        {
            normal++;
        }
        else if (value <= 44)
        {
            warning++;
        }
        else if (value <= 59)
        {
            critical++;
        }
        else
        {
            shutdown++;
        }
    }

    cout << endl;

    cout << "Results" << endl;
    cout << "Normal : " << normal << endl;
    cout << "Warning : " << warning << endl;
    cout << "Critical : " << critical << endl;
    cout << "Shutdown : " << shutdown << endl;

    return 0;
}