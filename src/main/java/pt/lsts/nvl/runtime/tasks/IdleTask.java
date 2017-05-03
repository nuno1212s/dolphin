package pt.lsts.nvl.runtime.tasks;


import java.util.List;
import java.util.Map;

import pt.lsts.nvl.runtime.NVLVehicle;
import pt.lsts.nvl.runtime.VehicleRequirements;
import static pt.lsts.nvl.util.Debug.d;

public class IdleTask implements Task {

  private final String id;
  
  public IdleTask(String id) {
    this.id = id;
  }
  
  @Override
  public String getId() {
    return id;
  }

  
  @Override
  public boolean allocate(List<NVLVehicle> available, Map<Task, List<NVLVehicle>> allocation) {
    return true;
  }
  
  @Override
  public TaskExecutor getExecutor() {
    return new TaskExecutor(this) {

      @Override
      protected void onInitialize(Map<Task,List<NVLVehicle>> allocation) {
        d("Initialized " + getId());     
      }

      @Override
      protected void onStart() {
        d("Started " + getId());
      }

      @Override
      protected CompletionState onStep() {
        return new CompletionState(CompletionState.Type.IN_PROGRESS);
      }

      @Override
      protected void onCompletion() {
        d("Completed " + getId());     
      }
      
    };
  }




}