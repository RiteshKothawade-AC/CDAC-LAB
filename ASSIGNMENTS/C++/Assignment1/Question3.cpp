#include <iostream>
using namespace std;

void findHottestRoom(double temperature[3][3])
{
    double highest = temperature[0][0];
    int floorNo = 1;
    int roomNo = 1;

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (temperature[i][j] > highest)
            {
                highest = temperature[i][j];
                floorNo = i + 1;
                roomNo = j + 1;
            }
        }
    }

    cout << "Hottest Room : Floor "
         << floorNo
         << ", Room "
         << roomNo
         << " -> "
         << highest
         << " C"
         << endl;
}

void findHottestFloor(double temperature[3][3])
{
    double highestAverage = 0;
    int hottestFloor = 1;

    for (int i = 0; i < 3; i++)
    {
        double sum = 0;

        for (int j = 0; j < 3; j++)
        {
            sum += temperature[i][j];
        }

        double average = sum / 3;

        if (i == 0 || average > highestAverage)
        {
            highestAverage = average;
            hottestFloor = i + 1;
        }
    }

    cout << "Hottest Floor : Floor "
         << hottestFloor
         << " (Average "
         << highestAverage
         << " C)"
         << endl;
}

void countWarningRooms(double temperature[3][3])
{
    int count = 0;

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (temperature[i][j] >= 30)
            {
                count++;
            }
        }
    }

    cout << "Rooms at Warning or Above : "
         << count
         << endl;
}

int main()
{
    double temperature[3][3];

    cout << "Enter temperatures for 9 rooms:" << endl;

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cin >> temperature[i][j];
        }
    }

    cout << endl;
    cout << "\tRoom1\tRoom2\tRoom3" << endl;

    for (int i = 0; i < 3; i++)
    {
        cout << "Floor " << i + 1 << "\t";

        for (int j = 0; j < 3; j++)
        {
            cout << temperature[i][j] << "\t";
        }

        cout << endl;
    }

    cout << endl;

    findHottestRoom(temperature);
    findHottestFloor(temperature);
    countWarningRooms(temperature);

    return 0;
}