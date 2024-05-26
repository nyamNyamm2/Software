package LSPtest;

public abstract class Lecturer
{
    public Lecturer()
    {
        System.out.println("[리스코프 교체 원칙]\n");
    }
    public String lecturer;
    public int charge = 70000;
    public void Lecturer() {}
}
