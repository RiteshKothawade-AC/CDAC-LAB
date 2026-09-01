#include <iostream>
using namespace std;

bool parsePacket(const int* packet,int size,int** minPtr,int** maxPtr)
{
    if(size == 0)
    {
        return false;
    }

    int minIndex = 0;
    int maxIndex = 0;

    for(int i = 1; i < size; i++)
    {
        if(packet[i] < packet[minIndex])
        {
            minIndex = i;
        }

        if(packet[i] > packet[maxIndex])
        {
            maxIndex = i;
        }
    }

    *minPtr = (int*)&packet[minIndex];
    *maxPtr = (int*)&packet[maxIndex];

    return true;
}

int main()
{
    int packet[] = {45, 12, 67, 8, 55, 31};

    int* minPtr = nullptr;
    int* maxPtr = nullptr;

   if (parsePacket(packet, 6, &minPtr, &maxPtr)) {
        cout << "Calibration Min : " << *minPtr << endl;
        cout << "Calibration Max : " << *maxPtr << endl;
    }

    return 0;
}