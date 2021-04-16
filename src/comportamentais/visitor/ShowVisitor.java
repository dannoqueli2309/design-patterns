package    visitor;

public class ShowVisitor implements
    ParteVisitor {

  public void visit(Cpu cpu) {
    System.out.println("Computador...");
  }

  public void visit(Periferico periferico) {
    System.out.println("Periferico" + periferico);
  }

}
