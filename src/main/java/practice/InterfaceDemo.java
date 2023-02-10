package practice;

interface I5{
    public void x();
}
interface I4 extends I5{
    public void z();
}
class InterfaceDemo implements I4{
    public void x(){}
    public void z(){}
}
