#include <iostream>
 using namespace std;
 class MyClass {
  public:
  
    int x;
  
  private:
  
    int y;  
  
      public:
  
  
    void setY(int s) {
  
      y = s;
  
    }
    
    int gety() {
  
      return y;
  
    }
};

int main() {
  MyClass myObj;
  myObj.x = 25;
  myObj.setY(50);
  cout<< "Este es x = " << myObj.x << endl;
  cout<< "Este es y = " << myObj.gety() << endl;
  return 0;
}
