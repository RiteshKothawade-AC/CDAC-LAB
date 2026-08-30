#include <iostream>
using namespace std;

void swapValue(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;
}

void swapReference(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}

void swapPointer(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main()
{
    int sensorA, sensorB;

    cout << "Enter two readings: ";
    cin >> sensorA >> sensorB;

    cout << "\n--- Call By Value ---" << endl;
    cout << "Before : A = " << sensorA << " B = " << sensorB << endl;
    swapValue(sensorA, sensorB);
    cout << "After  : A = " << sensorA << " B = " << sensorB << endl;

    cout << "\n--- Call By Reference ---" << endl;
    cout << "Before : A = " << sensorA << " B = " << sensorB << endl;
    swapReference(sensorA, sensorB);
    cout << "After  : A = " << sensorA << " B = " << sensorB << endl;

    cout << "\n--- Call By Pointer ---" << endl;
    cout << "Before : A = " << sensorA << " B = " << sensorB << endl;
    swapPointer(&sensorA, &sensorB);
    cout << "After  : A = " << sensorA << " B = " << sensorB << endl;

    return 0;
}