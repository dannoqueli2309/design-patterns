package    visitor;

public interface ParteVisitor {
  void visit(Cpu cpu);
  void visit(Periferico periferico);
}
