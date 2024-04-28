int main(int argc, char const *argv[])
{
   
int factorial(int n ){
    int factorial =1;
    for (int i=1; i<=n; i++){
      factorial = factorial*i;
    }
    return factorial;
}
int main() {
  int n;
  cin>>n;
  int ans=factorial(n);
  cout<<"factorial of "<<n<<"is "<<ans;
return 0;
  }
   
   


    return 0;
}
