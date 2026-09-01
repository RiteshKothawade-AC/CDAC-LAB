#include <iostream>
#include <cmath>
using namespace std;

double computeRMS(double* signal, int n)
{
    double sum = 0;

    for(int i = 0; i < n; i++)
    {
        sum += (*(signal + i)) * (*(signal + i));
    }
    return sqrt(sum / n);
}

void normalise(double* signal, int n)
{
    double maxValue = fabs(*signal);

    for(int i = 0; i < n; i++)
    {
        if(fabs(*(signal + i)) > maxValue)
        {
            maxValue = fabs(*(signal + i));
        }
    }

    for(int i = 0; i < n; i++)
    {
        *(signal + i) /= maxValue;
    }
}

int countZeroCrossings(double* signal, int n)
{
    int count = 0;

    for(int i = 1; i < n; i++)
    {
        if((*(signal + i - 1) > 0 && *(signal + i) < 0) ||
           (*(signal + i - 1) < 0 && *(signal + i) > 0))
        {
            count++;
        }
    }

    return count;
}

void applyGain(double* signal, int n, double gainFactor)
{
    for(int i = 0; i < n; i++)
    {
        *(signal + i) *= gainFactor;
    }
}

int main()
{
    int n;

    cout << "Enter signal size: ";
    cin >> n;

    double signal[n];

    cout << "Enter signal values: ";

    for(int i = 0; i < n; i++)
    {
        cin >> signal[i];
    }

    double gainFactor;
    cout << "Enter gain factor: ";
    cin >> gainFactor;

    cout << "\nRMS = " << computeRMS(signal, n) << endl;

    cout << "Zero Crossings = " << countZeroCrossings(signal, n)<< endl;

    cout << "\nBefore Normalisation: ";
    for(int i = 0; i < n; i++)
    {
        cout << signal[i] << " ";
    }

    normalise(signal, n);

    cout << "\nAfter Normalisation: ";

    for(int i = 0; i < n; i++)
    {
        cout << signal[i] << " ";
    }

    cout << "\n\nBefore Gain: ";

    for(int i = 0; i < n; i++)
    {
        cout << signal[i] << " ";
    }

    applyGain(signal, n, gainFactor);

    cout << "\nAfter Gain: ";

    for(int i = 0; i < n; i++)
    {
        cout << signal[i] << " ";
    }

    return 0;
}