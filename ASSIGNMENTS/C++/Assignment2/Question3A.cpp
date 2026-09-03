#include<iostream>
using namespace std;

class Entity
{
    string name;
    int health;
    int level;
    string type;

public:

    string getName() const
    {
        return name;
    }

    int getHealth() const
    {
        return health;
    }

    int getLevel() const
    {
        return level;
    }

    string getType() const
    {
        return type;
    }

    Entity& setName(const string& n)
    {
        name = n;
        return *this;
    }

    Entity& setHealth(int h)
    {
        health = h;
        return *this;
    }

    Entity& setLevel(int l)
    {
        level = l;
        return *this;
    }

    Entity& setType(const string& t)
    {
        type = t;
        return *this;
    }

    void displayInfo() const
    {
        cout<<"-------------------------"<<endl;
        cout<<"Name   : "<<name<<endl;
        cout<<"Health : "<<health<<endl;
        cout<<"Level  : "<<level<<endl;
        cout<<"Type   : "<<type<<endl;
        cout<<"-------------------------"<<endl;
    }
};

int main()
{
    Entity player, enemy, item;

    player.setName("Hero")
          .setHealth(100)
          .setLevel(10)
          .setType("Player");

    enemy.setName("Goblin")
         .setHealth(60)
         .setLevel(5)
         .setType("Enemy");

    item.setName("Potion")
        .setHealth(0)
        .setLevel(1)
        .setType("Item");

    cout<<"Player Details"<<endl;
    player.displayInfo();

    cout<<"Enemy Details"<<endl;
    enemy.displayInfo();

    cout<<"Item Details"<<endl;
    item.displayInfo();

    return 0;
}