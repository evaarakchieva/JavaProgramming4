package Story2;

import java.util.Objects;

public abstract class Item {
    private final String name;
    private final String material;

    Item(String name, String material) {
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return this.name;
    }

    public String getMaterial() {
        return this.material;
    }




    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && obj.getClass() == this.getClass()) {
            Item thing = (Item)obj;
            return Objects.equals(this.name, thing.name) && Objects.equals(this.material, thing.material);
        } else {
            return false;
        }
    }

    public abstract String toString();

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.material,});
    }
}
