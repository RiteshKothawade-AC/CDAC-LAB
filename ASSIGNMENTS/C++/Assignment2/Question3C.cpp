#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

int main()
{
    int rows, cols;

    cout<<"Enter number of rows: ";
    cin>>rows;

    cout<<"Enter number of columns: ";
    cin>>cols;

    int **map = new int*[rows];
    for(int i=0;i<rows;i++)
    {
        map[i] = new int[cols];
    }

    srand(time(0));
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            map[i][j] = rand()%5;
        }
    }
    cout<<"\n===== GAME MAP ("<<rows<<" x "<<cols<<") =====\n";
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            cout<<map[i][j]<<"\t";
        }
        cout<<endl;
    }

    cout<<"\nLegend: 0=Grass 1=Water 2=Mountain 3=Forest 4=Dungeon\n";
    int grass = 0;
    int water = 0;
    int mountain = 0;
    int forest = 0;
    int dungeon = 0;

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            switch(map[i][j])
            {
                case 0:
                    grass++;
                    break;

                case 1:
                    water++;
                    break;

                case 2:
                    mountain++;
                    break;

                case 3:
                    forest++;
                    break;

                case 4:
                    dungeon++;
                    break;
            }
        }
    }

    cout<<"\nTile Count\n";
    cout<<"Grass    : "<<grass<<endl;
    cout<<"Water    : "<<water<<endl;
    cout<<"Mountain : "<<mountain<<endl;
    cout<<"Forest   : "<<forest<<endl;
    cout<<"Dungeon  : "<<dungeon<<endl;

    for(int i=0;i<rows;i++)
    {
        delete[] map[i];
    }

    delete[] map;

    return 0;
}