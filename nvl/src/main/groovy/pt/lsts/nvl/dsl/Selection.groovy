package pt.lsts.nvl.dsl;

import java.util.List;
import pt.lsts.nvl.runtime.VehicleRequirements

@DSLClass
final class Selection extends Instruction<Void> {
  double time = 0;
  List<VehicleRequirements> req = [];

  void time (double arg) {
    time = arg;
  }

  void vehicle(@DelegatesTo(strategy=Closure.DELEGATE_ONLY, value=VehicleRequirementsBuilder) Closure cl) {
    req.add new VehicleRequirementsBuilder().buildAndExecute (cl)
  }

  @Override
  public Void execute() {
    println "e " + toString()
  }
}

