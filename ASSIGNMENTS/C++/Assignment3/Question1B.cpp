#include<iostream>
#include<vector>
#include<utility>
#include<string>

using namespace std;

using Header = pair<string,string>;
using HeaderList = vector<Header>;
using Port = unsigned int;
using IPAddress = string;

typedef unsigned long long RequestId;

void printHeaders(const HeaderList& headers)
{
    for(int i=0;i<headers.size();i++)
    {
        cout << headers[i].first << " : "
             << headers[i].second << endl;
    }
}

int main()
{
    HeaderList headers =
    {
        {"Content-Type","application/json"},
        {"Authorization","Bearer eyJhbGci..."},
        {"Accept-Language","en-US"}
    };

    IPAddress ipAddress = "172.168.1.1";
    Port port = 8080;
    RequestId requestId = 78478123;

    cout << "Request ID : " << requestId << endl;
    cout << "IP Address : " << ipAddress << endl;
    cout << "Server Port : " << port << endl;

    cout << "\nHeaders:" << endl;
    printHeaders(headers);

    return 0;
}