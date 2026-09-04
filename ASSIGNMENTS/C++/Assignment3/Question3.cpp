#include<iostream>
using namespace std;

class LogBuffer{
    char* buffer;
    int capacity;
    int size;
    static int instanceCount;

public:

    char* getBuffer() const{
        return buffer;
    }

    int getCapacity() const{
        return capacity;
    }

    int getSize() const{
        return size;
    }

    static int getInstanceCount(){
        return instanceCount;
    }

    LogBuffer(int capacity)
        : capacity(capacity), size(0), buffer(new char[capacity])
    {
        buffer[0] = '\0';
        instanceCount++;
        cout<<"Constructor with 1 argument called"<<endl;
    }

    LogBuffer(const LogBuffer& other)
        : capacity(other.capacity),
          size(other.size),
          buffer(new char[other.capacity])
    {
        instanceCount++;
        cout<<"Deep Copy Constructor"<<endl;

        for(int i=0;i<size;i++){
            buffer[i] = other.buffer[i];
        }

        buffer[size] = '\0';
    }

    LogBuffer& operator=(const LogBuffer& other)
    {
        cout<<"Copy Assignment Operator"<<endl;

        if(this != &other)
        {
            delete[] buffer;

            capacity = other.capacity;
            size = other.size;

            buffer = new char[capacity];

            for(int i=0;i<size;i++){
                buffer[i] = other.buffer[i];
            }

            buffer[size] = '\0';
        }

        return *this;
    }

    ~LogBuffer()
    {
        delete[] buffer;
        instanceCount--;
        cout<<"Destructor Called"<<endl;
    }

    void append(const char* msg)
    {
        int length = 0;

        while(msg[length] != '\0'){
            length++;
        }

        for(int i=0;i<length && size<capacity-1;i++)
        {
            buffer[size] = msg[i];
            size++;
        }

        buffer[size] = '\0';
    }

    void print() const
    {
        cout<<buffer;
    }

    void clear()
    {
        size = 0;
        buffer[0] = '\0';
    }
};

int LogBuffer::instanceCount = 0;

int main()
{
    LogBuffer log1(256);

    log1.append("Server started on port 8080");
    log1.append(" | Request received from 192.168.1.10");

    cout<<"log1 : ";
    log1.print();
    cout<<endl;

    LogBuffer log2 = log1;

    log2.append(" | Cached response sent");

    cout<<"log1 : ";
    log1.print();
    cout<<endl;

    cout<<"log2 : ";
    log2.print();
    cout<<endl;

    LogBuffer log3(128);

    log3 = log1;

    cout<<"log3 : ";
    log3.print();
    cout<<endl;

    log1 = log1;

    cout<<"Live LogBuffer objects : "<<LogBuffer::getInstanceCount()<<endl;

    return 0;
}