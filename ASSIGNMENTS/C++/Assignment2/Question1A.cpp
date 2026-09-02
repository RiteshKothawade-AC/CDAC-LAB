#include<iostream>
using namespace std;
class Product
{
int productId;
string name;
double price;
int quantity;

public:

void acceptDetails()
{
    cout<<"Enter ProductId :";
    cin>>productId;

    cout<<"Enter Name of the Product :";
    cin>>name;

    cout<<"Enter Price :";
    cin>>price;

    cout<<"Enter Quantity :";
    cin>>quantity;
}
void displayDetails() const
{
    cout<<productId<<"\t"
        <<name<<"\t"
        <<price<<"\t"
        <<quantity<<"\t"
        <<totalValue()<<endl;
}

double totalValue() const
{
    return price * quantity;
}

bool isLowStock(int threshold) const
{
    return quantity<threshold;
}


};
int main()
{
    
    int maxIndex=0;
    Product products[5];

    for(int i=0;i<5;i++)
    {
        products[i].acceptDetails();
        cout<<endl;
    }

    cout<<"==============Inventory Report==============";
    cout<<"\nID\tName\tPrice\tQuantity\tValue\n";

    for(int i=0;i<5;i++)
    {
        products[i].displayDetails();
    }

    for(int i=0;i<5;i++){
    if(products[i].totalValue()>
    products[maxIndex].totalValue())
    {
        maxIndex=i;
    }
}
    cout<<"\nHighest Value Product\n";
    products[maxIndex].displayDetails();

    cout<<"Total Value : "<<products[maxIndex].totalValue()<<endl;

    cout<<"\nLow Stock Products\n";

    for(int i=0;i<5;i++)
    {
        if(products[i].isLowStock(10))
        {
            products[i].displayDetails();
            cout<<endl;
        }
    }
    return 0;
}
