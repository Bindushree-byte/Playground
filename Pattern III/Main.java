#include<iostream>
int main()
{
  int n,j;
  std::cin>>n;
  for(int l=1;l<=n;l++)
  {
  for(j=1;j<=l;j++)
  if(j<l)
  {
    std::cout<<l<<"*";
  }
    else
    {
      std::cout<<l<<"\n";
    }
  }
  for(int l=n;l>=0;l--)
  {
    for(j=1;j<=l;j++)
      if(j<l)
      {
        std::cout<<l<<"*";
      }
    else
    {
      std::cout<<l<<"\n";
    }
  }
}

       