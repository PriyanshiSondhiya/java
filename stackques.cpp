// #include <iostream>
// #include<stack>
// using namespace std;
// int main(){

//     stack<string> history;
//    history.push("google.com");
//    history.push("wikipedia.org");
//    history.push("geeksforgeeks.org");

//    cout<<"current page" : <<history.top()<<endl;
//    history.pop();
//    cout<<"back to " <<history.top()<< endl;
//    return 0;
// }

#include<iostream>
#include<queue>
using namespace std;
int main(){

    queue<string> customers;
    customers.push("Alice");
    customers.push("bob");
    customers.push("charlie");
   

   cout<<"servings :"  << customers.front()<<endl;
    customers.pop();
   cout<<"next in line :  " << customers.front()<< endl;
   return 0;
}
