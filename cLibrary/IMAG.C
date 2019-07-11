#include <iostream.h>
#include <complex.h>
void main()
{
complex z;
z=complex(1.1,2.2);
cout << "complex number : " << z << endl;
cout << "real number : " << real(z) << endl;
cout << "image number : " << imag(z) << endl;
}