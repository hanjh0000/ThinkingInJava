import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 游戏类
 */
public class AppTO implements Serializable {

    private static final long serialVersionUID = -5906241160379658256L;
    private Long id;

    @Override
    public String toString() {
        return "AppTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;

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
}