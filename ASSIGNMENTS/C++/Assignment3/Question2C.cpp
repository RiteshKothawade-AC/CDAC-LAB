#include<iostream>
#include<memory>
using namespace std;

class AudioClip{
    string name;
    double radius;

public:

    AudioClip(string name,double radius)
        : name(name),radius(radius)
    {
        cout<<"Audio Loaded"<<endl;
    }

    ~AudioClip(){
        cout<<"Audio Released"<<endl;
    }

    string getName() const{
        return name;
    }

    double getRadius() const{
        return radius;
    }
};

int main(){

    shared_ptr<AudioClip> audio = make_shared<AudioClip>("Explosion",3.5);

    cout<<"Use Count : "<<audio.use_count()<<endl;

    weak_ptr<AudioClip> observer = audio;

    if(auto clip = observer.lock()){
        cout<<"Clip Alive : "
            <<clip->getName()<<endl;
    }

    audio.reset();

    if(observer.expired()){
        cout<<"Observer Expired"<<endl;
    }

    return 0;
}