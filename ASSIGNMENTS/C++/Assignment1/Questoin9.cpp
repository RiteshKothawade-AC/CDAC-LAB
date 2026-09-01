#include<iostream>
#include<cmath>
using namespace std;

class Drone
{
public:

    inline double distanceBetween(double x1,double y1,double x2,double y2)
    {
        return sqrt(pow(x2-x1,2)+pow(y2-y1,2));
    }

    inline double toRadians(double degrees)
    {
        return degrees*(M_PI/180.0);
    }

    inline double clampValue(double value,double minVal,double maxVal)
    {
        if(value<minVal)
            return minVal;
        else if(value>maxVal)
            return maxVal;
        else
            return value;
    }

    inline bool isInSafeZone(double x,double y,double cx,double cy,double radius)
    {
        return distanceBetween(x,y,cx,cy)<=radius;
    }
};

int main()
{
    Drone d;

    double homeX=0.0,homeY=0.0;
    double wp1X=10.0,wp1Y=20.0;
    double wp2X=30.0,wp2Y=40.0;
    double wp3X=60.0,wp3Y=10.0;

    double radius=50.0;

    cout<<"Waypoint 1"<<endl;
    cout<<"Distance : "<<d.distanceBetween(homeX,homeY,wp1X,wp1Y)<<endl;
    cout<<"Safe Zone : "<<d.isInSafeZone(wp1X,wp1Y,homeX,homeY,radius)<<endl;

    cout<<endl;

    cout<<"Waypoint 2"<<endl;
    cout<<"Distance : "<<d.distanceBetween(homeX,homeY,wp2X,wp2Y)<<endl;
    cout<<"Safe Zone : "<<d.isInSafeZone(wp2X,wp2Y,homeX,homeY,radius)<<endl;

    cout<<endl;

    cout<<"Waypoint 3"<<endl;
    cout<<"Distance : "<<d.distanceBetween(homeX,homeY,wp3X,wp3Y)<<endl;
    cout<<"Safe Zone : "<<d.isInSafeZone(wp3X,wp3Y,homeX,homeY,radius)<<endl;

    return 0;
}