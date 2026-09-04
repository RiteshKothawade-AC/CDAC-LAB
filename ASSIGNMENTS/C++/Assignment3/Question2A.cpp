#include<iostream>
#include<memory>
using namespace std;

class Texture{
    string name;
    int width;
    int height;

public:

    Texture(string n,int w,int h){
        name=n;
        width=w;
        height=h;
        cout<<"Texture Loaded"<<endl;
    }

    ~Texture(){
        cout<<"Texture Released"<<endl;
    }

    void display() const{
        cout<<"Name : "<<name<<endl;
        cout<<"Width : "<<width<<endl;
        cout<<"Height : "<<height<<endl;
    }
};

int main(){

    unique_ptr<Texture> tex1 = make_unique<Texture>("PlayerSprite",512,512);

    cout<<"Original Texture"<<endl;
    tex1->display();

    unique_ptr<Texture> tex2 = move(tex1);

    cout<<"\nAfter Transfer"<<endl;

    if(tex1==nullptr){
        cout<<"tex1 is null"<<endl;
    }

    tex2->display();

    return 0;
}