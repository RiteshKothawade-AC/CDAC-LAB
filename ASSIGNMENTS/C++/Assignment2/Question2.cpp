#include<iostream>
using namespace std;

class Patient
{
    int patientId;
    string name;
    int age;
    string ward;
    const string bloodGroup;

public:

    Patient() : bloodGroup("Unknown")
    {
        patientId = 0;
        name = "Unknown";
        age = 0;
        ward = "General";
    }

    Patient(int id,string n) : bloodGroup("Unknown")
    {
        patientId = id;
        name = n;
        age = 0;
        ward = "Emergency";
    }

    Patient(int id,string n,int a,string w,string bg)
        : bloodGroup(bg)
    {
        patientId = id;
        name = n;
        age = a;
        ward = w;
    }

    void displayPatient() const
    {
        cout<<"ID : "<<patientId<<endl;
        cout<<"Name : "<<name<<endl;
        cout<<"Age : "<<age<<endl;
        cout<<"Ward : "<<ward<<endl;
        cout<<"Blood Group : "<<bloodGroup<<endl;
        cout<<endl;
    }

    ~Patient()
    {
        cout<<"Patient "<<name<<" discharged."<<endl;
    }
};

int main()
{
    Patient p1;
    Patient p2(101,"Rahul");
    Patient p3(102,"Amit",25,"ICU","B+");
    Patient p4(103,"Sneha",30,"General","O+");

    Patient* registry[4];

    registry[0] = &p1;
    registry[1] = &p2;
    registry[2] = &p3;
    registry[3] = &p4;

    cout<<"Patient Details"<<endl<<endl;

    for(int i=0;i<4;i++)
    {
        registry[i]->displayPatient();
    }

    return 0;
}