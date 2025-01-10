package LldProblems.EventBusWithRetry.model;

public class Entity {

  private final EntityId EntityId;
  private final String name;
  private final String ipAddress;

  public Entity(EntityId EntityId, String name, String ipAddress) {
    this.EntityId = EntityId;
    this.name = name;
    this.ipAddress = ipAddress;
  }
}
