#include <iostream>
using namespace std;

int main()
{
    int statusRegister = 10;
    int controlRegister = 20;
    int dataRegister = 30;

    // Pointer to Constant
    const int* ptr1 = &statusRegister;

    cout << "--- Pointer To Constant ---" << endl;
    cout << "Value = " << *ptr1 << endl;

    ptr1 = &controlRegister;
    cout << "New Value = " << *ptr1 << endl;

    // *ptr1 = 50;
    // Error: Pointer to constant data cannot modify the value.

    cout << endl;

    // Constant Pointer
    int* const ptr2 = &controlRegister;

    cout << "--- Constant Pointer ---" << endl;
    cout << "Value = " << *ptr2 << endl;

    *ptr2 = 100;
    cout << "Updated Value = " << *ptr2 << endl;

    // ptr2 = &statusRegister;
    // Error: Constant pointer cannot point to a new address.

    cout << endl;

    // Constant Pointer to Constant Data
    const int* const ptr3 = &dataRegister;

    cout << "--- Constant Pointer To Constant Data ---" << endl;
    cout << "Value = " << *ptr3 << endl;

    // *ptr3 = 200;
    // Error: Cannot modify value.

    // ptr3 = &statusRegister;
    // Error: Cannot change address.

    return 0;
}