package hm_1_1.database;

public class FilialDepartment {

    private Long id;
    private String name;
    private Long serverId;

    public FilialDepartment(Long id, String name, Long serverId) {
        this.id = id;
        this.name = name;
        this.serverId = serverId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    @Override
    public String toString() {
        return "FilialDepartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serverId=" + serverId +
                '}';
    }
}
