package pt.lsts.dolphin.dsl

import pt.lsts.dolphin.runtime.tasks.*

@DSLClass
class ChoiceTaskBuilder extends Builder<ChoiceTask> {

  private List<TaskGuard> taskGuards = [] 
  
  def when(Closure<Boolean> test) { 
    [then: { Task task -> taskGuards << new TaskGuard(test,task)} ]
  }
  
  @Override
  public ChoiceTask build() {
    if (taskGuards.empty) {
      Engine.halt 'No choices were defined!'
    }
    new ChoiceTask(taskGuards)
  }
}
