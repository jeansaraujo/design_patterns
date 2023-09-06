public class PeacefulState implements State {

    private final Mammoth mammoth;
  
    public PeacefulState(Mammoth mammoth) {
      this.mammoth = mammoth;
    }
  
    @Override
    public void observe() {
    //  LOGGER.info("{} is calm and peaceful.", mammoth);
    }
  
    @Override
    public void onEnterState() {
    //  LOGGER.info("{} calms down.", mammoth);
    }
  }

  // referencia https://java-design-patterns.com/patterns/state/#class-diagram