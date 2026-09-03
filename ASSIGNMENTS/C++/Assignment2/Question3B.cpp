#include<iostream>
using namespace std;

namespace Physics
{
    double clamp(double value,double min,double max)
    {
        if(value < min)
            return min;
        else if(value > max)
            return max;
        else
            return value;
    }

    double lerp(double a,double b,double t)
    {
        return a + t * (b - a);
    }
}

namespace GameMath
{
    int clamp(int value,int min,int max)
    {
        if(value < min)
            return min;
        else if(value > max)
            return max;
        else
            return value;
    }

    double lerp(double a,double b,double t)
    {
        return a + t * (b - a);
    }
}

int main()
{
    using namespace Physics;

    double velocity = clamp(15.5,0.0,10.0);
    cout<<"Clamped Velocity : "<<velocity<<endl;

    double physicsResult = lerp(10,20,0.5);
    cout<<"Physics Lerp : "<<physicsResult<<endl;

    int health = GameMath::clamp(120,0,100);
    cout<<"Clamped Health : "<<health<<endl;

    double animation = GameMath::lerp(0,100,0.25);
    cout<<"GameMath Lerp : "<<animation<<endl;

    return 0;
}