package practice;

interface I3{
    public void x();
}
interface I4 extends I3{
    public void z();
}
class InterfaceDemo implements I4{
    public void x(){}
    public void z(){}
}
