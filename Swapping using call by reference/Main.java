#include<iostream>
int main()
{
  int x,y,t;
  std::cin>>x;
  std::cin>>y;
  std::cout<<"Before swapping"<<" "<<"a= "<<x<<" "<<"and"<<" "<<"b="<<y<<"\n";
  t=x;
  x=y;
  y=t;
  std::cout<<"After swapping"<<" "<<"a= "<<x<<" "<<"and"<<" "<<"b="<<y<<"\n";
  return 0;
}



