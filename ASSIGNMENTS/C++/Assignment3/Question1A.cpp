#include<iostream>
using namespace std;

using Endpoint = string;

enum class HttpStatus
{
    OK = 200,
    Created = 201,
    BadRequest = 400,
    Unauthorized = 401,
    NotFound = 404,
    ServerError = 500
};

void handleResponse(HttpStatus status,const Endpoint& endpoint)
{
    int code = static_cast<int>(status);

    cout << endpoint << endl;

    switch(code)
    {
        case 200:
            cout << code << " OK : Request successful" << endl;
            break;

        case 201:
            cout << code << " Created : Resource created successfully" << endl;
            break;

        case 400:
            cout << code << " Bad Request : Invalid request format" << endl;
            break;

        case 401:
            cout << code << " Unauthorized : Authentication required" << endl;
            break;

        case 404:
            cout << code << " Not Found : Endpoint does not exist" << endl;
            break;

        case 500:
            cout << code << " Server Error : Internal server error" << endl;
            break;
    }

    cout << endl;
}

int main()
{
    handleResponse(HttpStatus::OK,"[GET /api/users]");

    handleResponse(HttpStatus::Created,"[POST /api/users]");

    handleResponse(HttpStatus::Unauthorized,"[POST /api/login]");

    handleResponse(HttpStatus::NotFound,"[GET /api/users/999]");

    handleResponse(HttpStatus::ServerError,"[GET /api/server]");

    return 0;
}