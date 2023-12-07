import java.util.Objects;

public class User implements Cloneable {

    String name;

    String password;

    String id;

    public User() {
    }

    public User(String name, String password, String id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(password, user.password) && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, id);
    }


    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public User deepClone() throws CloneNotSupportedException {
        User cloned = (User) super.clone();
        cloned.id = String.valueOf(this.clone());
        return cloned;
    }
}
