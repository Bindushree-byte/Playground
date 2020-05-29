#include <iostream>
using namespace std;
 struct Employee {
    char name[50];
    int id;
    int age;
    char desig[10];
    int salary;
};
 
int main() 
{
    Employee e;
    cout<<"Enter name:"<<endl;
    cin.getline(e.name, 50);
    cout<<"Enter ID:"<<endl;
    cin>>e.id;
    cout<<"Enter age:"<<endl;
    cin>>e.age;
    cout<<"Enter designation:"<<endl;
    cin>>e.desig;
    cout<<"Enter Salary:"<<endl;
    cin>>e.salary;
    cout<<"Employee Details"<<endl;
    cout<<"Name of the Employee : " << e.name << endl;
    cout<<"ID of the Employee : " << e.id << endl;
    cout<<"Age of the Employee : " << e.age << endl ;
    cout<<"Designation of the Employee : " << e.desig << endl;
    cout<<"Salary of the Employee : "<< e.salary << endl;
    return 0;
}