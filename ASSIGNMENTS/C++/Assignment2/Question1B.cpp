#include<iostream>
using namespace std;
#include<iostream>
using namespace std;

double reorderCost(int qty,double unitPrice)
{
    return qty * unitPrice;
}

double reorderCost(double weightKg,double pricePerKg)
{
    return weightKg * pricePerKg;
}

double reorderCost(int qty,double unitPrice,double taxRate)
{
    double cost = qty * unitPrice;
    return cost + (cost * taxRate / 100);
}

double applyDiscount(double price,double discountPercent=10)
{
    return price - (price * discountPercent / 100);
}

int main()
{
    cout<<"Reorder Cost (Qty) : "
        <<reorderCost(10,50.0)<<endl;

    cout<<"Reorder Cost (Weight) : "
        <<reorderCost(2.5,100.0)<<endl;

    cout<<"Reorder Cost (With Tax) : "
        <<reorderCost(10,50.0,18.0)<<endl;

    cout<<"Price after Default Discount : "
        <<applyDiscount(1000)<<endl;

    cout<<"Price after 20% Discount : "
        <<applyDiscount(1000,20)<<endl;

    return 0;
}